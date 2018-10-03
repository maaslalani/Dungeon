package Ennemies;

public class Warrior extends Enemy {

    public Warrior(){
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
