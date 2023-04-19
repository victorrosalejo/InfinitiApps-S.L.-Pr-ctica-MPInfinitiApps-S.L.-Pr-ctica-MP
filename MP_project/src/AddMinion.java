import java.util.List;
import java.util.Map;

public class AddMinion {

    private DatabaseManager databaseManager;
    private Map<String, List<Minion>> databaseM = DatabaseManager.obtainDatabaseM();
    private Minion m;



    private void appendMinion(Minion m, Map<String, List<Minion>> databaseM){

        //implementado despues

    }
    public Character AddMinion(Character c){
        return c;
    }

    public DatabaseManager getDatabaseManager() {
        return databaseManager;
    }

    public void setDatabaseManager(DatabaseManager databaseManager) {
        this.databaseManager = databaseManager;
    }

    public Map<String, List<Minion>>  getDatabaseM() {
        return databaseM;
    }

    public void setDatabaseM(Map<String, List<Minion>> databaseM) {
        this.databaseM = databaseM;
    }

    public Minion getM() {
        return m;
    }

    public void setM(Minion m) {
        this.m = m;
    }
}
