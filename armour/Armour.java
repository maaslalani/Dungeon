package armour;

/**
 * Blocks a set number of damage of an enemy's attack.
 * 
 * @author Maas Lalani
 * @version 1.2 2016-11-14
 */
public abstract class Armour
{

    /* instance fields */
    private String name;
    private int hitpoints;
    private int damageBlocked;

    

    /**
     * Returns the damageBlocked of this armour.
     *
     * @return damageBlocked
     */
    public int damageBlocked()
    {
        return damageBlocked;
    } // end of method damageBlocked()

    /**
     * Returns the hitpoints left on this armour
     * 
     * @return hitpoints
     */
    public int hitpoints()
    {
        return hitpoints;
    }

    /**
     * Returns the name of this armour.
     * 
     * @return name
     */
    public String name()
    {
        return name;
    } // end of method name()

    /**
     * Changes the name of this armour to the specified name.
     * 
     * @param name the name of this armour
     */
    public void setName(String name)
    {
        this.name = name;
    } // end of method setName(String name)

    /**
     * Uses this armour when attacking an enemy, reduces hitpoints.
     */
    public void useArmour()
    {
        hitpoints--;
    } // end of method useArmour()

    /**
     * Adds hitpoints to armour, repairing the armour.
     * 
     * @param hitpointsToRepair how many hitpoints the armour will be repaired by
     */
    public void repairArmour(int hitpointsToRepair)
    {
        hitpoints = hitpoints + hitpointsToRepair;
    } // end of method repairArmour(int hitpoints)
} // end of class Armour