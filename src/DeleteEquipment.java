import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class DeleteEquipment implements Serializable {

    private DatabaseManager databaseManager;
    private Map<String, List<Weapon>> databaseW = new HashMap<>();
    private Map<String,List<Armor>> databaseA = new HashMap<>();
    private Map<String,List<Minion>> databaseM = new HashMap<>();
    private Map<String,List<Modifiers>> databaseMo = new HashMap<>();

    public  void DeleteEquipment(Character c){
        databaseManager = new DatabaseManager();
        String name = c.getName();

        databaseA = databaseManager.obtainDatabaseA();
        databaseA.remove(name);
        databaseManager.saveDatabaseA(databaseA);

        databaseW = databaseManager.obtainDatabaseW();
        databaseW.remove(name);
        databaseManager.saveDatabaseW(databaseW);

        databaseM = databaseManager.obtainDatabaseM();
        databaseM.remove(name);
        databaseManager.saveDatabaseM(databaseM);

        databaseMo = databaseManager.obtainDatabaseMo();
        databaseMo.remove(name);
        databaseManager.saveDatabaseMo(databaseMo);

    }

    public DatabaseManager getDatabaseManager() {
        return databaseManager;
    }

    public void setDatabaseManager(DatabaseManager databaseManager) {
        this.databaseManager = databaseManager;
    }

}
