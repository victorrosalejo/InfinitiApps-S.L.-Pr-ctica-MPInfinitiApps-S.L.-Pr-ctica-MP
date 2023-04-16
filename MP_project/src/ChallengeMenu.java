import java.util.Map;

public class ChallengeMenu {
    private DatabaseManager databaseManager;
    private Map<String,Challenge> databaseP;

    public DatabaseManager getDatabaseManager() {
        return databaseManager;
    }

    public void setDatabaseManager(DatabaseManager databaseManager) {
        this.databaseManager = databaseManager;
    }

    public Map<String, Challenge> getDatabaseP() {
        return databaseP;
    }

    public void setDatabaseP(Map<String,Challenge> databaseP) {
        this.databaseP = databaseP;
    }

    /*private sendChallenge(User:defiant;User:defied;int:gold){}*/


}
