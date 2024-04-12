package player;
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
    public Player(String name, int hp, int ac, int strength, int dexterity, int wisdom, int constitution) {
        this.name = name;
        this.hp = hp;
        this.ac = ac;
        this.strength = strength;
        this.dexterity = dexterity;
        this.wisdom = wisdom;
        this.constitution = constitution;
        // this.dying = dying;
        // this.wounded = wounded;
    }

    // print stats
    public void printStats() {
        System.out.printf("\nHere are your character's stats: %nName: %s%nHP: %d%nAC: %d%nStrength: %d%nDexterity: %d%nWisdom: %d%nConstitution: %d%n",
                    name, hp, ac, strength, dexterity, wisdom, constitution);
    }

    // I want a method to roll a d20 and the given ability modifier
    // ex: for a Fighter, roll a d20 and add strength for final result
    // that result gets checked against the enemy's DC
    public int attack() {
        return 0;
    }


    public boolean isAlive() {
        return hp > 0;
    }

    public int skillCheck(){
        return 0;
    }

}
