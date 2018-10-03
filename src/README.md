# The Dungeon
A text-based adventure game, coded _entirely_ in Java.

## Premise:
You are trapped in a dungeon and there is _no_ way out. Enemies are spawining one after the other. It is your goal is to kill as many as you can, without dying yourself.

## Gameplay:
Throughout the game you are given a certain number of options. Type the corresponding number as your choice to select that option. The following is a brief description of what each of the options accomplishes.  

__1. Attack:__ You deal a _random_ amount of damage to the enemy, as it also deals damage to you.  
__2. Use Potion:__ Drink a potion that restores your health by a _certain_ amount.  
__3. Run Away:__ Flee from the enemy and spawn a new enemy.  
__4. Exit:__ Quit the game with or without saving your progress.

## Usage:
```bash
$ git clone https://github.com/Maaslalaniii/Dungeon.git
$ cd Dungeon
$ javac TheDungeon.java
$ java TheDungeon
```

The game will start after those commands are run.

![List of commands in sequential order.](https://camo.githubusercontent.com/51f872bab74820723f6b986b4b22505c79358157/687474703a2f2f696d6167652e70726e747363722e636f6d2f696d6167652f32303866373935643334633134303035383464626336356631306538353930312e706e67)

For a better playing experience use the BlueJ IDE and run the main method found in TheDungeon class.

![BlueJ Running the main method.](https://camo.githubusercontent.com/cbd56c6847966e916062adeec8b339a0383989f3/687474703a2f2f696d6167652e70726e747363722e636f6d2f696d6167652f30656634353766373336363134313264393065363530663433623763333636382e706e67)

## Features:
* Enemies drop swords, armour, and health potions upon defeat.
* Swords and armour come in different variety.
* Ability to load and save state of the game.
* Gold coins as currency.
* Store to purchase various game items.

## Todo:
* ~~Add currency such as gold coins.~~
* ~~Add a store to purchase swords and armour.~~
* ~~Penalty for running away.~~
* Add more names to the enemy list.
* Give enemies special abilities.
* Give player special power-ups.
* Keep track of highest enemies killed.
* ~~Encrypted data.~~
* Implement a graphical user interface.

## Contribute:
Contributions that enhance gameplay are always welcome!
