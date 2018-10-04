package Enemies;

public class Goblin extends Enemy {

    public Goblin(){
        super();
    }


    @Override
    public int attack() {
        return RANDOM.nextInt(MAXIMUM_ATTACK_DAMAGE);
    }

    @Override
    public void takeDamage(int damage) {

    }
}
