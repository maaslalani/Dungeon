package Enemies;

public class Skeleton extends Enemy{

    public Skeleton() {
        super();
    }


    @Override
    public int attack() {
        return RANDOM.nextInt(MAXIMUM_ATTACK_DAMAGE);
    }

    @Override
    public void takeDamage(int damage) {
        setHealth(this.getHealth()-damage);
    }// end of method takeDamage
}
