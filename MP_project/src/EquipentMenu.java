import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class EquipentMenu {

    private Map<String, List<Armor>> databaseA = DatabaseManager.obtainDatabaseA;
    private Map<String, List<Weapon>> databaseW = DatabaseManager.obtainDatabaseW;
    private Map<String,Character> databaseC = DatabaseManager.obtainDatabaseC;
    private Boolean duel;
    private DatabaseManager databaseManager;

    public Map<String, List<Armor>> getDatabaseA() {
        return databaseA;
    }

    public void setDatabaseA(Map<String, List<Armor>> databaseA) {
        this.databaseA = databaseA;
    }

    public Map<String, List<Weapon>> getDatabaseW() {
        return databaseW;
    }

    public void setDatabaseW(Map<String, List<Weapon>> databaseW) {
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
