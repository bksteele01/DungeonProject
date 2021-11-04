import java.util.*;
import ansi_terminal.*;


public class Player {
	private String name;
	private Inventory playerInv = new Inventory(100); //I don't know what weight is good for your inventory system, if 15 is too low/large feel free to change it
	private int currentHealth;
	private int maxHealth;
	private int xCord;
	private int yCord;
	ItemType weapon = ItemType.weapon;
	Item IronSword = new Item(weapon, "Iron Sword", 8, 50, 10);
	ItemType armor = ItemType.armor;
	Item woodenChestplate = new Item(armor, "Wooden Chestplate", 5, 60, 10);
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

	public String getName() {
		return name;
	}

	public Inventory getInv() {
		return playerInv;
	}

	public void setName(String newName) {
		name = newName;
	}

	public void setxCord(int x){
		xCord = x;
	}
	public void setyCord(int y){
		yCord = y;
	}

	public void setMaxHealth(int newMax) {
		maxHealth = newMax;
	}

	public void setCurrentHealth(int newCurr) {
		currentHealth = newCurr;
	} 

	public int getCurrentHealth() {
		return currentHealth;
	}


	public int getXcord() {
		return xCord;

	}

	public int getYcord() {
		return yCord;
	}


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
