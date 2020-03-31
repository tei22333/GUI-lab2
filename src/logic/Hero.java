package logic;

public class Hero {
	protected String name;
	protected int power;
	protected int hp;

	public Hero(String name, int power, int hp) {
		if (power <= 0) {
			this.power = 0;
		} else {
			this.power = power;
		}
		if (hp < 1) {
			this.hp = 1;
		} else {
			this.hp = hp;
		}
		this.name = name;
	}

	public int takeDamage(int damage) {
		damage = damage < 0 ? 0 : damage;
		this.hp -= damage;
		this.hp = hp < 0 ? 0 : hp;
		return damage;
	}

	public int doDamage(Hero target) {
		int damageDone ;
		if (target instanceof Tank) {
			((Tank) target).hp = (((Tank) target).hp + ((Tank) target).getArmor()) - this.power;
			target.hp = target.hp < 0 ? 0 : target.hp;
			damageDone = this.power - ((Tank) target).getArmor();
		} else {
			target.hp = target.hp -= this.power;
			target.hp = target.hp < 0 ? 0 : target.hp;
			damageDone = this.power;
		}
		return damageDone;
	}

	public boolean isDefeated() {
		if (this.hp <= 0) {
			return true;
		}
		return false;
	}

	public String printStat() {
		return "[atk:" + this.power + " hp:" + this.hp + "]";
	}

	public String getName() {
		return this.name;
	}

	public int getPower() {
		return this.power;
	}

	public int getHp() {
		return this.hp;
	}
}
