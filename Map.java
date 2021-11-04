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
                "   #   #                  #                 # #         b     #       ",
                "   #   #                  #                 # #               #       ",
                "   #   ##########         #   ############### #               #       ",
                "   #            #         #   #               #############   #       ",
                "   #            #         #   #                           #   #       ",
                "   #            #         #   #                           #   #       ",
                "   ########   #############   ######                      #   #       ",
                "          #                        #                      #   #       ",
                "          #                        #                      #   #       ",
                "          #                     h  #                      #   #       ",
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
                "   #         s   #                            #####   ################",
                "   #             #                                #                  #",
                "   #   ###########                                #                  #",
                "   #   #                                          #        c         #",
                "   #   ############################################                  #",
                "   #                                                                 #",
                "   #                                                                 #",
                "   ###################################################################"
		};	

	public static void displayMap(int row, int column, int rowe, int columne, int rowe2, int columne2){
                if(grid[row].charAt(column) == 'h'){
                        Terminal.warpCursor(10,75);
                        System.out.print("Helmet");

                        System.out.print("Helmet: 5, 50, 10");

                        Terminal.pause(1);
                }
		if(grid[row].charAt(column) == 's'){
                        Terminal.warpCursor(10,75);
                        System.out.print("Iron Sword: 8, 50, 15");
                        Terminal.pause(1);
                 }
		if(grid[row].charAt(column) == 'c'){
                        Terminal.warpCursor(10,75);
                        System.out.print("Bronze Chestplate: 10, 70, 15");
                        Terminal.pause(1);
                 }
		if(grid[row].charAt(column) == 'b'){
                        Terminal.warpCursor(10,75);
                        System.out.print("Bow/Quiver: 3, 45, 15");
                        Terminal.pause(1);
                 }
		Terminal.clear();
                for(int looprow = 0;looprow < 40;looprow++){
                        for(int loopcolumn = 0;loopcolumn < 70;loopcolumn++){
				if(looprow == row && loopcolumn == column || looprow == rowe && loopcolumn == columne || looprow == rowe2 && loopcolumn ==                                   columne2){
                                        Terminal.setForeground(Color.RED);
                                        System.out.print("&");
                                        Terminal.reset();
					
                                }else{
				if(grid[looprow].charAt(loopcolumn) == 'c' || grid[looprow].charAt(loopcolumn) == 'h' || grid[looprow].charAt(loopcolumn) ==                                 's' || grid[looprow].charAt(loopcolumn) == 'b'){
                                        char piece = grid[looprow].charAt(loopcolumn);
					if(piece == 'h'){ 
						Terminal.setForeground(Color.RED);
						System.out.print("h");
                                        }
					if(piece == 's'){
						Terminal.setForeground(Color.RED);
                                                System.out.print("s");
                                        }
					if(piece == 'c'){
						Terminal.setForeground(Color.RED);	
                                                System.out.print("c");
                                        }
					if(piece == 'b'){
						Terminal.setForeground(Color.RED);
                                                System.out.print("b");
                                        }
                                }
				if(grid[looprow].charAt(loopcolumn) == ' ' || grid[looprow].charAt(loopcolumn) == '#'){
					char piece = grid[looprow].charAt(loopcolumn);
					if(piece == '#'){
                                                Terminal.setForeground(Color.WHITE);
                                                System.out.print('\u2588');
                                     	}
                                        if(piece == ' '){
                                                System.out.print(piece);
                                        }
				}
			}
		}
               	System.out.print("\n\r");
	}
}

        
        public static void displayInfo(){
                Terminal.setForeground(Color.RED);
                Terminal.warpCursor(1, 72);
                System.out.print("controls:");
                Terminal.warpCursor(2, 75);
                System.out.print("running into a monster will initiate battle!");
                Terminal.warpCursor(3, 75);
		System.out.print("letters around the map are collectable objects");
		Terminal.warpCursor(4, 75);
                System.out.print("movement: arrowkeys");
                Terminal.warpCursor(5, 75);
                System.out.print("pickup object: p");
                Terminal.warpCursor(6, 75);
		System.out.print("print inventory: q");
		Terminal.warpCursor(7, 75);
		System.out.print("equip weapon: w");
		Terminal.warpCursor(8, 75);
		System.out.print("equip armor: a");
		Terminal.warpCursor(9, 75);
		System.out.print("Player/Enemy: &");
		Terminal.warpCursor(10, 75);
		System.out.print("End game: esc");
		Terminal.warpCursor(40, 0);
                Terminal.reset();
		
}
}   
