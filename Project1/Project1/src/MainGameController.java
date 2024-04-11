import java.util.Scanner;

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
        switch (playerClass) {
            case 1:
                Fighter playerFighter = new Fighter(name, 12, 20, 10, 10, 8, 10, 0, 0);
                playerFighter.printStats();
                break;
            case 2:
                Druid playerDruid = new Druid(name, 8, 16, 8, 12, 10, 12, 0, 0);
                playerDruid.printStats();
                break;
            case 3:
                Ranger playerRanger = new Ranger(name, 10, 20, 10, 10, 10, 10, 0, 0);
                playerRanger.printStats();
                break;
            case 4:
                Wizard playerWizard = new Wizard(name, 8, 16, 8, 12, 14, 10, 0, 0);
                playerWizard.printStats();
                break;
        }

        /*WORKS FINE UP TO HERE */

        

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
