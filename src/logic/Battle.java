package logic;

import java.lang.reflect.Array;
import java.util.List;

public class Battle {
	static Hero[] fighter = new Hero[2];

	public Battle(Hero a, Hero b) {
		this.fighter[0] = a;
		this.fighter[1] = b;
	}

	public void start() {
		System.out.println("==== Here Come A New Challenger ====");
		// TODO Show opening phrase -> Show challengers -> Repeat doBattleStep() -> Show
		// result
		System.out.println("== " + this.fighter[0].name + this.fighter[0].printStat() + " VS " + this.fighter[1].name
				+ this.fighter[1].printStat() + " ==");
		while (!isEnd()) {
			doBattleStep();
		}
		showResult();
	}

	public void doBattleStep() {
		// TODO FILL ME
		// First fighter Attack

		System.out.println(this.fighter[0].name + " do " + this.fighter[0].doDamage(this.fighter[1]) + " damage to "
				+ this.fighter[1].name);

		System.out.println(this.fighter[1].name + " has " + this.fighter[1].hp + " HP left");
		// Second fighter Attack
		System.out.println(this.fighter[1].name + " do " + this.fighter[1].doDamage(this.fighter[0]) + " damage to "
				+ this.fighter[0].name);
		System.out.println(this.fighter[0].name + " has " + this.fighter[0].hp + " HP left");
		if (this.fighter[0].isDefeated()) {
			System.out.println(this.fighter[0].name + " is knocked out");
		}
		if (this.fighter[1].isDefeated()) {
			System.out.println(this.fighter[1].name + " is knocked out");
		}

	}

	// TODO Fill me
	public void showResult() {
		if (this.fighter[0].isDefeated() && this.fighter[1].isDefeated()) {
			System.out.println("== DRAW ==");
		} else if (this.fighter[0].isDefeated()) {
			System.out.println("== " + this.fighter[1].name + " WIN ==");
		} else if (this.fighter[1].isDefeated()) {
			System.out.println("== " + this.fighter[0].name + " WIN ==");
		}
	}

	public boolean isEnd() {
		if (this.fighter[0].isDefeated() || this.fighter[1].isDefeated()) {
			return true;
		}
		return false;
	}
}
