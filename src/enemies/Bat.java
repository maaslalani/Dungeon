package src.enemies;

public class Bat extends Enemy {

	public Bat() {
		super();

		this.setName(this.getClass().getSimpleName());
		this.setHealth(RANDOM.nextInt(TIER1_MAXIMUM_HEALTH - TIER1_MINIMUM_HEALTH) + TIER1_MINIMUM_HEALTH);
	}

	@Override
	public int attack() {
		return RANDOM.nextInt(TIER1_MAXIMUM_ATTACK_DAMAGE);
	}

	@Override
	public void takeDamage(int damage) {
		this.setHealth(this.getHealth() - damage);
	}
}
