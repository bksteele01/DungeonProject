

class Enemy {


	String name;
	int maxHealth;
	int currHealth;
	int damage;
	int x;
	int y;



	public enemy (int currHealth, int maxHealth, int damage, String name, int x, int y) {
		this.maxHealth = maxHealth;
		this.damage = damage;
		this.name = name;
		this.currHealth = currHeatlh;
		this.x = x;
		this.y = y;

	}

	public int getX() {
		return x;
	}
	
	public int getY() {
		return y;
	}

	public String getName() {
		return name;
	}

	public int getMaxHealth() {
		return maxHealth;
	}

	public int getCurrHealth() {
		return currHealth;
	}

	public int getDamage() {
		return damage;
	}

	public void setName(String newName) {
		name = newName;
	}

	public void setMaxHealth(int newMaxHealth) {
		maxHealth = newMaxHealth;
	}

	public void setCurrent(int newCurrHealth) {
		currHealth = newCurrHealth;
	}

	public void moveLocation(int newX, int newY) {
		x = newX;
		y = newY;
	}
}