import java.util.Scanner;
import ansi_terminal.*;
public class Game {

	public static void game() {
		Scanner input = new Scanner(System.in);
		System.out.print("What is your name?/n/r");
		String name = input.next();
		Player player = new Player(name,100);
		Enemy enemy1 = new Enemy(100, 100, 25, enemy1, 18, 18);
		boolean done = false;
		int enemymover = 1;
		while(!done){
			Map.displayMap(player.getYcord(), player.getXcord());
			Map.displayInfo();
			
			Key key = Terminal.getKey();
			switch(key){
				case ESCAPE:
					done = true;
					break;
				case LEFT:
					player.setxCord(player.getXcord() - 1);
					break;
				case RIGHT:
					player.setxCord(player.getXcord() + 1);
					break;
				case UP:
					player.setyCord(player.getYcord() - 1);
					break;
				case DOWN:
					player.setyCord(player.getYcord() + 1);
					break;		
				case P:
					
					break;
					
			}
			if(enemymover%13 = 1){
				enemy1.moveLocation(enemy1.getX()-1		
			
		}

}}
