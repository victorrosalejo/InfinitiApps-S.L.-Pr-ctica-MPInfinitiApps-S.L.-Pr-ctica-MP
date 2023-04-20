import java.util.HashMap;
import java.util.Map;

public class NewCharacter {
    private Map<String,Character> databaseC = new HashMap<>();
    private DatabaseManager databaseManager;


    public Character NewCharacter(User u){
        System.out.println("========== Menu de Creacion de personaje ==========");
        Character nuevoChar = new Character();










        return nuevoChar;
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
