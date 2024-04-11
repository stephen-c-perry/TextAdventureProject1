public class Enemy {
    private String name;
     private int hp;
    private int dc;

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

    public int getDc() {
        return dc;
    }

    public void setDc(int dc) {
        this.dc = dc;
    }

    public Enemy(int hp, int dc) {
        this.hp = hp;
        this.dc = dc;
    }

    public int attack(int mod){
        int roll = DiceRoller.rollD20() + mod;
        System.out.println("Attack roll is " + roll);
        return roll;
    }

    public int damage(int damageDie){
        int roll = DiceRoller.rollDamage(damageDie);
        System.out.println("Your attack roll plus wisdom mod is " + roll);
        return roll;
    }
}
