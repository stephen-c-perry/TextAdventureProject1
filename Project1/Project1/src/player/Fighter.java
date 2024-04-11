package player;
import encounter.DiceRoller;

public class Fighter extends Player {

    public Fighter(String name){
        super(name, 12, 20, 10, 10, 8, 10);
        
    }
    
    public int attack(){
        int roll = DiceRoller.rollD20() + getStrength();
        System.out.println("Your attack roll plus strength mod is " + roll);
        return roll;
    }
    
}
