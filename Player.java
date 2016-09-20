import java.util.Random;
/**
 * The main character in this game.
 * 
 * @author Maas Lalani
 * @version 1.0 2015-11-17
 */
public class Player
{   
    /**
     * The delay used for display messages.
     */
    public static final long DELAY = 1000;   

    /**
     * The amount of HP one potion heals.
     */
    public static final int POTION_HEALING = 30;

    /**
     * Sword of this player.
     */
    public Sword sword;
    /**
     * Armour of this player.
     */
    public Armour armour;
    private Random random = new Random();
    private String name;

    private boolean hasSword;
    private boolean hasArmour;
    private int enemiesKilled;
    private int health;
    private int attackDamage;
    private int healthPotions;

    /**
     * Constructs a new Player.
     */
    public Player()
    {
        name = "";
        hasSword = false;
        health = 100;
        attackDamage = 25;
        healthPotions = 3;
        enemiesKilled = 0;
    } // end of constructor Player()

    /**
     * Returns damage dealt by this player.
     * 
     * @return the damage done by this player
     */
    public int attack() throws InterruptedException
    {
        if (hasSword)
        {
            sword.useSword();
            if (sword.hitpoints() <= 0)
            {
                System.out.println("\nYour " + sword.name() + " broke.");
                Thread.sleep(DELAY);
                hasSword = false;
            }
            return random.nextInt(attackDamage) + sword.damageIncrease();
        }
        else 
        {
            return random.nextInt(attackDamage);
        }       
    } // end of method attack()

    /**
     * Reduce the HP of this player by a specified amount.
     * 
     * @param damage the amount of damage to deal to this player
     */
    public void takeDamage(int damage) throws InterruptedException
    {
        if (hasArmour)
        {
            if (damage > armour.damageBlocked())
            {
                health -= (damage - armour.damageBlocked());
            } // end of if (damage > armour.damageBlock)

            armour.useArmour(); // Decrease hitpoints

            if (armour.hitpoints() <= 0)
            {
                hasArmour = false;
                System.out.println("\nYour " + armour.name() + " broke.");
                Thread.sleep(DELAY);
            } // end of if (armour.hitpoints() <= 0)
        } // end of if (hasArmour)
        else
        {
            // Does not have armour
            health -= damage;
        }
    } // end of method damageDealt(int damage)

    /**
     * Uses a potion on this player.
     */
    public void usePotion()
    {
        if (healthPotions > 0)
        {
            health += POTION_HEALING; // Use potion
            healthPotions -= 1; // Remove potion
        }
    } // end of method usePotion()

    /**
     * Increases the amount of potions this player has by a specified amount.
     * 
     * @param number the number of potions to add to this player
     */
    public void addPotions(int number)
    {
        healthPotions += number;
    } // end of method addPotions(int number)

    /**
     * Sets the name of this player.
     * 
     * @param name the new name of this player
     */
    public void setName(String name)
    {
        this.name = name;
    } // end of method setName(String name)

    /**
     * Returns the health of this player.
     * 
     * @return the health of this player
     */
    public int health()
    {
        return health;
    } // end of method health()

    /**
     * Returns the enemies killed of this player.
     * 
     * @return enemiesKilled
     */
    public int enemiesKilled()
    {
        return enemiesKilled;
    } // end of method enemiesKilled()
    
    /**
     * Adds 1 to the kill count of this player.
     */
    public void increaseEnemiesKilled()
    {
        enemiesKilled += 1;
    } // end of increaseEnemiesKilled()

    /**
     * Resets the state of this player.
     */
    public void reset()
    {
        health = 100;
        healthPotions = 3;
        enemiesKilled = 0;
    } // end of method reset()

    /**
     * Returns the number of potions this player has.
     * 
     * @return the number of potions this player has
     */
    public int getPotions()
    {
        return healthPotions;
    } // end of method getPotions()

    /**
     * Returns whether this player has a sword.
     * 
     * @return <code>true</code> if this player has a sword, otherwise <code>false</code>
     */
    public boolean hasSword()
    {
        return hasSword;
    } // end of method hasSword()

    /**
     * Returns whether this player has armour.
     * 
     * @return <code>true</code> if this player has armour, otherwise <code>false</code>
     */
    public boolean hasArmour()
    {
        return hasArmour;
    } // end of method hasArmour()

    /**
     * Gives a sword to this player.
     */
    public void addSword(String type)
    {
        if (type.equals("metal"))
        {
            sword = new Sword("Metal Sword", 20, 10);
        } // end of if (type.equals("metal"))
        else if (type.equals("gold"))
        {
            sword = new Sword("Gold Sword", 30, 15);
        } // end of if (type.equals("gold"))
        else 
        {
            // Sword not specified. Default wood sword.
            sword = new Sword("Wood Sword", 10, 5); 
        } // end of else {...}
        hasSword = true;
    } // end of method addSword()

    /**
     * Gives armour to this player.
     */
    public void addArmour(String type)
    {
        if (type.equals("leather") || type.equals("iron") || type.equals("gold"))
        {
            armour = new Armour(type);
            hasArmour = true;
        } // end of if (type.equals("leather") || type.equals("iron") || type.equals("gold"))
    } // end of method addSword()

    /**
     * Removes the sword from this player.
     */
    public void removeSword()
    {
        hasSword = false;
    } // end of method removeSword()

    /**
     * Removes the armour from this player.
     */
    public void removeArmour()
    {
        hasArmour = false;
    } // end of method removeArmour()
} // end of class Player