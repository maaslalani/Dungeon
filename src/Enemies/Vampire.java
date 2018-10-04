package Enemies;

public class Vampire extends Enemy  {

    public Vampire(){
        super();
    }


    @Override
    public int attack() {
        int inflicted = RANDOM.nextInt(MAXIMUM_ATTACK_DAMAGE);
        return inflicted;

    }

    @Override
    public void takeDamage(int damage) {
        setHealth(this.getHealth() - damage);
    }
}
