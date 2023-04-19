import java.util.Map;

public class AddFeature {

    private DatabaseManager databaseManager;
    private Map<String, User> databaseC = DatabaseManager.obtainDatabaseC();


    public void AddFeature(User u){

        //constructor
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

    private Character addModifier(Character c){
        AddModifier addModifier = new AddModifier();
        c =  addModifier.AddModifier(c);
        return  c;
    }

    private Character addWeapon(Character c){
        AddWeapon addWeapon = new AddWeapon();
        c = addWeapon.AddWeapon(c);

        return c;
    }

    private Character addArmor(Character c){
        AddArmor addArmor = new AddArmor();
        c = addArmor.AddArmor(c);
        return c;
    }

    private Character addMinions(Character c){
        AddMinion addMinion = new AddMinion();
        c = addMinion.AddMinion(c);
        return c;

    }


}
