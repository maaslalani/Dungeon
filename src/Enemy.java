import java.util.Random;

/**
 * The antagonist whom you must defeat.
 * 
 * @author Maas Lalani
 * @version 1.2 2016-11-14
 */
public class Enemy
{
    /* class fields */
    /** An array of possible enemy types. */

    public static final String[] ENEMY_NAMES = {
      "Zombie",
      "Skeleton",
      "Warrior",
      "Goblin",
      "Werewolf",
      "Vampire",
      "Witch",
      "Orc",
      "Imp",
      "Giant",
      "Demon",
      "Spider",
      "Dragon",
      "Clown",
      "Bat",
      "Undead",
      "Slime",
      "Monster",
      "Anaconda",
      "Ape",
      "Snake",
      "Ghost"
    };


    /** The maximum attack damage of this enemy. */
    public static final int MAXIMUM_ATTACK_DAMAGE = 20;

    /** The maximum health of this enemy. */
    public static final int TIER1_MAXIMUM_HEALTH = 25;
    public static final int TIER2_MAXIMUM_HEALTH = 50;
    public static final int TIER3_MAXIMUM_HEALTH = 75;
    public static final int TIER4_MAXIMUM_HEALTH = 100;

    /** The minimum health of this enemy. */
    public static final int TIER1_MINIMUM_HEALTH = 1;
    public static final int TIER2_MINIMUM_HEALTH = 25;
    public static final int TIER3_MINIMUM_HEALTH = 50;
    public static final int TIER4_MINIMUM_HEALTH = 75;

    /** The random number generator of this enemy. */
    public static final Random RANDOM = new Random();

    /* instance fields */
    private int health;
    private String name;

    /**
     * Constructs a new enemy.
     */
    public Enemy(Pouch playerPouch)
    {
        /* Fetch a random name from the list of enemies. */
        name = ENEMY_NAMES[RANDOM.nextInt(ENEMY_NAMES.length)];

        /* Give the enemy a random health depending on player's coins */
        if(playerPouch.getCoins() <= 30)
        {
            health = RANDOM.nextInt(TIER1_MAXIMUM_HEALTH-TIER1_MINIMUM_HEALTH) + TIER1_MINIMUM_HEALTH;
        }
        else if(playerPouch.getCoins() <= 60)
        {
            health = RANDOM.nextInt(TIER2_MAXIMUM_HEALTH-TIER2_MINIMUM_HEALTH) + TIER2_MINIMUM_HEALTH;
        }
        else if(playerPouch.getCoins() <= 90)
        {
            health = RANDOM.nextInt(TIER3_MAXIMUM_HEALTH-TIER3_MINIMUM_HEALTH) + TIER3_MINIMUM_HEALTH;
        }
        else
        {
            health = RANDOM.nextInt(TIER4_MAXIMUM_HEALTH-TIER4_MINIMUM_HEALTH) + TIER4_MINIMUM_HEALTH;
        }
        
    } // end of constructor Enemy()

    /**
     * Returns the damage dealt by this enemy.
     * 
     * @return the damage dealt by this enemy
     */
    public int attack()
    {
        return RANDOM.nextInt(MAXIMUM_ATTACK_DAMAGE);
    } // end of method attack()

    /**
     * Reduces the HP of this enemy by a specifed value.
     * 
     * @param damage the amount to reduce the
     */
    public void takeDamage(int damage)
    {
        health = health - damage;
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
