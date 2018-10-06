package swords;

public class SwordFactory {

	/**
     * Constructs a sword with the specified characteristics.
     * 
     * @param type the type of this sword
     */
    public static Sword createSword(String type)
    {        

        if(SWORD_TYPE.WOOD.getValue().equals(type)) {
            return new WoodSword();
        }

        if(SWORD_TYPE.METAL.getValue().equals(type)) {
            return new MetalSword();
        }
        
        if(SWORD_TYPE.GOLD.getValue().equals(type)) {
            return new GoldSword();
        }

        //Default behaviour -- return a wooden sword.
        return new WoodSword();

    } // end of constructor Sword(String  type)
	
}
