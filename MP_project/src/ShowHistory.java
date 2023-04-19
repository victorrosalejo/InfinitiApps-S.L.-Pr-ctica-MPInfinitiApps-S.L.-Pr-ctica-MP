import javax.xml.crypto.Data;
import java.awt.dnd.DropTarget;
import java.util.HashMap;
import java.util.Map;

public class ShowHistory {


    private Map<String, History> databaseH = new HashMap<>();
    private DatabaseManager databaseManager;



    // Constructor

    public Map<String, History> getDatabaseH() {
        return databaseH;
    }

    public void setDatabaseH(Map<String, History> databaseH) {
        this.databaseH = databaseH;
    }

    public DatabaseManager getDatabaseManager() {
        return databaseManager;
    }

    public void setDatabaseManager(DatabaseManager databaseManager) {
        this.databaseManager = databaseManager;
    }
}
