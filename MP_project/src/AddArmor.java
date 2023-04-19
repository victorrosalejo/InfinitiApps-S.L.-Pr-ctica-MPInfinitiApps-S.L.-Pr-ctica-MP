import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class AddArmor {

    private DatabaseManager databaseManager;
    private Map<String, List<Armor>> databaseA = new HashMap<>();
    private Armor a = new Armor();



    public DatabaseManager getDatabaseManager() {
        return databaseManager;
    }

    public void setDatabaseManager(DatabaseManager databaseManager) {
        this.databaseManager = databaseManager;
    }

    public Map<String, List<Armor>> getDatabaseA() {
        return databaseA;
    }

    public void setDatabaseA(Map<String, List<Armor>> databaseA) {
        this.databaseA = databaseA;
    }

    public Armor getA() {
        return a;
    }

    public void setA(Armor a) {
        this.a = a;
    }

    public Character AddArmor(Character c){
        this.databaseA = this.databaseManager.obtainDatabaseA();
        return c;
    }

    private Character appendArmor(Character c){

    }

}
