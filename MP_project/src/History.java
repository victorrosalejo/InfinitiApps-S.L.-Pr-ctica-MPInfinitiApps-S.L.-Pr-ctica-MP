import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class History {

    private List<Match> matches = new ArrayList<>();
    private Map<String, User> databaseU = DatabaseManager.obtainDatabaseU;
    private DatabaseManager dataBaseManager;


    public void appendMatch(Match match, User user){
        // Implementar despues
    }

    public List<Match> getMatches() {
        return matches;
    }

    public void setMatches(List<Match> matches) {
        this.matches = matches;
    }

    public DatabaseManager getDataBaseManager() {
        return dataBaseManager;
    }

    public void setDataBaseManager(DatabaseManager dataBaseManager) {
        this.dataBaseManager = dataBaseManager;
    }

    public Map<String, User> getDatabaseU() {
        return databaseU;
    }

    public void setDatabaseU(Map<String, User> databaseU) {
        this.databaseU = databaseU;
    }
}

