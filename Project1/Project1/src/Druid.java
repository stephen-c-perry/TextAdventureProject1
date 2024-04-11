public class Druid extends Player{

    public Druid(String name, int hp, int strength, int dexterity, int wisdom, int constitution, int dying, int wounded) {
        super(name, hp, strength, dexterity, wisdom, constitution, dying, wounded);
        
    }
    
    public void attack(){
        int roll = DiceRoller.rollD20() + Druid.wisdom();
    }

}
