import java.util.Map;
import java.util.Scanner;
import java.util.Scanner;
import java.util.List;
import java.util.Map;

public class Menu {
    private DatabaseManager databaseManager;
    private Map<String, Challenge> databaseP = DatabaseManager.obtainDatabaseP();
    private User user;
    private Map<String, Character> databaseC = DatabaseManager.obtainDatabaseC();







    public void Menu(User u){

        Scanner scanner = new Scanner(System.in);
        boolean exit = false;
        Boolean d = false;
        Challenge ch = new Challenge();
        Character c = new Character();
        Fighter defiant = new Fighter();
        Fighter defied = new Fighter();
        int gold = 0;



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

            switch (option) {
                case 1:
                    System.out.println("Introduce el nombre  que quieres eliminar: ");
                    Scanner io = new Scanner(System.in);

                    // Pedir al usuario que ingrese el nombre de usuario a buscar
                    System.out.print("Ingrese el nombre de usuario a buscar: ");
                    String nombreUsuario = io.nextLine();

                    // Buscar el usuario en la base de datos
                    Map<String, List<User>> databaseU = DatabaseManager.obtainDatabaseU();
                    List<User> usuarios = databaseU.get(nombreUsuario.substring(0, 1));
                    User usuarioEncontrado = null;
                    for (User us : usuarios) {
                        if (u.getName().equals(nombreUsuario)) {
                            usuarioEncontrado = us;
                            break;
                        }
                    }

                    // Imprimir la información del usuario encontrado
                    if (usuarioEncontrado != null) {
                        System.out.println("Nombre de usuario: " + usuarioEncontrado.getName());

                    } else {
                        System.out.println("No se encontró ningún usuario con el nombre " + nombreUsuario);
                    }

                    // Cerrar el objeto Scanner
                    io.close();
                    deleteAccount(us);
                    break;
                case 2:
                    equipmentMenu(u,d);
                    break;
                case 3:
                    challengeMenu(u);
                    break;
                case 4:
                    history(u);
                    break;
                case 5:
                    characterMenu(u);
                    break;
                case 6:
                    ranking();
                    break;
                case 7:
                    updateGold(c,ch);
                    break;
                case 8:
                    rules();
                    break;
                case 9:
                    fight(defiant,defied,gold);
                    break;
                case 0:
                    exit = true;
                    break;
                default:
                    System.out.println("Opción no válida, por favor intenta de nuevo.");
                    break;
            }

        }

    }



    private void deleteAccount(User u){
        DeleteAccount deleteAccount = new DeleteAccount();
        deleteAccount.DeleteAccount(u);

    }
    private void equipmentMenu(User u, Boolean d){
        EquipentMenu equipentMenu = new EquipentMenu();
        equipentMenu.EquipentMenu();

    }

    private void challengeMenu(User u){
        ChallengeMenu challengeMenu = new ChallengeMenu();
        challengeMenu.ChallengeMenu();

    }
    private void history(User u){
        History history = new History();
        history.History();

    }
    private void characterMenu(User u){
        CharacterMenu characterMenu = new CharacterMenu();
        characterMenu.CharacterMenu;

    }
    private void ranking(){
        Ranking ranking = new Ranking();
        ranking.Ranking();


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
        fight.Fight();                      // error en fight

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

    public void setUser(User user) {
        this.user = user;
    }

    public Map<String, Character> getDatabaseC() {
        return databaseC;
    }

    public void setDatabaseC(Map<String, Character> databaseC) {
        this.databaseC = databaseC;
    }
}
