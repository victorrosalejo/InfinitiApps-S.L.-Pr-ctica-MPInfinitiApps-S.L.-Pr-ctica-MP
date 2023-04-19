import java.util.List;
import java.util.Map;

public class DeleteAccount {

    private DatabaseManager databaseManager;
    private Map<String, List<User>> databaseU = DatabaseManager.obtainDatabaseU();
    private Map<String, List<Character>> databaseR = DatabaseManager.obtainDatabaseR();
    private Map<String, List<Character>> databaseC = DatabaseManager.obtainDatabaseC();
    private Map<String, List<History>> databaseH = DatabaseManager.obtainDatabaseH();


    public void DeleteAccount(User u){

        // Obtener el nombre de usuario del usuario que se va a eliminar
        String username = u.getName();

        // Eliminar el usuario de la base de datos U
        List<User> userList = databaseU.get(username.substring(0, 1));
        userList.remove(u);

        // Eliminar los personajes asociados al usuario de la base de datos R y C
        List<Character> characterList = databaseR.get(username);
        characterList.addAll(databaseC.get(username));
        databaseR.remove(username);
        databaseC.remove(username);

        // Eliminar el historial del usuario de la base de datos H
        databaseH.remove(username);

    }


    public DatabaseManager getDatabaseManager() {
        return databaseManager;
    }

    public void setDatabaseManager(DatabaseManager databaseManager) {
        this.databaseManager = databaseManager;
    }

    public Map<String, List<User>> getDatabaseU() {
        return databaseU;
    }

    public void setDatabaseU(Map<String, List<User>> databaseU) {
        this.databaseU = databaseU;
    }

    public Map<String, List<Character>> getDatabaseR() {
        return databaseR;
    }

    public void setDatabaseR(Map<String, List<Character>> databaseR) {
        this.databaseR = databaseR;
    }

    public Map<String, List<Character>> getDatabaseC() {
        return databaseC;
    }

    public void setDatabaseC(Map<String, List<Character>> databaseC) {
        this.databaseC = databaseC;
    }

    public Map<String, List<History>> getDatabaseH() {
        return databaseH;
    }

    public void setDatabaseH(Map<String, List<History>> databaseH) {
        this.databaseH = databaseH;
    }
}
