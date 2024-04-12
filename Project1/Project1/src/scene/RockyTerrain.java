package scene;

public class RockyTerrain extends Scene {

    public RockyTerrain(int dc) {
        super(dc);
    }

    @Override
    public void run() {
        System.out.println("You struggle through rocky terrain and twist your ankle.  You take 2 damage.");
        int damage = 2;
        getPlayer().setHp(getPlayer().getHp() - damage);
    }
}
