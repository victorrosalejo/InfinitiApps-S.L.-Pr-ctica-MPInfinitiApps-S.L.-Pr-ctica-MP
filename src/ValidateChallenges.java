import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ValidateChallenges {
    private DatabaseManager databaseManager;
    private Map<String, List<Challenge>> databaseP = new HashMap<>();

    public void ValidateChallenges(){
    databaseManager = new DatabaseManager();
    databaseP = databaseManager.obtainDatabaseP();
    List<Challenge> challenges =new ArrayList<>();
    }

    public DatabaseManager getDatabaseManager() {
        return databaseManager;
    }

    public void setDatabaseManager(DatabaseManager databaseManager) {
        this.databaseManager = databaseManager;
    }

    public Map<String, List<Challenge>> getDatabaseP() {
        return databaseP;
    }

    public void setDatabaseP(Map<String, List<Challenge>> databaseP) {
        this.databaseP = databaseP;
    }
}
