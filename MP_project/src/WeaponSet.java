import java.util.List;
import java.util.Map;

public class WeaponSet {

    private Map<String, List<Weapon>> weaponSet = DatabaseManager.obtainDatabaseW;
    // puede que necesite database manager
 // constructor
    public Character WeaponSet(Character c){

        return c;
    }

    public Map<String, List<Weapon>> getWeaponSet() {
        return weaponSet;
    }

    public void setWeaponSet(Map<String, List<Weapon>> weaponSet) {
        this.weaponSet = weaponSet;
    }
}
