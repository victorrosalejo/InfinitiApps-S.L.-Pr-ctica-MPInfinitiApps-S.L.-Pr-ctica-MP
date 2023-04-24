import javax.xml.crypto.Data;
import java.awt.dnd.DropTarget;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class ShowHistory {


    private Map<String, History> databaseH = new HashMap<>();
    private DatabaseManager databaseManager;



    public  void ShowHistory(User u){
        databaseH = databaseManager.obtainDatabaseH();
        History listaH = databaseH.get(u.getRegisterNumber());

        for (Match element: listaH.getMatches()){
            System.out.println("\n[----------------------------------------------------------------]\n");
            System.out.println("Desifiante: "+element.getDefiant() +" Desafiado: "+ element.getDefied()+" Oro apostado: "+ element.getGoldBet());
            System.out.print("Numero de rondas: "+element.getRounds());
            if (element.getWinner() == null){
                System.out.println("Ganador: Empate Le quedan esbirros supervivientes: No");
            }else if (element.isMinionsLeft()){
                System.out.println("Ganador: "+ element.getWinner().getName()+" Con esbirros supervivientes: Sí");
            }
            else {
                System.out.println("Ganador: "+ element.getWinner().getName()+" Con esbirros supervivientes: No");
            }

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
