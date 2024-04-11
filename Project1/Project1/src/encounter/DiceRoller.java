package encounter;
import java.util.Random;

public class DiceRoller {
   
    public static int rollD20() {
        Random random = new Random();
        return random.nextInt(20) + 1;
    }

    public static int rollDamage(int typedie){
        Random random = new Random();
        return random.nextInt(typedie) + 1;
    };

}
