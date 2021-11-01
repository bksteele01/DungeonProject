import java.util.*;


public class Player {
	private String name;
	private Inventory playerInv;
	private int currentHealth;

	public Player(String name, int currentHealth) {
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

	public String setName() {
		return "";
	}
/*
	public Inventory setInv() {
		return ;
	}
*/
	public int setMaxHealth() {
		return 5;
	}

	public int setCurrentHealth() {
		return 5;
	} 

	public int getCurrentHealth(int damage) {
		return currentHealth;
	}

}
