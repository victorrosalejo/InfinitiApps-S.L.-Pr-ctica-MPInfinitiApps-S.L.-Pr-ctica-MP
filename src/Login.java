import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Login {

    private DatabaseManager databaseManager;
    private Map<String, User> databaseU = new HashMap<>();


    public void Login(){
        databaseManager = new DatabaseManager();
        Scanner input = new Scanner(System.in);
        String username, password, truepassword;
        databaseU = databaseManager.obtainDatabaseU();
        boolean valid = false ;
        User user;
        TUser tipouser = TUser.ADMIN;

        System.out.println("========= Login ========\n");
        do {

            System.out.print("Introduce tu nombre: ");
            username = input.next();
            System.out.print("Introduce tu contraseña: ");
            password = input.next();


            user = databaseU.get(username);

            truepassword = user.getPassword();

            if (truepassword == password) {
                System.out.print("Login correcto");
                valid = true;

                if (user.getUsertype() == tipouser ){
                    menuAdmin(user);

                }
                else {
                    menu(user);

                }
            }

        } while (valid == false);


    }

    private void menuAdmin(User u){
        MenuAdmin menuAdmin = new MenuAdmin();
        menuAdmin.MenuAdmin(u);

    }

    private void menu(User u){
        Menu menu = new Menu();
        menu.Menu(u);

    }

    public DatabaseManager getDatabaseManager() {
        return databaseManager;
    }

    public void setDatabaseManager(DatabaseManager databaseManager) {
        this.databaseManager = databaseManager;
    }

    public Map<String, User> getDatabaseU() {
        return databaseU;
    }

    public void setDatabaseU(Map<String, User> databaseU) {
        this.databaseU = databaseU;
    }
}
