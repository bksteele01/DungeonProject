

class Enemy {


	String name;
	int maxHealth;
	int currHealth;
	int damage;



	public enemy (int currHealth, int maxHealth, int damage, String name) {
		this.maxHealth = maxHealth;
		this.damage = damage;
		this.name = name;
		this.currHealth = currHeatlh;

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

}
