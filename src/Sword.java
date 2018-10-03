/**
 * A weapon which inflicts an increased number of damage to an enemy.
 * 
 * @author Maas Lalani
 * @version 1.2 2016-11-14
 */
public class Sword
{
    /* class fields */
    /** The hitpoints of a wood sword. */
    public static final int WOOD_HITPOINTS = 10;

    /** The damage increase of a wood sword. */
    public static final int WOOD_DAMAGE_INCREASE = 5;

    /** The hitpoints of a metal sword. */
    public static final int METAL_HITPOINTS = 15;

    /** The damage increase of a metal sword. */
    public static final int METAL_DAMAGE_INCREASE = 10;

    /** The hitpoints of a gold sword. */
    public static final int GOLD_HITPOINTS = 20;

    /** The damage increase of a gold sword. */
    public static final int GOLD_DAMAGE_INCREASE = 15;

    
    /* instance fields */
    private int damageIncrease;
    private int hitpoints;
    private String name;

    /**
     * Constructs a sword with the specified characteristics.
     * 
     * @param type the type of this sword
     */
    public Sword(String type)
    {        
        if (type == null) return;

        name = type + " sword";

        switch (type)
        {
            case "wood":
            hitpoints = WOOD_HITPOINTS;
            damageIncrease = WOOD_DAMAGE_INCREASE;
            break;

            case "metal":
            hitpoints = METAL_HITPOINTS;
            damageIncrease = METAL_DAMAGE_INCREASE;
            break;

            case "gold":
            hitpoints = GOLD_HITPOINTS;
            damageIncrease = GOLD_DAMAGE_INCREASE;
            break;

            default:
            name = "wood sword";
            hitpoints = WOOD_HITPOINTS;
            damageIncrease = WOOD_DAMAGE_INCREASE;
            break;
        } // end of switch (type)
    } // end of constructor Sword(String  type)

    /**
     * Returns the name of this sword. 
     * 
     * @return name
     */
    public String name()
    {
        return name;
    } // end of method name()

    /**
     * Returns the hitpoints of this sword.
     * 
     * @return hitpoints
     */
    public int hitpoints()
    {
        return hitpoints;
    } // end of method hitpoints()

    /**
     * Returns the damageIncrease of this sword.
     * 
     * @return damageIncrease
     */
    public int damageIncrease()
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