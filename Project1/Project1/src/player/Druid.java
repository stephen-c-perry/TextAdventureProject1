package player;
import encounter.*;


public class Druid extends Player{

    public Druid(String name) {
        super(name, 8, 16, 8, 12, 10, 12);
        
    }
    
    public int attack(){
        int roll = DiceRoller.rollD20() + getWisdom();
        System.out.println("Your attack roll plus wisdom mod is " + roll);
        return roll;
    }

}
