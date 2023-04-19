import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class AddWeapon {
    private DatabaseManager databaseManager;
    private Map<String, List<Weapon>> databaseW = new  HashMap<>();
    private Weapon w;


    private void appendWeapon(Weapon w, Map<String, Weapon> databaseW){


    }
    public Character AddWeapon(Character c){
        return c;
    }

    public DatabaseManager getDatabaseManager() {
        return databaseManager;
    }

    public void setDatabaseManager(DatabaseManager databaseManager) {
        this.databaseManager = databaseManager;
    }

    public Map<String, List<Weapon>> getDatabaseW() {

        return databaseW;
    }

    public void setDatabaseW(Map<String, List<Weapon>> databaseW) {

        this.databaseW = databaseW;
    }

    public Weapon getW() {

        return w;
    }

    public void setW(Weapon w) {

        this.w = w;
    }


}
