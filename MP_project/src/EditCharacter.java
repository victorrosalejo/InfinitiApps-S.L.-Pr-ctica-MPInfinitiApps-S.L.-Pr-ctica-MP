import java.util.HashMap;
import java.util.Map;

public class EditCharacter {

    private DatabaseManager databaseManager;
    private Map<String, Character> databaseC = DatabaseManager.obtainDatabaseC();

    public void EditCharacter(User player){

    }

    private Character editName(Character c){
        Name name = new Name();
        c = name.Name(c);
        return c;
    }
    private Character editType(Character c){  //Type
        Type editType = new Type();
        c = editType.Type(c);
        return c;
    }

    private Character editWeaponSet(Character c){ //WeaponSet
        WeaponSet weaponSet = new WeaponSet();
        c = weaponSet.WeaponSet(c);
        return c;
    }
    private Character editArmor(Character c){
        ArmorSet armorSet = new ArmorSet();
        c = armorSet.ArmorSet(c);
        return c;
    }

    private Character editHitPoints(Character c){
        HitPoints HitPoints = new HitPoints();
        c = HitPoints.HitPoints(c);
        return c;
    }

    private Character editPower(Character c){
        Power Power = new Power();
        c = Power.Power(c);
        return c;
    }

    private Character editMinionMap(Character c){
        MiniomMap minionMap = new MinionMap();
        c = minionMap.MinionMap(c);
        return c;
    }

    private Character editDescription(Character c) {
        Description description = new Description();
        c = description.Description(c);
        return c;
    }
    private Character editSpecialAbilities(Character c){
        SpecialAbility specialAbilities = new SpecialAbility();
        c = specialAbilities.SpecialAbility(c);
        return c;
    }
    private Character editGoldValues(Character c){
        GoldValue goldValues = new GoldValue();
        c = goldValues.GoldValue(c);
        return c;
    }
    private Character editModifiersList(Character c){
        ModifierList modifiersList = new ModifierList();
        c = modifiersList.ModifierList(c);
        return c;
    }
    private Character editWins(Character c){
        Wins wins = new Wins();
        c = wins.Wins(c);
        return c;
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

}
