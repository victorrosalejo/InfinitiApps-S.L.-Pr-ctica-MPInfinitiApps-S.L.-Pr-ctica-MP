import java.util.HashMap;
import java.util.Map;

public class Ranking {
    private Map<String,Character> databaseR = new HashMap<>();
    private DatabaseManager dataBaseManager;

    public void Ranking (User user){
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
