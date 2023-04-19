import java.util.Map;

public class Type {
    private Map<String, Character> databaseC;
    //puede que falte database manager
    // constructor

    public Character Type(Character c){
        return c;
    }

    public Character getType(Character t){
    return t;
    }

    public Map<String, Character> getDatabaseC() {
        return databaseC;
    }

    public void setDatabaseC(Map<String, Character> databaseC) {
        this.databaseC = databaseC;
    }


}
