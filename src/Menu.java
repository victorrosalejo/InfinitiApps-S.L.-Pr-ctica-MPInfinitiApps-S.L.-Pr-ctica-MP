import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.*;

public class Menu implements Serializable {
    private DatabaseManager databaseManager = new DatabaseManager();
    private Map<String, List<Challenge>> databaseP = new HashMap<>();
    private Map<String, Character> databaseC = new HashMap<>();

    public void Menu(User u){
        Scanner scanner = new Scanner(System.in);
        boolean exit = false;
        boolean d;
        Challenge ch = new Challenge();
        List<Challenge> challengeList ;
        Character c;


        int forcedoption;
        int gold;
        List<Combat> combats = u.getResultados();
        boolean pendingResult;
        if (combats == null){
            pendingResult =false;
        }else {
            pendingResult = !combats.isEmpty();
        }
        databaseC = databaseManager.obtainDatabaseC();
        if (databaseC.get(u.getRegisterNumber()) == null ){
            characterMenu(u);
        }else{

            databaseP = databaseManager.obtainDatabaseP();
            challengeList = databaseP.get(u.getRegisterNumber());
            gold = databaseC.get(u.getRegisterNumber()).getGoldValue();
            if (challengeList != null){
                if (challengeList.size() > 0) {
                    Challenge popup = challengeList.get(0);
                    int othergold = popup.getGold();
                    c = databaseC.get(u.getRegisterNumber());
                    d = !challengeList.isEmpty(); // si esta vacia True = False
                    if (d) {
                        System.out.println("========== Tienes un duelo pendiente ==========");
                        System.out.println("1. Aceptar");
                        System.out.println("2. Rechazar " + "(pierdes:" + String.format("%.2f", (othergold * 0.1)) + ")");
                        forcedoption = scanner.nextInt();
                        switch (forcedoption) {
                            case 1 -> {
                                databaseP = databaseManager.obtainDatabaseP();
                                challengeList = databaseP.remove(u.getRegisterNumber());
                                Challenge challenge = challengeList.remove(0);
                                databaseP.put(u.getRegisterNumber(), challengeList);
                                databaseManager.saveDatabaseP(databaseP);
                                User udefiant = challenge.getDefiant();
                                User udefied = challenge.getDefied();
                                equipentMenu(u);
                                fight(udefiant, udefied, othergold);
                            }
                            case 2 -> {
                                float f = (float) 0.1;

                                updateGold(c, popup, u);
                            }
                        }
                    }
                }
            } else if (pendingResult) {
                while (pendingResult){
                    Combat c2 = combats.remove(0);
                    showresult(c2, u);
                    pendingResult = !combats.isEmpty();
                }

            }else {
                while (!exit) {

                    System.out.println("========== MENU PRINCIPAL ==========");
                    System.out.println("0. Salir");
                    System.out.println("1. Borrar cuenta");
                    System.out.println("2. Menu de equipamiento");
                    System.out.println("3. Menu de desafíos");
                    System.out.println("4. Historial");
                    System.out.println("5. Crear nuevo personaje (se borrara el actual)");
                    System.out.println("6. Ranking");
                    System.out.println("7. Normas");

                    Scanner input = new Scanner(System.in);
                    int option = input.nextInt();
                    // personaje, challenge, result

                    switch (option) {
                        case 1 -> deleteAccount(u); // ok
                        case 2 -> equipentMenu(u); // ok
                        case 3 -> challengeMenu(u); // ok
                        case 4 -> showhistory(u); // ok
                        case 5 -> characterMenu(u); // ok
                        case 6 -> ranking(); //ok
                        case 7 -> rules(); //ok
                        case 0 -> login();
                        default -> System.out.println("Opción no válida, por favor intenta de nuevo.");
                    }
                }
            }
        }
    }



    private void deleteAccount(User cl){
        DeleteAccount deleteAccount = new DeleteAccount();
        deleteAccount.DeleteAccount(cl);

    }
    private void login(){
        Login log = new Login();
        log.Login();

    }

    private void equipentMenu(User u){
        EquipmentMenu equipmentMenu = new EquipmentMenu();
        equipmentMenu.EquipentMenu(u);

    }

    private void challengeMenu(User u){
        ChallengeMenu challengeMenu = new ChallengeMenu();
        challengeMenu.ChallengeMenu(u);

    }
    private void showhistory(User u){
        ShowHistory showHistory = new ShowHistory();
        showHistory.ShowHistory(u);

    }
    private void characterMenu(User u){
        CharacterMenu characterMenu = new CharacterMenu();
        characterMenu.CharacterMenu(u);

    }
    private void ranking(){
        ShowRanking showRanking= new ShowRanking();
         showRanking.ShowRanking();


    }
    private void updateGold(Character c, Challenge ch,User u){
        c.setGoldValue((int) (c.getGoldValue() - (ch.getGold() * 0.1 )));
        databaseC.remove(u.getRegisterNumber());
        databaseC.put(u.getRegisterNumber(), c);
        databaseManager.saveDatabaseC(databaseC);
        Menu(u);
    }



    private void rules(){
        Rules rules = new Rules();
        rules.ShowRules();
    }


    private void fight(User defiant, User defied, Integer gold){
        Fight fight = new Fight();
        fight.Fight(defiant,defied,gold);                      // error en fight
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


    public void showresult(Combat c2, User user){
        Result result = new Result();
        result.showResult(c2,user);


    }
}
