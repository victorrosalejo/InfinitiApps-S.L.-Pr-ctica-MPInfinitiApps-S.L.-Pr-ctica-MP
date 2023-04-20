import java.util.HashMap;
import java.util.Map;

public class UserManager {
    private DatabaseManager databaseManager;
    private Map<String, User> databaseC = new HashMap<>();

    public void UserManager(){
        //Constructor
    }

    private void ban_unban(String s){

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
