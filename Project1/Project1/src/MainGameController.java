import java.util.Scanner;

import encounter.*;
import enemy.*;
import player.*;
import scene.*;

public class MainGameController {

    public static void main(String[] args) throws InterruptedException {
        // Welcome message
        System.out.println("------------------------------");
        System.out.println("Welcome!");
        System.out.println("------------------------------");

        // Character Creation //
        Scanner in = new Scanner(System.in);
        // prompt for name
        System.out.print("Enter a name for your character: ");
        String name = in.nextLine();
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

        Thread.sleep(2000);

        // first encounter
        System.out.println(
                "After about 1 hour on the path to the mountains you are suddenly surrounded by pack of wolves!");

        Encounter encounter = new Encounter(player);
        Wolfpack wolfpack = new Wolfpack("Wolfpack", 25, 8);
        encounter.setEnemy(wolfpack);
        encounter.setPlayer(player);
        encounter.run(2); // 2 is the attack modifier

        // If survive, continue path reach crossroads
        System.out.println("\nYou continue your journey and come to a crossroads.");
        System.out.println(
                "The path splits into three.\nIt looks like all paths lead to the mountain. Which will you choose?\n");
        System.out.println("1: Left 2: Center 3: Right");

        // Scanner in = new Scanner(System.in);
        int pathChoice = in.nextInt();

        Scene scene = null;

        switch (pathChoice) {
            case 1:
                scene = new Swamp(12); // makes con save for poison damage
                break;
            case 2:
                scene = new RockyTerrain(10); // takes 2 damage
                break;
            case 3:
                scene = new Forest(8); // no damage
                break;
        }

        scene.setPlayer(player);
        scene.run();

        System.out.println("You approach the mountain and enter through a cave opening.");
        Thread.sleep(1500);
        System.out.println();
        System.out.println("You find the dragon and see the King's treasure behind it.  Are you ready to fight? ");

        boolean ready2 = false;

        while (!ready2) {
            String response = in.next();
            if (response.equalsIgnoreCase("yes")) {
                ready2 = true;
                System.out.println("Huzzah!");
            } else if (response.equalsIgnoreCase("no")) {
                System.out.println("That's unfortunate. The adventure ends here.");
            } else {
                System.out.println("Invalid response. Please enter 'yes' or 'no'.");
            }
        }


        Encounter finalBoss = new Encounter(player);
        Dragon dragon = new Dragon("Dragon", 25, 8);
        finalBoss.setEnemy(dragon);
        finalBoss.setPlayer(player);
        finalBoss.run(4); // 4 is the attack modifier
        System.out.println("The End");

    }

}
