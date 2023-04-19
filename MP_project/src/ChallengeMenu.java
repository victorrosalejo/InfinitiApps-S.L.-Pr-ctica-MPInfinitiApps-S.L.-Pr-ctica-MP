import java.util.List;
import java.util.Map;

public class ChallengeMenu {
    private DatabaseManager databaseManager;
    private Map<String, List<Challenge>> databaseP = DatabaseManager.obtainDatabaseP ;

    public DatabaseManager getDatabaseManager() {
        return databaseManager;
    }

    public void setDatabaseManager(DatabaseManager databaseManager) {
        this.databaseManager = databaseManager;
    }

    public Map<String, List<Challenge>> getDatabaseP() {
        return databaseP;
    }

    public void setDatabaseP(Map<String,List<Challenge>> databaseP) {
        this.databaseP = databaseP;
    }

    /*private sendChallenge(User:defiant;User:defied;int:gold){}*/


}
