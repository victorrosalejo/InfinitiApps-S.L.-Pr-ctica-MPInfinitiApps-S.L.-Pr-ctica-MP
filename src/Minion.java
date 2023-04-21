public class Minion {

    private String name;
    private int hitPoints;
    private String description;
    private TMinion tipominion;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHitPoints() {
        return hitPoints;
    }

    public void setHitPoints(int hitPoints) {
        this.hitPoints = hitPoints;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public TMinion getTipominion() {
        return tipominion;
    }

    public void setTipominion(TMinion tipominion) {
        this.tipominion = tipominion;
    }
}
