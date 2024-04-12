import java.util.Scanner;

import encounter.Encounter;
import enemy.Wolfpack;
import player.Druid;
import player.Fighter;
import player.Player;
import player.Ranger;
import player.Wizard;

public class MainGameController {
    public static String name;

    public static void main(String[] args) throws InterruptedException {
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
        // print intro
        System.out
                .println("The king's treasure has been stolen and it's being held in the mountain guarded by a dragon");

        boolean ready = false;

        while (!ready) {
            System.out.println("Will you go and take back the king's treasure?\nEnter yes or no");
            String response = in.next();
            if (response.equalsIgnoreCase("yes")) {
                ready = true;
                System.out.println("Then let's begin...");
            } else if (response.equalsIgnoreCase("no")) {
                System.out.println("That's unfortunate. The adventure ends here.");
            } else {
                System.out.println("Invalid response. Please enter 'yes' or 'no'.");
            }
        }

        // close scanner
        in.close();

        Thread.sleep(2000);

        // first encounter
        System.out.println("After about 1 hour on the path to the mountains you are suddenly surrounded by pack of wolves!");

        Encounter encounter = new Encounter(player);
        Wolfpack wolfpack = new Wolfpack("Wolfpack", 20, 15);
        encounter.setEnemy(wolfpack);
        encounter.setPlayer(player);
        encounter.run();

        // If survive, continue path reach crossroads
        // -all paths lead to mountain hoose which path to take
        // -Toxic Swamp, Rocky Terrain, Forest

        // Skill check to navigate terrain
        // -Swamp (con save/poison damage)
        // -Rocky Terrain (dex save/ physical damage) -traverse
        // -Forest (wis save/ hunger lose hp) -find food

    }

}
