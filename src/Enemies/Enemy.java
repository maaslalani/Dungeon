package Enemies;

import java.util.Random;

/**
 * The antagonist whom you must defeat.
 *
 * @author Maas Lalani
 * @version 1.2 2016-11-14
 */
public abstract class Enemy
{
    /* class fields */
    /** An array of possible enemy types. */

    // Enemies classes to add : Witch,Orc,Imp,Giant,Demon,Spider,Dragon,Clown,Bat,Slime,Undead
    public static final String[] ENEMY_NAMES = { "Large", "Little", "Huge", "Explosive", "Strange", "Big and Fat" };

    /** The maximum attack damage of this enemy. */
    public static final int MAXIMUM_ATTACK_DAMAGE = 20;

    /** The maximum health of this enemy. */
    public static final int MAXIMUM_HEALTH = 75;

    /** The minimum health of this enemy. */
    public static final int MINIMUM_HEALTH = 1;

    /** The random number generator of this enemy. */
    public static final Random RANDOM = new Random();

    /* instance fields */
    protected int health;
    protected String name;
    protected String type;

    /**
     * Constructs a new enemy.
     */
    public Enemy()
    {
        this.type = this.getClass().getSimpleName();
        this.name = ENEMY_NAMES[RANDOM.nextInt(ENEMY_NAMES.length)] + " " + this.type;

        /* Give the enemy a random health */
        health = RANDOM.nextInt(MAXIMUM_HEALTH);
    } // end of constructor Enemy()

    public void setHealth(int health) {
        this.health = health;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setType(String type) {
        this.type = type;
    }

    /**
     * Returns the damage dealt by this enemy.
     *
     * @return the damage dealt by this enemy
     */
    public abstract int attack(); // end of method attack()

    /**
     * Reduces the HP of this enemy by a specifed value.
     *
     * @param damage the amount to reduce the
     */
    public abstract void takeDamage(int damage); // end of method damageDealt(int damage)

    /**
     * The name of this enemy.
     *
     * @return the name of the enemy
     */
    public String getName()
    {
        return name;
    } // end of method name()

    /**
     * Returns the health of this enemy.
     *
     * @return heatlh of this enemy
     */
    public int getHealth()
    {
        return health;
    } // end of method getHealth()

    /**
     * Returns the type of this enemy.
     *
     * @return type of this enemy
     */
    public String getType()
    {
        return type;
    } // end of method getType()

} // end of class Enemy

