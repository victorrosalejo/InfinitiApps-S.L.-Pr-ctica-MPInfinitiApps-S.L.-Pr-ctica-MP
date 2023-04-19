
import java.util.Map;

public class Result {

    private Map<String, History> databaseH = DatabaseManager.obtainDatabaseH;
    private Map<String, Character> databaseC = DatabaseManager.obtainDatabaseC;
    private DatabaseManager databaseManager;

    // Implementar
    public Result(Combat combat){

    }
    private void showResult(User u1, User u2, Combat combat){

    }

    public Map<String, History> getDatabaseH() {
        return databaseH;
    }

    public void setDatabaseH(Map<String, History> databaseH) {
        this.databaseH = databaseH;
    }

    public Map<String, Character> getDatabaseC() {
        return databaseC;
    }

    public void setDatabaseC(Map<String, Character> databaseC) {
        this.databaseC = databaseC;
    }

    public DatabaseManager getDatabaseManager() {
        return databaseManager;
    }

    public void setDatabaseManager(DatabaseManager databaseManager) {
        this.databaseManager = databaseManager;
    }
}
