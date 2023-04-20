
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MinionMap {


    private Map<String , List<Minion>> minionMap = new HashMap<>();

    public Character MinionMap(Character c){
        return c;
    }

    public Map<String, List<Minion>> getMinionMap() {
        return minionMap;
    }

    public void setMinionMap(Map<String, List<Minion>> minionMap) {
        this.minionMap = minionMap;
    }
}
