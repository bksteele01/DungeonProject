import java.util.Scanner;
import ansi_terminal.*;
public class Game {

	public static void game() {
		Scanner input = new Scanner(System.in);
		System.out.print("What is your name?");
		String name = input.next();
		Player player = new Player(name,100);
		Enemy enemy1 = new Enemy(100, 100, 25, name, 18, 18);
		Enemy enemy2 = new Enemy(100, 100, 25, name, 55, 9); 
		boolean done = false;
		int enemymover = 0;

		while(!done){
			if(12 < enemymover && enemymover < 17){
                                enemy1.moveLocation(enemy1.getX(), enemy1.getY()+1);
				enemy2.moveLocation(enemy2.getX(), enemy2.getY()+1);
                                enemymover++;
                                if(enemymover == 17 ){
					enemy1.moveLocation(enemy1.getX()+1, enemy1.getY());
					enemy2.moveLocation(enemy2.getX()+1, enemy2.getY());
					enemymover = 0;
				}
                        }
			if(8 < enemymover && enemymover < 13){
                                enemy1.moveLocation(enemy1.getX()+1, enemy1.getY());
				enemy2.moveLocation(enemy2.getX()+1, enemy2.getY());
                                enemymover++;
			}
			if(4 < enemymover && enemymover < 9){
                                enemy1.moveLocation(enemy1.getX(),enemy1.getY()-1);
				enemy2.moveLocation(enemy2.getX(),enemy2.getY()-1);
                                enemymover++;
                        }
			if(enemymover < 5){
                                enemy1.moveLocation(enemy1.getX()-1, enemy1.getY());
				enemy2.moveLocation(enemy2.getX()-1, enemy2.getY());				
                                enemymover = enemymover+1;
                        }
			
			Map.displayMap(player.getYcord(), player.getXcord(), enemy1.getY(), enemy1.getX(), enemy2.getY(), enemy2.getX());
                        Map.displayInfo();
			Key key = Terminal.getKey();
			switch(key){
				case ESCAPE:
					done = true;
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
		}
	}
}
