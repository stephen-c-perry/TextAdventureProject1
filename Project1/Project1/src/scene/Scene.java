package scene;

import player.Player;

public class Scene {

    public Scene(Player player, int dc) {
        this.player = player;
        this.dc = dc;
    }

    private Player player = null;
    private int dc;

    public Scene(int dc) {
        // this.name = name;
        this.dc = dc;
    }

    public Player getPlayer() {
        return player;
    }

    public void setPlayer(Player player) {
        this.player = player;
    }

    // public String getName() {
    // return name;
    // }
    // public void setName(String name) {
    // this.name = name;
    // }
    public int getDc() {
        return dc;
    }

    public void setDc(int dc) {
        this.dc = dc;
    }

    public int skillCheck() {
        return 0;
    }

    public void run() throws InterruptedException {

    }

}
