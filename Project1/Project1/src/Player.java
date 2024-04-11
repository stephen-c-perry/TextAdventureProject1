public class Player {

    private String name;
    private int hp;
    private int ac;
    private int strength;
    private int dexterity;
    private int wisdom;
    private int constitution;
    // private int dying; stretch goal death saves
    // private int wounded; stretch goal death saves

    // Getters and Setters
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

    // public int getDying() {
    // return dying;
    // }

    // public void setDying(int dying) {
    // this.dying = dying;
    // }

    // public int getWounded() {
    // return wounded;
    // }

    // public void setWounded(int wounded) {
    // this.wounded = wounded;
    // }

    public int getAc() {
        return ac;
    }

    public void setAc(int ac) {
        this.ac = ac;
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
        // this.dying = dying;
        // this.wounded = wounded;
    }

    // print stats
    public void printStats() {

        System.out.println("\nHere are your character's stats: ");
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("\n");
        stringBuilder.append("Name: ");
        stringBuilder.append(name);
        stringBuilder.append("\n");
        stringBuilder.append("HP: ");
        stringBuilder.append(hp);
        stringBuilder.append("AC: ");
        stringBuilder.append(ac);
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

    // I want a method to roll a d20 and the given ability modifier
    // ex: for a Fighter, roll a d20 and add strength for final result
    // that result gets checked against the enemy's DC
    public void Attack() {

    };

}
