import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ArmorSet {
    private Map<String , List<Armor>> armorSet = new HashMap<>();
    private DatabaseManager databaseManager;



    public Character ArmorSet(Character c){

        return c;
    }

    public Map<String, List<Armor>> getArmorSet() {
        return armorSet;
    }

    public void setArmorSet(Map<String, List<Armor>> armorSet) {
        this.armorSet = armorSet;
    }

    //constuctor


    public DatabaseManager getDatabaseManager() {
        return databaseManager;
    }

    public void setDatabaseManager(DatabaseManager databaseManager) {
        this.databaseManager = databaseManager;
    }
}
