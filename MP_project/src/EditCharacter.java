import java.util.HashMap;
import java.util.Map;

public class EditCharacter {

    private DatabaseManager databaseManager;
    private Map<String, Character> databaseC = new HashMap<>();


    public Character EditCharacter(User player){
         databaseC = databaseManager.obtainDatabase(databaseC, 1);

        System.out.println("Yepa no se que de meter por pantalla");
    }

    private Character editName(Character c){}
    private Character editType(Character c){}
    private Character editWeapon(Character c){}
    private Character editArmor(Character c){}
    private Character editHitPoints(Character c){}
    private Character editPower(Character c){}
    private Character editMiniomMap(Character c){}
    private Character editDescription(Character c){}
    private Character editSpecialAbilities(Character c){}
    private Character editGoldValues(Character c){}
    private Character editModifiersList(Character c){}
    private Character editActiveWeapons(Character c){}
    private Character editActiveArmor(Character c){}
    private Character editWins(Character c){}

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
}
