import java.util.Random;
/**
 * The antagonist whom you must defeat.
 * 
 * @author Maas Lalani
 * @version 1.0 2015-11-17
 */
public class Enemy
{
    /**
     * An array of possible enemy types.
     */
    public static final String[] enemy = { "Zombie", "Skeleton", "Warrior", "Goblin", "Werewolf", "Vampire", "" };

    private Random random = new Random();
    private String name;
    private int health;
    private int attackDamage;

    /**
     * Constructs a new enemy.
     */
    public Enemy()
    {
        name = enemy[random.nextInt(enemy.length)];
        health = random.nextInt(76);
        while (health == 0) {
            health = random.nextInt(76);
        }
        attackDamage = 20;
    } // end of constructor Enemy()

    /**
     * Returns the damage dealt by this enemy.
     * 
     * @return the damage dealt by this enemy
     */
    public int attack()
    {
        return random.nextInt(attackDamage);
    } // end of method attack()

    /**
     * Reduces the HP of this enemy by a specifed value.
     * 
     * @param damage the amount to reduce the
     */
    public void takeDamage(int damage)
    {
        health -= damage;
    } // end of method damageDealt(int damage)

    /**
     * The name of this enemy.
     * 
     * @return the name of the enemy
     */
    public String name()
    {
        return name;
    } // end of method name()

    /**
     * Returns the health of this enemy.
     * 
     * @return heatlh of this enemy
     */
    public int health()
    {
        return health;
    } // end of method health()
} // end of class Enemy