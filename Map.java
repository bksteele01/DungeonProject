import ansi_terminal.*;
public class Map{
        public static String[] grid = {
                "############                              ############################",
                "#          #                              #                   ########",
                "#          #                           ####                   #       ",
                "#          #                           #                      #       ",
                "#          #                           #   ####               #       ",
                "#          #              ##############   #  #               #       ",
                "####   #####              #                ## #               #       ",
                "   #   #                  #                 # #               #       ",
                "   #   #                  #                 # #               #       ",
                "   #   ##########         #   ############### #               #       ",
                "   #            #         #   #               #############   #       ",
                "   #            #         #   #                           #   #       ",
                "   #            #         #   #                           #   #       ",
                "   ########   #############   ######                      #   #       ",
                "          #                        #                      #   #       ",
                "          #                        #                      #   #       ",
                "          #                        #                      #   #       ",
                "          #                        ########################   #       ",
                "          #                                                   #       ",
                "          #                                                   #       ",
                "          #                                                   #       ",
                "          #                        ############   #############       ",
                "          ####   ###################          #   #                   ",
                "             #   #      ########              #   #                   ",
                "             #   ########      #              #   #                   ",
                "             #                 #              #   #                   ",
                "             #                 #              #   #                   ",
                "             #   ########      #              #   #                   ",
                "   ###########   #      ########              #   #######             ",
                "   #             #                            #         #             ",
                "   #             #                            #         #             ",
                "   #             #                            #         #             ",
                "   #             #                            #####   ################",
                "   #             #                                #                  #",
                "   #   ###########                                #                  #",
                "   #   #                                          #                  #",
                "   #   ############################################                  #",
                "   #                                                                 #",
                "   #                                                                 #",
                "   ###################################################################"
		};	

	public static void displayMap(int row, int column, int rowe, int columne, int rowe2, int columne2){
                Terminal.clear();
                for(int looprow = 0;looprow < 40;looprow++){
                        for(int loopcolumn = 0;loopcolumn < 70;loopcolumn++){
                                if(looprow == row && loopcolumn == column || looprow == rowe && loopcolumn == columne || looprow == rowe2 && loopcolumn == columne2){
                                        Terminal.setForeground(Color.RED);
                                        System.out.print("&");
                                        Terminal.reset();
                                }else{
                                        char piece = grid[looprow].charAt(loopcolumn);
                                        if(piece == '#'){
                                                System.out.print('\u2588');
                                        }else{
                                                System.out.print(piece);
                                        }

                                }

                        }
                        System.out.print("\n\r");
                }


        }
        public static void displayInfo(){
                Terminal.setForeground(Color.RED);
                Terminal.warpCursor(1, 72);
                System.out.print("Controls:");
                Terminal.warpCursor(2, 75);
                System.out.print("Movement: arrow keys");
                Terminal.warpCursor(3, 75);
                System.out.print("Attack: walk into monster");
                Terminal.warpCursor(4, 75);
                System.out.print("Pickup: p");
                Terminal.warpCursor(40, 0);
                Terminal.reset();
}
}   
