package enemy;

public class Dragon extends Enemy {

    public Dragon(String name, int hp, int difficultyClass) {
        super(name, hp, difficultyClass);

    }

    public boolean isAlive() {
        return getHp() > 0;
    }

}
