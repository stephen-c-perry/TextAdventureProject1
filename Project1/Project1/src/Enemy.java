public class Enemy {
    private int hp;
    private int difficultyClass;

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public int getDifficultyClass() {
        return difficultyClass;
    }

    public void setDifficultyClass(int difficultyClass) {
        this.difficultyClass = difficultyClass;
    }

    public Enemy(int hp, int difficultyClass) {
        this.hp = hp;
        this.difficultyClass = difficultyClass;
    }

}
