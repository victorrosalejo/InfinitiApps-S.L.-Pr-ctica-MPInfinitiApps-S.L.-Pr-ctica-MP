import javax.lang.model.type.NullType;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.*;

public class Menu {
    private DatabaseManager databaseManager = new DatabaseManager();
    private Map<String, Challenge> databaseP = new HashMap<>();
    private User user;
    private Map<String, Character> databaseC = new HashMap<>();


    // comprobar que tiene personaje, challenges por hacer, result, menu




    public void Menu(User u){
        Scanner scanner = new Scanner(System.in);
        boolean exit = false;
        Boolean d = false;
        Challenge ch = new Challenge();
        Character c = new Character();
        Fighter defiant = new Fighter();
        Fighter defied = new Fighter();
        int forcedoption;
        int gold = 0;
        databaseC = databaseManager.obtainDatabaseC();

        if (databaseC.get(u.getRegisterNumber()) == null ){
            characterMenu(u);
        }else{
            // esto no esta implementado
            if (d == true) {//challenge lugo a equipent fight y te vuelve al menu

                System.out.println("========== Tienes un duelo pendiente ==========");
                System.out.println("1. Aceptar");
                System.out.println("2. Rechazar " + "(pierdes:" + String.format("%.2f", (gold * 0.1)) + ")");
                forcedoption = scanner.nextInt();
                switch (forcedoption) {
                    case 1:

                        fight(defiant, defied, gold); // como se identifica el desafiado
                        break;
                    case 2:
                        float f = (float) 0.1;
                        gold = gold - Math.round(gold * f);

                }
                // comprobar resultados por mostrar
            } else if () {

            }else {
                while (!exit) {

                    System.out.println("========== MENU PRINCIPAL ==========");
                    System.out.println("1. Borrar cuenta");
                    System.out.println("2. Menu de equipamiento");
                    System.out.println("3. Menu de challenges");
                    System.out.println("4. Historial");
                    System.out.println("5. Menu de personajes");
                    System.out.println("6. Rankin");
                    System.out.println("7. Actializar el oro");
                    System.out.println("8. Normas");
                    System.out.println("9. Pelea");
                    System.out.println("0. Salir");

                    int option = scanner.nextInt();
                    // personaje, challenge, result

                    switch (option) {

                        case 1:
                            deleteAccount(u); // ok
                            break;
                        case 2:
                            equipentMenu(u, d); // ok
                            break;
                        case 3:
                            challengeMenu(u); // ok
                            break;
                        case 4:
                            showhistory(u); // ok
                            break;
                        case 5:
                            characterMenu(u); // ok
                            break;
                        case 6:
                            ranking();
                            break;
                        case 7:
                            updateGold(c, ch);
                            break;
                        case 8:
                            rules();
                            break;
                        case 9:
                            fight(defiant, defied, gold);
                            break;
                        case 0:
                            exit = true;
                            break;
                        default:
                            System.out.println("Opción no válida, por favor intenta de nuevo.");
                    }
                }
            }
        }
    }



    private void deleteAccount(User cl){
        DeleteAccount deleteAccount = new DeleteAccount();
        deleteAccount.DeleteAccount(cl);

    }
    private void equipentMenu(User u, Boolean d){
        EquipmentMenu equipmentMenu = new EquipmentMenu();
        equipmentMenu.EquipentMenu(u,d);

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
    private void updateGold(Character c, Challenge ch){
        c.setGoldValue(c.getGoldValue()- ch.getGold());

    }
    private void rules(){
        Rules rules = new Rules();
        rules.ShowRules();
    }


    private void fight(Fighter defiant, Fighter defied, Integer gold ){
        Fight fight = new Fight();
        fight.Fight(defiant,defied,gold);                      // error en fight
    }

    public DatabaseManager getDatabaseManager() {
        return databaseManager;
    }

    public void setDatabaseManager(DatabaseManager databaseManager) {
        this.databaseManager = databaseManager;
    }

    public Map<String, Challenge> getDatabaseP() {
        return databaseP;
    }

    public void setDatabaseP(Map<String, Challenge> databaseP) {
        this.databaseP = databaseP;
    }

    public User getUser() {
        return user;
    }

    //public void setUser(User user) {this.user = user;}

    public Map<String, Character> getDatabaseC() {
        return databaseC;
    }

    public void setDatabaseC(Map<String, Character> databaseC) {
        this.databaseC = databaseC;
    }
}
