import java.util.*;


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
}
