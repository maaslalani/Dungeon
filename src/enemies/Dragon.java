package src.enemies;

public class Dragon extends Enemy {

	public Dragon() {
		super();

		this.setName(this.getClass().getSimpleName());
		this.setHealth(RANDOM.nextInt(TIER4_MAXIMUM_HEALTH - TIER4_MINIMUM_HEALTH) + TIER4_MINIMUM_HEALTH);
	}

	@Override
	public int attack() {
		return RANDOM.nextInt(TIER4_MAXIMUM_ATTACK_DAMAGE);
	}

	@Override
	public void takeDamage(int damage) {
		this.setHealth(this.getHealth() - damage);
	}
}
