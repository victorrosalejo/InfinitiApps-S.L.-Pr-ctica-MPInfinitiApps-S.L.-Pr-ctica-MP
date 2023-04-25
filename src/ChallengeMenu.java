import java.io.Serializable;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class ChallengeMenu  implements Serializable {
    private DatabaseManager databaseManager = new DatabaseManager();
    private Map<String, List<Challenge>> databaseP = new HashMap<>();
    private Map<String, Character> databaseC = new HashMap<>();
    private Map<String, User> databaseU = new HashMap<>();

    public void ChallengeMenu(User defiant){
        Challenge challenge = new Challenge();
        databaseP = databaseManager.obtainDatabaseP();
        databaseU = databaseManager.obtainDatabaseU();
        databaseC = databaseManager.obtainDatabaseC();
        String username, goldBet;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Este es el menú de desafíos");
        do {
            System.out.println("Escribe el nombre de usuario de la persona que quieras desafiar");
            username = scanner.nextLine();
            if (databaseU.get(username) == null){
                System.out.println("Usuario no encontrado");
            }
        }while (databaseU.get(username) == null);
        User defied = databaseU.get(username);
        String aux1 = defiant.getRegisterNumber();
        String aux2 = defied.getRegisterNumber();
        Character c1 = databaseC.get(aux1);
        Character c2 = databaseC.get(aux2);
        int maxBet = Math.min(c1.getGoldValue(), c2.getGoldValue());
        int gold;
        do {
            System.out.println("Escribe cuanto oro quieres apostar. Máximo: "+ maxBet);
            goldBet = scanner.nextLine();
            gold = Integer.parseInt(goldBet);
        }while(gold > maxBet);
        challenge.setDefiant(defiant);
        challenge.setDefied(defied);
        challenge.setGold(gold);
        challenge.setValid(false);
        List<Challenge> challengeList = databaseP.remove(aux1);
        challengeList.add(challenge);
        databaseP.put(aux1, challengeList);
        databaseManager.saveDatabaseP(databaseP);
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

    public void setDatabaseP(Map<String,List<Challenge>> databaseP) {
        this.databaseP = databaseP;
    }

}
