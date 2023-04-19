import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class EquipentMenu {
    private DatabaseManager databaseManager;
    private Map<String, List<Armor>> databaseA = new HashMap<>();
    private Map<String, List<Weapon>> databaseW = new HashMap<>();
    private Map<String,Character> databaseC = new HashMap<>();
    private boolean duel = false;


    public Map<String, List<Armor>> getDatabaseA() {
        return databaseA;
    }

    public void setDatabaseA(Map<String, List<Armor>> databaseA) {
        this.databaseA = databaseA;
    }

    public Map<String, List<Weapon>> getDatabaseW() {
        return databaseW;
    }

    public void setDatabaseW(Map<String, List<Weapon>> databaseW) {
        this.databaseW = databaseW;
    }

    public Map<String, Character> getDatabaseC() {
        return databaseC;
    }

    public void setDatabaseC(Map<String, Character> databaseC) {
        this.databaseC = databaseC;
    }

    public Boolean getDuel() {
        return duel;
    }

    public void setDuel(Boolean duel) {
        this.duel = duel;
    }

    public DatabaseManager getDatabaseManager() {
        return databaseManager;
    }

    public void setDatabaseManager(DatabaseManager databaseManager) {
        this.databaseManager = databaseManager;
    }

    public void EquipmentMenu(User u, boolean duel){

        System.out.println("\n<><><><><><><><><><><><><><><><><><><>\n");
        System.out.println("\n[-------------------------------------]\n");
        System.out.println("Welcome to the Login/Register menu!");
        System.out.println("1. Login");
        System.out.println("2. Register");
        System.out.println("3. Exit");
        System.out.println("\n[-------------------------------------]\n");




    }

// Constructor
}
