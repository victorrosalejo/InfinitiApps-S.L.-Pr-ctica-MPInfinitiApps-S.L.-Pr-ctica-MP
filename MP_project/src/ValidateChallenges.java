import java.util.Map;

public class ValidateChallenges {
    private DatabaseManager databaseManager;
    private Map<String, User> databaseP = DatabaseManager.obtainDatabaseP();
    private Map<String, User> databaseH = DatabaseManager.obtainDatabaseH();


    public void ValidateChallenges(){
    //constructor
}

    public DatabaseManager getDatabaseManager() {
        return databaseManager;
    }

    public void setDatabaseManager(DatabaseManager databaseManager) {
        this.databaseManager = databaseManager;
    }

    public Map<String, User> getDatabaseP() {
        return databaseP;
    }

    public void setDatabaseP(Map<String, User> databaseP) {
        this.databaseP = databaseP;
    }

    public Map<String, User> getDatabaseH() {
        return databaseH;
    }

    public void setDatabaseH(Map<String, User> databaseH) {
        this.databaseH = databaseH;
    }
}
