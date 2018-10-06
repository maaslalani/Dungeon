package armour;

public class ArmourFactory {

	/**
     * Constructs armour for a player.
     * 
     * @param type the type of this armour
     */
    public static Armour createArmour(String type)
    {

        if(type == null || ARMOUR_TYPE.LEATHER.getValue().equals(type)) {
            return new LeatherArmour();
        }

        if(ARMOUR_TYPE.IRON.getValue().equals(type)) {
            return new IronArmour();
        }
        
        if(ARMOUR_TYPE.GOLD.getValue().equals(type)) {
            return new GoldArmour();
        }

        //Default behaviour -- return leather armour.
        return new LeatherArmour();
    } // end of constructor Armour()
	
}
