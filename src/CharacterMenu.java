import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class CharacterMenu {

    private User user;
    private DatabaseManager databaseManager;
    private Map<String, Character> databaseC = new HashMap<>();
    private Map<String, List<Armor>> databaseA = new HashMap<>();
    private Map<String, List<Weapon>> databaseW = new HashMap<>();
    private Map<String, List<Minion>> databaseM = new HashMap<>();
    private Map<String, List<Modifiers>> databaseMo = new HashMap<>();

    public  void CharacterMenu (User u) {
        Scanner input = new Scanner(System.in);
        databaseManager = new DatabaseManager();
        databaseC = databaseManager.obtainDatabaseC();
        System.out.println("========== Menu del Personaje ==========");
        System.out.println("(Se te redigira a la opcion optima)");
        System.out.println("1. Borrar Personaje ");
        System.out.println("2. Crear Personaje");

        if (databaseC.get(u.getRegisterNumber()) == null){
            NewCharacter newCharacter = new NewCharacter();
            Character c = newCharacter.NewCharacter(u);
            databaseC.put(u.getRegisterNumber(), c);
            databaseManager.saveDatabaseC(databaseC);
            this.appenndInfo(c);



        }
        else{
            DeleteCharacter deleteCharacter = new DeleteCharacter();
            deleteCharacter.DeleteCharacter(u);
            System.out.println("Borrado completo, ahora  deberá crear un nuevo personaje para poder seguir jugando.");
            NewCharacter newCharacter = new NewCharacter();
            Character c = newCharacter.NewCharacter(u);
            databaseC.put(u.getRegisterNumber(), c);
            databaseManager.saveDatabaseC(databaseC);
            this.appenndInfo(c);
        }




    }
    private void appenndInfo(Character c) {
        databaseA = databaseManager.obtainDatabaseA();
        databaseA.put(c.getName(),c.getArmorSet());
        databaseManager.saveDatabaseA(databaseA);
        databaseW = databaseManager.obtainDatabaseW();
        databaseW.put(c.getName(),c.getWeaponSet());
        databaseManager.saveDatabaseW(databaseW);
        databaseM = databaseManager.obtainDatabaseM();
        databaseM.put(c.getName(),c.getMinionMap());
        databaseManager.saveDatabaseM(databaseM);
        databaseMo = databaseManager.obtainDatabaseMo();
        databaseMo.put(c.getName(),c.getWeaponSet());
        databaseManager.saveDatabaseMo(databaseMo);
    }
    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public DatabaseManager getDatabaseManager() {
        return databaseManager;
    }

    public void setDatabaseManager(DatabaseManager databaseManager) {
        this.databaseManager = databaseManager;
    }

    public Map<String, Character> getDatabaseC() {
        return databaseC;
    }

    public void setDatabaseC(Map<String, Character> databaseC) {
        this.databaseC = databaseC;
    }

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

    public Map<String, List<Minion>> getDatabaseM() {
        return databaseM;
    }

    public void setDatabaseM(Map<String, List<Minion>> databaseM) {
        this.databaseM = databaseM;
    }

    public Map<String, List<Modifiers>> getDatabaseMo() {
        return databaseMo;
    }

    public void setDatabaseMo(Map<String, List<Modifiers>> databaseMo) {
        this.databaseMo = databaseMo;
    }
}

