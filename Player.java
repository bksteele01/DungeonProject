import java.util.*;


public class Player {
	private String name;
	private Inventory playerInv = new Inventory(15); //I don't know what weight is good for your inventory system, if 15 is too low/large feel free to change it
	private int currentHealth;
	private int maxHealth;

	public Player(String name, int currentHealth) {
		this.name = name;
		this.playerInv = playerInv;
		this.currentHealth = currentHealth;
		System.out.println("Future grave resident: " + name);		
		System.out.println(name + "'s" + " current health is: " + currentHealth);

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
	public void setMaxHealth(int newMax) {
		maxHealth = newMax;
	}

	public void setCurrentHealth(int newCurr) {
		currentHealth = newCurr;
	} 

	public int getCurrentHealth() {
		return currentHealth;
	}

}
