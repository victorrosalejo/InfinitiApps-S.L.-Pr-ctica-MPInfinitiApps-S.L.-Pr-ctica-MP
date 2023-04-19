import java.awt.dnd.DropTarget;
import java.util.HashMap;
import java.util.Map;

public class ShowRanking {
    private Map<String, Character> databaseR = new HashMap<>();
    private DatabaseManager databaseManager;


    // falta constructor


    public Map<String, Character> getDatabaseR() {
        return databaseR;
    }

    public void setDatabaseR(Map<String, Character> databaseR) {
        this.databaseR = databaseR;
    }

    public DatabaseManager getDatabaseManager() {
        return databaseManager;
    }

    public void setDatabaseManager(DatabaseManager databaseManager) {
        this.databaseManager = databaseManager;
    }
}
