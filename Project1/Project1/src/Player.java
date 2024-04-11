public class Player {

    private String name;
    private int hp;
    private int strength;
    private int dexterity;
    private int wisdom;
    private int constitution;
    private int dying;
    private int wounded;


    //Getters and Setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public int getStrength() {
        return strength;
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }

    public int getDexterity() {
        return dexterity;
    }

    public void setDexterity(int dexterity) {
        this.dexterity = dexterity;
    }

    public int getWisdom() {
        return wisdom;
    }

    public void setWisdom(int wisdom) {
        this.wisdom = wisdom;
    }

    public int getConstitution() {
        return constitution;
    }

    public void setConstitution(int constitution) {
        this.constitution = constitution;
    }

    public int getDying() {
        return dying;
    }

    public void setDying(int dying) {
        this.dying = dying;
    }

    public int getWounded() {
        return wounded;
    }

    public void setWounded(int wounded) {
        this.wounded = wounded;
    }


    // Constructor
    public Player(String name, int hp, int strength, int dexterity, int wisdom, int constitution, int dying,
            int wounded) {
        this.name = name;
        this.hp = hp;
        this.strength = strength;
        this.dexterity = dexterity;
        this.wisdom = wisdom;
        this.constitution = constitution;
        this.dying = dying;
        this.wounded = wounded;
    }

    // print stats
    public void printStats() {
        System.out.println("Here are your character's stats: ");
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Name: ");
        stringBuilder.append(name);
        stringBuilder.append("\n");
        stringBuilder.append("HP: ");
        stringBuilder.append(hp);
        stringBuilder.append("\n");
        stringBuilder.append("Strength: ");
        stringBuilder.append(strength);
        stringBuilder.append("\n");
        stringBuilder.append("Dexterity: ");
        stringBuilder.append(dexterity);
        stringBuilder.append("\n");
        stringBuilder.append("Wisdom: ");
        stringBuilder.append(wisdom);
        stringBuilder.append("\n");
        stringBuilder.append("Constitution: ");
        stringBuilder.append(constitution);
        stringBuilder.append("\n");
        System.out.println(stringBuilder.toString());
    }

    public void Attack(String stat) {
        int roll = DiceRoller.rollD20() + stat;
    };

}
