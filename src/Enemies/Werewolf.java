package Enemies;

public class Werewolf extends Enemy {

    public Werewolf(){
        super();
    }

    @Override
    public int attack() {
        return RANDOM.nextInt(MAXIMUM_ATTACK_DAMAGE);
    }

    @Override
    public void takeDamage(int damage) {
        setHealth(this.getHealth()-damage);
    }
}
