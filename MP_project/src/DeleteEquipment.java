import java.util.HashMap;
import java.util.Map;

public class DeleteEquipment {

    private DatabaseManager databaseManager;
    private Map<String,Weapon> databaseW = DatabaseManager.obtainDatabaseW();
    private Map<String,Armor> databaseA = DatabaseManager.obtainDatabaseA();
    private Map<String,Armor> databaseM = DatabaseManager.obtainDatabaseM();

    //Constructor


    public DatabaseManager getDatabaseManager() {
        return databaseManager;
    }

    public void setDatabaseManager(DatabaseManager databaseManager) {
        this.databaseManager = databaseManager;
    }

    public Map<String, Weapon> getDatabaseW() {
        return databaseW;
    }

    public void setDatabaseW(Map<String, Weapon> databaseW) {
        this.databaseW = databaseW;
    }

    public Map<String, Armor> getDatabaseA() {
        return databaseA;
    }

    public void setDatabaseA(Map<String, Armor> databaseA) {
        this.databaseA = databaseA;
    }

    public Map<String, Armor> getDatabaseM() {
        return databaseM;
    }

    public void setDatabaseM(Map<String, Armor> databaseM) {
        this.databaseM = databaseM;
    }
}
