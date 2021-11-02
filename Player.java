import java.util.*;
import ansi_terminal.*;


public class Player {
	private String name;
	private Inventory playerInv = new Inventory(15); //I don't know what weight is good for your inventory system, if 15 is too low/large feel free to change it
	private int currentHealth;
	private int maxHealth;
	private int xCord;
	private int yCord;

	public Player(String name, int currentHealth) {
		xCord = 4;
		yCord = 4;
		this.name = name;
		this.playerInv = playerInv;
		this.currentHealth = currentHealth;
		System.out.print("Future grave resident: " + name);		
		System.out.print("   "+name + "'s" + " current health is: " + currentHealth);

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

/*
	public Inventory setInv() {
		return ;
	}
*/
	public void setxCord(int x){
		xCord = x;
	}
	public void setyCord(int y){
		yCord = y;
	}

	/*
	   public Inventory setInv() {
	   return ;
	   }
	   */

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

	public void Battle(Enemy enemy) {
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
		Terminal.warpCursor(7, 75);
		System.out.print("You dealt " + playerStrength + " damage to the enemy! \n");
		System.out.print("The enemy has " + enemyNewHealth + "health left \n");
		System.out.print("The enemy dealt " + enemyFinalDamage + " to you! \n");
		System.out.print("You have " + currentHealth + "health left \n");

	}
}
