import java.lang.reflect.Modifier;
import java.util.List;
import java.util.Map;
import java.util.SimpleTimeZone;

public class AddModifier {

    private DatabaseManager databaseManager;
    private Map<String, List<Modifiers>> databaseMo = DatabaseManager.obtainDatabaseMo();
    private Modifiers m ;



    public DatabaseManager getDatabaseManager() {
        return databaseManager;
    }

    public void setDatabaseManager(DatabaseManager databaseManager) {
        this.databaseManager = databaseManager;
    }

    public Map<String, List<Modifiers>> getDatabaseMo() {
        return databaseMo;
    }

    public void setDatabaseM(Map<String, List<Modifiers>> databaseMo) {
        this.databaseMo = databaseMo;
    }

    public Modifiers getM() {

        return m;
    }

    public void setM(Modifiers m) {
        this.m = m;
    }

    public Character AddModifier(Character c){

        return c;
    }

    private void appendModifiers(Modifiers m, Map<String, List<Modifiers>> databaseMo){



    }

    }




