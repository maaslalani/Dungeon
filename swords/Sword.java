package swords;

/**
 * A weapon which inflicts an increased number of damage to an enemy.
 * 
 * @author Maas Lalani
 * @version 1.2 2016-11-14
 */
public abstract class Sword
{

    /* instance fields */
    private int damageIncrease;
    private int hitpoints;
    private String name;

    

    /**
     * Returns the name of this sword. 
     * 
     * @return name
     */
    public String getName()
    {
        return name;
    } // end of method name()

    /**
     * Returns the hitpoints of this sword.
     * 
     * @return hitpoints
     */
    public int getHitpoints()
    {
        return hitpoints;
    } // end of method hitpoints()

    /**
     * Returns the damageIncrease of this sword.
     * 
     * @return damageIncrease
     */
    public int getDamageIncrease()
    {
        return damageIncrease;
    } // end of method damageIncrease()

    /**
     * Changes the name of this sword to the specified name.
     * 
     * @param name the name of this sword
     */
    public void setName(String name)
    {
        this.name = name;
    } // end of method setName(String name)

    /**
     * Uses this sword when attacking an enemy, reduces hitpoints.
     */
    public void useSword()
    {
        hitpoints--;
    } // end of method useSword()

    /**
     * Adds hitpoints to sword, repairing the sword.
     * 
     * @param hitpointsToRepair how many hitpoints the sword will be repaired by
     */
    public void repairSword(int hitpointsToRepair)
    {
        hitpoints = hitpoints + hitpointsToRepair;
    } // end of method repairSword(int hitpoints)
} // end of class Sword