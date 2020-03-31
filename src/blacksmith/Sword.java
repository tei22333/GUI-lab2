package blacksmith;

public class Sword {

	private int attack;
	private int durability;

	public Sword(int attack, int durability) {
		if (attack < 1) {
			this.attack = 1;
		} else {
			this.attack = attack;
		}
		if (durability < 1) {
			this.durability = 1;
		} else {
			this.durability = durability;
		}
	}

	public void upgrade(int val) {
		if (val >= 0) {
			this.attack += val;
			this.durability++;
		} else {
			this.durability++;
		}
	}

	public int doParry(int attack) {
		if (attack < 1) {
			attack = 1;
		}
		this.durability--;
		int damage = attack - this.attack;
		if (damage < 0) {
			damage = 0;
		}
		return damage;
	}

	public boolean isBroken() {
		return this.durability == 0;
	}

	public int getAttack() {
		return attack;
	}

	public int getDurability() {
		return durability;
	}
}
