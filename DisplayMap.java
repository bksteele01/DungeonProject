import ansi_terminal.*;
public class DisplayMap{
	private static String[] grid = {
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
	public static void displayMap(int row, int column){
		Terminal.clear();
		for(int looprow = 0;looprow < 40;looprow++){
			for(int loopcolumn = 0;loopcolumn < 70;loopcolumn++){
				if(looprow == row && loopcolumn == column){
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

}
