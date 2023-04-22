import java.util.*;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ValidateChallenges {
    private DatabaseManager databaseManager;
    private Map<String, List<Challenge>> databaseP = new HashMap<>();

    public void ValidateChallenges(){
    databaseManager = new DatabaseManager();
    databaseP = databaseManager.obtainDatabaseP();
    List<Challenge> challenges =new ArrayList<>();
    for (Map.Entry<String, List<Challenge>> entry : databaseP.entrySet()) {
        List<Challenge> valor = entry.getValue();
        challenges.addAll(valor);
    }
    System.out.println("----------------[Lista de Desafíos por validar]-----------------");
    for (int i = 0; i <= challenges.size(); i++){
        Challenge ch = challenges.get(i);
            if (!ch.isValid()){
                System.out.println((i + 1) + ". ");
                System.out.println(("Desafiante") + " - " + ch.getDefiant().getName());
                System.out.println(("Desafiado") + " - " + ch.getDefied().getName());
                System.out.println(("Oro apostado") + " - " + ch.getGold());
            }
        }

        Scanner scanner = new Scanner(System.in);
        System.out.print("Seleccione el número de desafío que desea validar: ");
        int chIndex = scanner.nextInt()-1;
        Challenge ch = challenges.remove(chIndex);
        ch.setValid(true);
        challenges.add(chIndex,ch);
        System.out.println("Validado. Ahora debe escoger las modificaciones");
        databaseP.clear();;
        for (int i = 0; i<= challenges.size(); i++){
            Challenge chall = challenges.get(i);

            databaseP.put(chall.getDefied().getRegisterNumber(),);
        }
    }

    public DatabaseManager getDatabaseManager() {
        return databaseManager;
    }

    public void setDatabaseManager(DatabaseManager databaseManager) {
        this.databaseManager = databaseManager;
    }

    public Map<String, List<Challenge>> getDatabaseP() {
        return databaseP;
    }

    public void setDatabaseP(Map<String, List<Challenge>> databaseP) {
        this.databaseP = databaseP;
    }
}
