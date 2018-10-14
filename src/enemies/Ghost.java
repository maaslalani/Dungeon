package src.enemies;

public class Ghost extends Enemy {

	public Ghost() {
		super();

		this.setName(this.getClass().getSimpleName());
		this.setHealth(RANDOM.nextInt(TIER2_MAXIMUM_HEALTH - TIER2_MINIMUM_HEALTH) + TIER2_MINIMUM_HEALTH);
	}

	@Override
	public int attack() {
		return RANDOM.nextInt(TIER2_MAXIMUM_ATTACK_DAMAGE);
	}

	@Override
	public void takeDamage(int damage) {
		this.setHealth(this.getHealth() - damage);
	}
}
