import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class History {

    private List<Match> matches = new ArrayList<>();
    private Map<String, User> databaseU = new HashMap<>();
    private DatabaseManager databaseManager;

    public void History(){
        databaseU = databaseManager.obtainDatabaseU();
    }
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
        return databaseManager;
    }

    public void setDataBaseManager(DatabaseManager dataBaseManager) {
        this.databaseManager = dataBaseManager;
    }

    public Map<String, User> getDatabaseU() {
        return databaseU;
    }

    public void setDatabaseU(Map<String, User> databaseU) {
        this.databaseU = databaseU;
    }
}

