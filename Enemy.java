
//Creates the enemy class which can create an enemy object and has methods for setting and retrieving information about the enemy object
class Enemy {


	//Initializes variables

	String name;
	int maxHealth;
	int currHealth;
	int damage;
	int x;
	int y;
	boolean isDead;

	//Construsts an enemy object based on the passes parameters of current health, max health, damage, name, and x and y coordinates
	//then sets variables accordingly

	public Enemy (int currHealth, int maxHealth, int damage, String name, int x, int y) {
		this.maxHealth = maxHealth;
		this.damage = damage;
		this.name = name;
		this.currHealth = currHealth;
		this.x = x;
		this.y = y;
		isDead = false;

	}

	//returns the enemy's x coordinate

	public int getX() {
		return x;
	}

	//returns the enemy's y coordinate
	
	public int getY() {
		return y;
	}

	//returns the enemy's name

	public String getName() {
		return name;
	}

	//returns the enemy's max health

	public int getMaxHealth() {
		return maxHealth;
	}

	//returns the enemy's current health

	public int getCurrHealth() {
		return currHealth;
	}

	//returns the enemy's damage

	public int getDamage() {
		return damage;
	}

	//changes the enemy's name to the new name given when the method was called

	public void setName(String newName) {
		name = newName;
	}

	//changes the enemy's max health to the new max health given when the method was called

	public void setMaxHealth(int newMaxHealth) {
		maxHealth = newMaxHealth;
	}

	//changges the enemy's current health to the new current health given when the method was called

	public void setCurrent(int newCurrHealth) {
		currHealth = newCurrHealth;
	}

	//changes the enemy's x and y coordinates to the new coordinates given when the method was called

	public void moveLocation(int newX, int newY) {
		x = newX;
		y = newY;
	}

	//checks if the enemy is dead or alive

	public boolean getIsDead(){
		return isDead;
	}

	//kills the enemy and returns that the enemy is dead
	
	public boolean setIsDead() {
		isDead = true;
		return isDead;
	}
}
