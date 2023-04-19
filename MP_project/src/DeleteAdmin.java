import java.util.Map;

public class DeleteAdmin {
    private DatabaseManager databaseManager;
    private Map<String, User> databaseC = DatabaseManager.obtainDatabaseC();

        public void DeleteAdmin(User u) {
            //constructor a implementar
        }

    public DatabaseManager getDatabaseManager() {
        return databaseManager;
    }

    public void setDatabaseManager(DatabaseManager databaseManager) {
        this.databaseManager = databaseManager;
    }

    public Map<String, User> getDatabaseC() {
        return databaseC;
    }

    public void setDatabaseC(Map<String, User> databaseC) {
        this.databaseC = databaseC;
    }
}

