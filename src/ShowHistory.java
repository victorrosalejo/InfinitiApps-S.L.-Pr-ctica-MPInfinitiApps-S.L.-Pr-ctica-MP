import javax.xml.crypto.Data;
import java.awt.dnd.DropTarget;
import java.util.HashMap;
import java.util.Map;

public class ShowHistory {


    private Map<String, History> databaseH = new HashMap<>();
    private DatabaseManager databaseManager;



    public  void ShowHistory(User u){
        databaseH = databaseManager.obtainDatabaseH();
        History listaH = databaseH.get(u.getRegisterNumber());

        for (Match element: listaH.getMatches()){
            System.out.println("\n[----------------------------------------------------------------]\n");
            System.out.println("Desifiante: "+element.getDefiant() +"Desafiado: "+ element.getDefied()+"Oro apostado: "+ element.getGoldBet());
            System.out.println("Numero de rondas: "+element.getRounds() +"Ganador: "+ element.getWinner()+"Hay miniomns supervivientes: "+ element.isMinionsLeft());
            System.out.println("\n[----------------------------------------------------------------]\n");
        }
    }

    public Map<String, History> getDatabaseH() {
        return databaseH;
    }

    public void setDatabaseH(Map<String, History> databaseH) {
        this.databaseH = databaseH;
    }

    public DatabaseManager getDatabaseManager() {
        return databaseManager;
    }

    public void setDatabaseManager(DatabaseManager databaseManager) {
        this.databaseManager = databaseManager;
    }
}
