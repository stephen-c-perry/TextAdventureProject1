package enemy;

public class Wolfpack extends Enemy {

    public Wolfpack(String name, int hp, int dc) {
        super(name, hp, dc);
    }

    // print statements to initiate wolfpack encounter
    //

    public boolean isAlive() {
        return getHp() > 0;
    }
}
