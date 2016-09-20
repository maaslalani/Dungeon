import java.util.Scanner;
import java.util.Random;
/**
 * A text-based adventure action game.
 * 
 * @author Maas Lalani
 * @version 1.0 2015-11-17
 */
public class TheDungeon
{
    /**
     * The delay used for display messages.
     */
    public static final long DELAY = 1000;   
    public int buttonPressed;

    /**
     * The main executable method.
     * 
     * @param argument not used
     */
    public static void main(String[] argument) throws InterruptedException
    {
        // Characters
        Player player = new Player();

        // Variables
        int swordDropChance = 20; // percent
        int healthPotionDropChance = 50; // percent
        int armourDropChance = 35; // percent
        boolean running = true;
        boolean ranAway = false;

        // Objects
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);

        // Main loop
        while (running) 
        {
            // Main enemy 
            Enemy villain = new Enemy();

            while (villain.health() > 0)
            {
                // statistics
                System.out.println("\f# A " + villain.name() + " appeared #");

                System.out.println("\n# You have " + player.health() + " HP #");
                System.out.println("# Enemy has " + villain.health() + " HP #");
                System.out.println("# Potions left: " + player.getPotions() + " #");
                System.out.println("# Enemies killed: " + player.enemiesKilled() + " #");
                // Sword
                if (player.hasSword())
                {
                    System.out.println("\n# Sword type: " + player.sword.name() + " | hitpoints: " + player.sword.hitpoints() + "  #");
                } // end of if (player.hasSword())

                // Armour 
                if (player.hasArmour())
                {
                    System.out.println("\n# Armour type: " + player.armour.name() + " | Armour hitpoints: " + player.armour.hitpoints() + "  #");
                } // end of if (player.hasArmour())

                startBattle();
                String choice = scanner.nextLine();

                int choice1;

                try 
                {
                    choice1 = Integer.parseInt(choice);
                }

                catch (NumberFormatException nfe)
                {
                    choice1 = 3;
                }

                if (choice1 == 1) 
                {
                    ranAway = false;
                    int playerAttack = player.attack();
                    int enemyAttack = villain.attack();

                    System.out.println("\nYou dealt " + playerAttack + " damage.");
                    System.out.println("You took " + enemyAttack + " damage.");

                    villain.takeDamage(playerAttack);
                    player.takeDamage(enemyAttack);

                    Thread.sleep(DELAY);
                } // end of if (choice1 == 1)

                else if (choice1 == 2)
                {
                    if (player.health() > 70)
                    {
                        System.out.println("\nYou are healthy, and need not a potion.");
                    } // end of if (player.health() > 70)

                    else
                    {
                        player.usePotion();

                        System.out.println("\nYou drank the potion. Health restored by: " + Player.POTION_HEALING + " HP");
                        System.out.println("Current HP: " + player.health());
                    } // end of else {...}
                    Thread.sleep(DELAY);
                } // end of else if (choice1 == 2)  

                else if (choice1 == 3)
                {
                    System.out.println("\nYou successfully ran away!");
                    Thread.sleep(DELAY);

                    villain.takeDamage(villain.health());
                    ranAway = true;
                    // continue GAME;
                } // end of else if (choice1 == 3)

                if (player.health() <= 0)
                {
                    System.out.println("\nUh oh! You have died, game over.");

                    System.out.print("Type '1' to try again. ");
                    int input2 = scanner.nextInt();

                    if (input2 == 1) 
                    {
                        running = true;
                        player.reset();
                    } // end of if (input2.equals("1")) 

                    else 
                    {
                        System.out.println("\nProgram terminated.");
                        villain.takeDamage(villain.health());
                        running = false;
                        return;
                    } // end of else {...}     
                }  // end of if (player.health() <= 0)
            } // end of loop while (villain.health() > 0)

            if (!ranAway)
            {
                player.increaseEnemiesKilled();
            }
            
            if (!ranAway)
            {
                if (random.nextInt(100) < swordDropChance)
                {
                    if (player.hasSword())
                    {
                        System.out.println("\n The " + villain.name() + " dropped a sword, but you already have one.");
                    } // end of if (player.hasSword())
                    else
                    {
                        player.addSword("");
                        System.out.println("\n The " + villain.name() + " dropped a " + player.sword.name() + ".\nYour attack damage has now increased by " + player.sword.damageIncrease() + ".");
                    } // end of else {...}  
                    Thread.sleep(DELAY);            
                } // end of if (random.nextInt(100) < swordDropChance)

                else if (random.nextInt(100) < armourDropChance)
                {
                    if (player.hasArmour())
                    {
                        System.out.println("\n The " + villain.name() + " dropped some armour, but you already have some.");
                    } // end of if (player.hasArmour())
                    else
                    {
                        player.addArmour("leather");
                        System.out.println("\n The " + villain.name() + " dropped " + player.armour.name() + ".\nYour damage taken has now decreased by " + player.armour.damageBlocked() + ".");
                    } // end of else {...}
                    Thread.sleep(DELAY); 
                } // end of else if (random.nextInt(100) < armourDropChance)

                else if (random.nextInt(100) < healthPotionDropChance)
                {
                    player.addPotions(1);
                    System.out.println("\n The " + villain.name() + " dropped a health potion.");
                    Thread.sleep(DELAY);
                } // end of else if (random.nextInt(100) < healthPotionDropChance)  
            } // end of if(!ranAway)
        } // end of loop while (running)
    } // end of main(String[] argument)

    /**
     * The battle prompt menu of this program.
     */
    public static void startBattle()
    {
        System.out.println("\n1. Attack.");
        System.out.println("2. Use potion.");
        System.out.println("3. Run!");
        System.out.print("\nChoice? ");
    } // end of startBattle()

} // end of class TheDungeon