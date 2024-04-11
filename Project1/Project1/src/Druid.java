public class Druid extends Player{

    public Druid(String name, int hp, int ac, int strength, int dexterity, int wisdom, int constitution, int dying, int wounded) {
        super(name, hp, strength, dexterity, wisdom, constitution, dying, wounded);
        
    }
    
    public int attack(){
        int roll = DiceRoller.rollD20() + getWisdom();
        System.out.println("Your attack roll plus wisdom mod is " + roll);
        return roll;
    }

}
