/**
 * Blocks a set number of damage of an enemy's attack.
 * 
 * @author Maas Lalani
 * @version 1.2 2016-11-14
 */
public class Armour
{
    // Leather Armour
    public static final int LEATHER_HITPOINTS = 5;
    public static final int LEATHER_DAMGAGE_BLOCKED = 2;

    // Iron armour
    public static final int IRON_HITPOINTS = 10;
    public static final int IRON_DAMAGE_BLOCKED = 5;

    // Gold armour
    public static final int GOLD_HITPOINTS = 20;
    public static final int GOLD_DAMAGE_BLOCKED = 10;

    /* instance fields */
    private String name;
    private int hitpoints;
    private int damageBlocked;

    /**
     * Constructs armour for a player.
     * 
     * @param type the type of this armour
     */
    public Armour(String type)
    {
        if (type == null) return;

        name = type + " armour";

        switch (type)
        {
            case "leather":
                hitpoints = LEATHER_HITPOINTS;
                damageBlocked = LEATHER_DAMGAGE_BLOCKED;
                break;

            case "iron":
                hitpoints = IRON_HITPOINTS;
                damageBlocked = IRON_DAMAGE_BLOCKED;
                break;

            case "gold":
                hitpoints = GOLD_HITPOINTS;
                damageBlocked = GOLD_DAMAGE_BLOCKED;
                break;
            
            default:
                name = "clothes";
                hitpoints = 0;
                damageBlocked = 0;
                break;
        } // end of switch (type)
    } // end of constructor Armour()

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