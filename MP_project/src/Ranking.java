import java.util.Map;

public class Ranking {
    private Map<String,Character> databaseR = DatabaseManager.obtainDatabaseR;
    private DatabaseManager dataBaseManager;

    public void UpdateRanking (User user){
            /* Implementar luego  */
    }

    public Map<String, Character> getDatabaseR() {
        return databaseR;
    }

    public void setDatabaseR(Map<String, Character> databaseR) {
        this.databaseR = databaseR;
    }

    public DatabaseManager getDataBaseManager() {
        return dataBaseManager;
    }

    public void setDataBaseManager(DatabaseManager dataBaseManager) {
        this.dataBaseManager = dataBaseManager;
    }
}
