import java.util.Scanner;

import encounter.Encounter;
import enemy.Wolfpack;
import player.Druid;
import player.Fighter;
import player.Player;
import player.Ranger;

public class MainGameController {
    public static String name;

    public static void main(String[] args) {
        // Welcome message
        System.out.println("Welcome!");

        // Character Creation //
        Scanner in = new Scanner(System.in);
        // prompt for name
        System.out.print("Enter a name for your character: ");
        name = in.nextLine();
        // prompt for player class
        System.out.println("Chose your class by entering a number: \n1 = Fighter\n2 = Druid\n3 = Ranger\n4 = Wizard");
        int playerClass = in.nextInt();
        // close scanner
        in.close();
        // create new object depending on chosen class

        Player player = null;

        switch (playerClass) {
            case 1:
                player = new Fighter(name);
                player.printStats();
                break;
            case 2:
                player = new Druid(name);
                player.printStats();
                break;
            case 3:
                player = new Ranger(name);
                player.printStats();
                break;
            case 4:
                player = new Wizard(name);
                player.printStats();
                break;
        }

        //print intro

        //encounter object
        Encounter encounter = new Encounter(player);

        //sequence of events for encounter

        Wolfpack wolfpack = new Wolfpack(20, 15);
        encounter.setEnemy(wolfpack);

        // - easy mode or normal mode (easy mode gets +2 to hp


        // Set scene //
        // -relay intel
        // -give charge
        // Are you ready to embark? y/n

        // Heading towards mountain encounter pack of wolves

        // Encounter 1 (Wolves)//

        // If survive, continue path reach crossroads
        // -all paths lead to mountain hoose which path to take
        // -Toxic Swamp, Rocky Terrain, Forest

        // Skill check to navigate terrain
        // -Swamp (con save/poison damage)
        // -Rocky Terrain (dex save/ physical damage) -traverse
        // -Forest (wis save/ hunger lose hp) -find food

    }

}
