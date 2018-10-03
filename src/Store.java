import java.util.Scanner;
import java.util.InputMismatchException;

/**
 * The store where the player can buy items.
 * 
 * @author Maas Lalani
 * @version 1.0 2016-11-14
 */
public class Store
{
    /** The items in the store. */
    public static final String[] ITEM = {"Sword", "Armour", "Potions"};

    /** The prices of the items in the store. */
    public static final int[] PRICE = {100, 50, 10};

    public static void printStore(Player player)
    {
        System.out.println("\fWelcome to the store.\n");
        
        System.out.println("You have " + player.getPouch().getCoins() + " coins.\n");

        for (int i = 0; i < ITEM.length; i++)
        {
            System.out.println(i + 1 + ". " + ITEM[i] + ", Price: " + PRICE[i]);
        } // end of for (int i = 0; i < items.length; i++)

        System.out.print("\nWhat would you like to buy? ");

        getInput(player);
    } // end of method printStore()

    public static void getInput(Player player)
    {
        Scanner scanner = new Scanner(System.in);

        int itemIndex;

        try
        {
            itemIndex = scanner.nextInt() - 1;
            
            if (itemIndex < 0 || itemIndex >= ITEM.length) return;
        }
        catch (InputMismatchException exception)
        {
            /* Invalid input given. Exit the store */
            System.out.println("\nExiting store...");
            TheDungeon.delay();
            return;
        }

        buyItem(player, itemIndex);
    } // end of method getInput()

    public static void buyItem(Player player, int itemIndex)
    {
        /* Warn the user if they cannot afford the item. */
        if (player.getPouch().getCoins() < PRICE[itemIndex])
        {
            System.out.println("\nYou cannot afford " + ITEM[itemIndex] + ". Please purchase an afforable item.");
            TheDungeon.delay();
            
            /* Let the user try again. */
            printStore(player);
            
            /* Return so that the item is not purchased later. */
            return;
        } // end of if (player.getPouch().getCoins() > PRICE[itemIndex])
        
        switch (itemIndex)
        {
            /* Did player buy a sword? */
            case 0:
                player.addSword("wood");
                break;

            /* Did player buy armour? */
            case 1:
                player.addArmour("leather");
                break;

            /* Did player buy a potion? */
            case 2:
                player.addPotions(1);
                break;
        } // end of switch (itemIndex)
        
        /* Pay for the item that was bought */
        player.getPouch().removeCoins(PRICE[itemIndex]);
        
        /* Display the item purchased and price. */
        System.out.println("\nYou purchased: " + ITEM[itemIndex] + ", for " + PRICE[itemIndex] + " coins");
        TheDungeon.delay();
        
    } // end of method buyItem(Player player, int itemIndex)
} // end of class Store
