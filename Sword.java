/**
 * A weapon which inflicts an increased number of damage to an enemy.
 * 
 * @author Maas Lalani
 * @version 2015-11-17
 */
public class Sword
{
    // instance variables
    private String name;
    private int hitpoints;
    private int damageIncrease;
    
    /**
     * Constructs a Sword
     */
    public Sword(String name, int hitpoints, int damageIncrease)
    {
        this.name = name;
        this.hitpoints = hitpoints;
        this.damageIncrease = damageIncrease;
    } // end of constructor Sword(String name, int hitpoints, int damageIncrease)
    
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
        hitpoints -= 1;
    } // end of method useSword()
    
    /**
     * Adds hitpoints to sword, repairing the sword.
     * 
     * @param hitpoints how many hitpoints the sword will be repaired by
     */
    public void repairSword(int hitpoints)
    {
        this.hitpoints += hitpoints;
    } // end of method repairSword(int hitpoints)
} // end of class Sword