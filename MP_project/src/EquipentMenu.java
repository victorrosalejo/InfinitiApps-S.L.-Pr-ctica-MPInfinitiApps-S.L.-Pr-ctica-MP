import java.util.Date;
import java.util.HashMap;
import java.util.Map;

public class EquipentMenu {

    private Map<String, Armor> databaseA = new HashMap<>();
    private Map<String, Weapon> databaseW = new HashMap<>();
    private Map<String,Character> databaseC = new HashMap<>();
    private Boolean duel;
    private DatabaseManager databaseManager;

    public Map<String, Armor> getDatabaseA() {
        return databaseA;
    }

    public void setDatabaseA(Map<String, Armor> databaseA) {
        this.databaseA = databaseA;
    }

    public Map<String, Weapon> getDatabaseW() {
        return databaseW;
    }

    public void setDatabaseW(Map<String, Weapon> databaseW) {
        this.databaseW = databaseW;
    }

    public Map<String, Character> getDatabaseC() {
        return databaseC;
    }

    public void setDatabaseC(Map<String, Character> databaseC) {
        this.databaseC = databaseC;
    }

    public Boolean getDuel() {
        return duel;
    }

    public void setDuel(Boolean duel) {
        this.duel = duel;
    }

    public DatabaseManager getDatabaseManager() {
        return databaseManager;
    }

    public void setDatabaseManager(DatabaseManager databaseManager) {
        this.databaseManager = databaseManager;
    }

// Constructor
}
