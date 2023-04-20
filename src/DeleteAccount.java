import java.util.HashMap;
import java.util.Map;

public class DeleteAccount {

    private DatabaseManager databaseManager;
    private Map<String, User> databaseU = new HashMap<>();
    private Map<String, Character> databaseC = new HashMap<>();
    private Map<String, History> databaseH = new HashMap<>();



    public void DeleteAccount(User u){



        // Obtener el nombre de usuario del usuario que se va a eliminar
        String username = u.getName();
        String regnum = u.getRegisterNumber();


        // Eliminar el usuario de la base de datos U

        databaseU.remove(username);


        // Eliminar los personajes asociados al usuario de la base de datos C


        databaseC.remove(regnum);

        // Eliminar el historial del usuario de la base de datos H
        databaseH.remove(regnum);


        this.databaseManager.saveDatabaseU(databaseU);
        this.databaseManager.saveDatabaseC(databaseC);
        this.databaseManager.saveDatabaseH(databaseH);


        Welcome();



    }


    public DatabaseManager getDatabaseManager() {
        return databaseManager;
    }

    public void setDatabaseManager(DatabaseManager databaseManager) {
        this.databaseManager = databaseManager;
    }

    public Map<String, User> getDatabaseU() {



        return databaseU;
    }

    public void setDatabaseU(Map<String, User> databaseU) {
        this.databaseU = databaseU;
    }

    public Map<String, Character> getDatabaseC() {
        return databaseC;
    }

    public void setDatabaseC(Map<String, Character> databaseC) {
        this.databaseC = databaseC;
    }

    public Map<String, History> getDatabaseH() {
        return databaseH;
    }

    public void setDatabaseH(Map<String, History> databaseH) {
        this.databaseH = databaseH;
    }

    private  void Welcome(){
        Welcome welcome = new Welcome();
        welcome.Welcome();
    }
}
