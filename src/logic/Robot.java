package logic;

public class Robot extends Hero {

	public Robot(String name) {
		super(name, 2, 10);
		this.power = 2;
	}
	public int doDamage(Hero target) {
		if(target instanceof Tank) {
			((Tank) target).takePiercingDamage(this.power);
		}
		else {
			target.takeDamage(this.power);
		}
		return this.power;
	}
	
	
}
