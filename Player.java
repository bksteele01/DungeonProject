import java.util.*;
import ansi_terminal.*;

//creates the player class which can construst a player object and has methods to get and set all of the players variables as well as initiate a battle with an enemy
public class Player {

	//Initializes variables and the players starting items

	private String name;
	private Inventory playerInv = new Inventory(100);
	private int currentHealth;
	private int maxHealth;
	private int xCord;
	private int yCord;
	ItemType weapon = ItemType.weapon;
	Item IronSword = new Item(weapon, "Iron Sword", 8, 50, 10);
	ItemType armor = ItemType.armor;
	Item woodenChestplate = new Item(armor, "Wooden Chestplate", 5, 60, 10);

	//This is the player constructor, which takes the name of the player and their current health as parameters.
	//After creating the player object the constructor sets the players name, coordinates, inventory, items, and health
	//and then prints out the players name and health

	public Player(String name, int currentHealth) {
		System.out.print("\n \r");
		xCord = 4;
		yCord = 4;
		this.name = name;
		this.playerInv = playerInv;
		playerInv.add(woodenChestplate);
		playerInv.add(IronSword);
		this.currentHealth = currentHealth;
		System.out.print("\n \r");
		System.out.print("Player: " + name);		
		System.out.print("\n \r");
		System.out.print(name + "'s" + " current health is: " + currentHealth +  "\n \r" );

	}

	//returns the name of the player when called

	public String getName() {
		return name;
	}

	//returns the inventory of the player when called

	public Inventory getInv() {
		return playerInv;
	}

	//when called with the players new name as parameters, this method will change the players name to that new name

	public void setName(String newName) {
		name = newName;
	}

	//sets the players x coordinate to the x coordinate that was given when the method was called

	public void setxCord(int x){
		xCord = x;
	}

	//sets the players y coordinate to the y coordinate that was given when the method was called

	public void setyCord(int y){
		yCord = y;
	}

	//sets the players max health to the integer that was given when the method was called

	public void setMaxHealth(int newMax) {
		maxHealth = newMax;
	}

	//sets the players current health to the integer that was given when the method was called

	public void setCurrentHealth(int newCurr) {
		currentHealth = newCurr;
	} 

	//returns the players current health when called

	public int getCurrentHealth() {
		return currentHealth;
	}
	
	//returns the players x coordinate when called

	public int getXcord() {
		return xCord;

	}

	//reutrns the players y coordinate when called

	public int getYcord() {
		return yCord;
	}

	//Initiates a battle between the player and the enemy given when the method was called.
	//First, the method finds what items the player has equipped and then gets their strength values
	//Next,the method finds the enemy's damage values and initializes the final damage integer
	//Next, the method checks if the enemy's damage is greater than the players defense. If the enemy's damage is less
	//than or equal to the players defense, the damage will be 0. If the damage is greater than the players defense the 
	//damage will be equal to the players defense minus the enemies damage
	//Finally, the method sets the player and enemy's updates health values and prints the outcome of the battle
	//It also checks to see if the enemy's health is less than or equal to zero. If it is, it prints that the enemy is dead
	//and returns true, otherwise it returns false.

	public boolean Battle(Enemy enemy) {
		Item weapon = playerInv.getWeapon();
		Item armor = playerInv.getArmor();
		int playerStrength = weapon.getStrength();
		int playerDefense = armor.getStrength();	
		int enemyInitDamage = enemy.getDamage();
		int enemyFinalDamage = 0;
		if (playerDefense - enemyInitDamage > 0) {
			enemyFinalDamage = 0;
		} else {
			enemyFinalDamage = (playerDefense - enemyInitDamage);
		}
		int enemyNewHealth = enemy.getCurrHealth() - playerStrength;
		enemy.setCurrent(enemyNewHealth);
		currentHealth = currentHealth + enemyFinalDamage;
		Terminal.warpCursor(20, 75);
		System.out.print("You dealt " + playerStrength + " damage to the enemy! \n");
		Terminal.warpCursor(21,75);
		System.out.print("The enemy has " + enemyNewHealth + "health left \n");
		Terminal.warpCursor(22, 75);
		System.out.print("The enemy dealt " + enemyFinalDamage + " to you! \n");
		Terminal.warpCursor(23, 75);
		System.out.print("You have " + currentHealth + "health left \n");
		Terminal.pause(2);
		if (enemy.getCurrHealth() <= 0) {
			System.out.print("Enemy is dead");
			Terminal.pause(2);
			return true;
		} else {
			return false;
		}
	}
}
