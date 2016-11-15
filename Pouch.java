/**
 * Stores the gold coins in the pouch of the player.
 * 
 * @author Maas Lalani
 * @version 1.0 2016-11-14
 */
public class Pouch
{
    /* instance fields */
    private int coins;

    /**
     * Constructs money with the default number of coins.
     */
    public Pouch()
    {
        coins = 0;
    } // end of constructor Pouch()

    /**
     * Returns the coins in this pouch.
     */
    public int getCoins()
    {
        return coins;
    } // end of method getCoins()

    /**
     * Adds coins to this pouch.
     * 
     * @param coins the number of coins to add to this pouch
     */
    public void addCoins(int coins)
    {
        this.coins += coins;
    } // end of method addCoins(int coins)    

    /**
     * Removes coins from this pouch.
     * 
     * @param coins the number of coins to remove from this pouch
     */
    public void removeCoins(int coins)
    {
        this.coins -= coins;
    } // end of method removeCoins(int coins)  
   
    /**
     * Sets the coins of this pouch.
     * 
     * @param coins the number of coins in this pouch
     */
    public void setCoins(int coins)
    {
        this.coins = coins;
    } // end of method addCoins(int coins)
} // end of class Pouch