package scene;

public class Scene {
    private String name;
    private int dc;
    
    public Scene(String name, int dc) {
        this.name = name;
        this.dc = dc;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getDc() {
        return dc;
    }
    public void setDc(int dc) {
        this.dc = dc;
    }


    
}
