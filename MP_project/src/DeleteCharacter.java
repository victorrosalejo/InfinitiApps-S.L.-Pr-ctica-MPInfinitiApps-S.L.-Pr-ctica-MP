import java.util.Map;

public class DeleteCharacter {

    private Map<String,Character> databaseC = DatabaseManager.obtainDatabaseC;
    private DatabaseManager databaseManager;

    public void DeleteCharacter(User user, Character character){
        // Implementar luego
    }

    public Map<String, Character> getDatabaseC() {
        return databaseC;
    }

    public void setDatabaseC(Map<String, Character> databaseC) {
        this.databaseC = databaseC;
    }

    public DatabaseManager getDatabaseManager() {
        return databaseManager;
    }

    public void setDatabaseManager(DatabaseManager databaseManager) {
        this.databaseManager = databaseManager;
    }

}
