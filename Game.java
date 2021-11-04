import java.util.Scanner;
import ansi_terminal.*;
import java.lang.String;
//This class executes the actual game mechanics. It uses a loop and manipulates elements
//of each object depending on user input. 

public class Game {
	//Singular method of the class. Easier to have it away from the main class for
	//terminal reasons. Does what was described in the class description. 

	public static void game() {
		
		Scanner input = new Scanner(System.in);
		System.out.print("What is your name?");
		String name = input.next();
		
		Player player = new Player(name,100);
		Inventory playerInv = player.getInv();
		playerInv.equipWeapon();
		playerInv.equipArmor();
		
		Enemy enemy1 = new Enemy(100, 100, 20, name, 18, 18);
		Enemy enemy2 = new Enemy(100, 100, 20, name, 55, 9); 
		
		boolean done = false;
		int enemymover = 0;
		while(!done){
			if(enemy1.getIsDead() == true && enemy2.getIsDead() == true) {
				Terminal.warpCursor(20,75);
				System.out.print("YOU HAVE CONQUORED ALL THE ENEMIES! VICTORY!");
				Terminal.pause(3);
				done = true; 
			}
			if(player.getCurrentHealth() < 1){
				Terminal.warpCursor(20,75);
				System.out.print("YOU DIED!");
				Terminal.pause(3);
				done = true;
			}	
			
			
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
			
			
			if(player.getXcord() == enemy1.getX() && player.getYcord() == enemy1.getY()) {
				boolean isDead = player.Battle(enemy1);
				if (isDead) {
					enemy1.setIsDead();
					enemy1.moveLocation(-15, 15);
				}
			}
			if(player.getXcord() == enemy2.getX() && player.getYcord() == enemy2.getY()) {
				boolean isDead = player.Battle(enemy2);
				if (isDead) {
					enemy2.setIsDead();
					enemy2.moveLocation(-15,16);
				}
			}		

			
			Map.displayMap(player.getYcord(), player.getXcord(), enemy1.getY(), enemy1.getX(), enemy2.getY(), enemy2.getX());
			Map.displayInfo();
			Key key = Terminal.getKey();
			
			switch(key){
				case ESCAPE:
					done = true;
				case LEFT:
					if(Map.grid[player.getYcord()].charAt(player.getXcord()-1) == '#'){
						break;
					}else{
						player.setxCord(player.getXcord() - 1);
						break;
					}
				case RIGHT:
					if(Map.grid[player.getYcord()].charAt(player.getXcord()+1) == '#'){
						break;
					}else{
						player.setxCord(player.getXcord() + 1);
						break;
					}
				case UP:
					if(Map.grid[player.getYcord()-1].charAt(player.getXcord()) == '#'){
						break;
					}else{
						player.setyCord(player.getYcord() - 1);
						break;
					}
				case DOWN:
					if(Map.grid[player.getYcord()+1].charAt(player.getXcord()) == '#'){
						break;
					}else{
						player.setyCord(player.getYcord() + 1);

						break;
					}
				case p:
					if(player.getYcord() == 16 && player.getXcord() == 32){
						ItemType armor = ItemType.armor;
						Item helmet = new Item(armor, "Helmet", 5, 50, 10);
						playerInv.add(helmet); 
						Map.grid[16] = Map.grid[16].replace("h", " ");
					}
					if(player.getYcord() == 32 && player.getXcord() == 13){
						ItemType weapon = ItemType.weapon;
						Item goldsword = new Item(weapon, "Gold Sword", 8, 50, 15);
						playerInv.add(goldsword);
						Map.grid[32] = Map.grid[32].replace("s", " ");
					}
					if(player.getYcord() == 7 && player.getXcord() == 56){
						ItemType weapon = ItemType.weapon;
						Item bow = new Item(weapon, "Bow/Quiver", 3, 45, 12);
						playerInv.add(bow);
						Map.grid[7] = Map.grid[7].replace("b", " ");
					}
					if(player.getYcord() == 35 && player.getXcord() == 59){
						ItemType armor = ItemType.armor;
						Item chestplate = new Item(armor, "Bronze Chestplate", 10, 70, 15);
						playerInv.add(chestplate);
						Map.grid[35] = Map.grid[35].replace("c", " ");
					}
					break;
				case q:
					playerInv.print();
					Terminal.pause(4);
					break;
				case w:
					playerInv.equipWeapon();
					break;
				case a:
					playerInv.equipArmor();
					break;
			}
		}
	}
}
