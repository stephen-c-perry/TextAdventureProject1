package scene;

import encounter.DiceRoller;

public class Swamp extends Scene {

    public Swamp(int dc) {
        super(dc);
    }

    @Override
    public void run() {
        System.out.println(
                "As you head down this path you feel your feet sinking into the ground as you have stumbled into a Swamp.");
        System.out.println(
                "You begin feeling nauseous from what seems like toxic fumes.  Make a constitution save. \nrolling... ");
        if (DiceRoller.rollD20() < getDc()) {
            int damage = 4;
            getPlayer().setHp(getPlayer().getHp() - damage);
            System.out.println("You take " + damage + " damage.");

        } else {
            System.out.println("You resist the toxic fumes and take no damage.");
        }
        if (!getPlayer().isAlive()) {
            System.out.println("You have been defeated!");
            System.exit(0);
        }

    }
}
