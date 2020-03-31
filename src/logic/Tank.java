package logic;

public class Tank extends Hero {
	private int armor;

	public Tank(String name, int power, int hp, int armor) {
		super(name, power, hp);
		this.armor = armor < 1 ? 1 : armor;
	}

	public int takeDamage(int damage) {
		int took = (damage - this.armor) <= 0 ? 0 :damage - this.armor;
		this.hp = (this.hp -= took) <= 0 ? 0 : this.hp;
		return took;
	}

	public int takePiercingDamage(int damage) {
		damage = damage <= 0 ? 0 : damage;
		this.hp = (this.hp -= damage) <= 0 ? 0 : this.hp;
		return damage;
	}
	public String printStat() {
		return "[atk:"+this.power+" hp:"+this.hp+" armor:"+this.armor+"]";
	}
	public int getArmor() {
		return this.armor;
	}
}
