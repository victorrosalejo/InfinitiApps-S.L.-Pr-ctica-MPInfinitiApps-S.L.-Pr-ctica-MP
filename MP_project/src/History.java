import java.util.ArrayList;
import java.util.List;

public class History {

    private List<Match> matches = new ArrayList<>();
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
}
