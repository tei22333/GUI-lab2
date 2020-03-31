package blacksmith;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class SwordTest {
	public Sword sword1, sword2;

	// TODO Create Sword for each test case for more convenient
	@BeforeEach
	void setUp() throws Exception {
		sword1 = new Sword(10, 5);
		sword2 = new Sword(20, 1);
	}

	// TODO Test Sword constructor
	@Test
	void testSword() {
		Sword sword = new Sword(-5, -5);
		assertEquals(1, sword.getAttack());
		assertEquals(1, sword.getDurability());
	}

	// TODO Test Sword constructor with negative attack
	@Test
	void testSwordNegativeAttack() {
		Sword sword = new Sword(-10, 5);
		assertEquals(sword.getAttack(), 1);
		assertEquals(sword.getDurability(), 5);
	}

	// TODO Test Sword constructor with negative durability
	@Test
	void testSwordNegativeDurability() {
		Sword sword = new Sword(10, -5);
		assertEquals(sword.getAttack(), 10);
		assertEquals(sword.getDurability(), 1);
	}

	// TODO Test upgrade()
	@Test
	void testUpgrade() {
		Sword sword = new Sword(10, 5);
		sword.upgrade(100);
		assertEquals(sword.getAttack(), 110);
		assertEquals(sword.getDurability(), 6);
	}

	// TODO Test upgrade() with negative value
	@Test
	void testUpgradeNegative() {
		Sword sword = new Sword(10, 5);
		sword.upgrade(-100);
		assertEquals(sword.getAttack(), 10);
		assertEquals(sword.getDurability(), 6);
	}

	// TODO Test doParry()
	@Test
	void testDoParry() {
		int damage = sword1.doParry(100);
		assertEquals(90, damage);
	}

	// TODO Test doParry() with non positive attack
	@Test
	void testDoParryNonPositiveAttack() {
		int damage = sword1.doParry(-10);
		assertEquals(0, damage);
	}

	// TODO Test doParry() with attack <= Sword's attack ( fully parried )
	@Test
	void testDoParryFullyParried() {
		int damage = sword1.doParry(10);
		assertEquals(0, damage);
	}

	// TODO Test isBroken()
	@Test
	void testIsBroken() {
		Sword sword = new Sword(10, 1);
		sword.doParry(10);
		assertTrue(sword.isBroken());
	}

}