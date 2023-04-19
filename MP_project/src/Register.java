import java.io.Console;
import java.util.Map;
import java.util.Scanner;
import java.util.concurrent.TransferQueue;

public class Register {
    private DatabaseManager databaseManager;
    private Map<String, User> databaseU = DatabaseManager.obtainDatabaseU();



    private void appendDataBase() {
    }



    public void Register(){
            Scanner input = new Scanner(System.in);
            String username, password, nickname;

            System.out.println("\n[-------------------------------------]");
            System.out.println("[-------------- REGISTRO -------------]");
            System.out.println("[-------------------------------------]\n");
            System.out.print("\n--> Introduce tu nombre: ");
            username = input.nextLine();

            System.out.print("\n--> Introduce tu contraseña: ");
            password = input.nextLine();

            System.out.print("\n--> Introduce tu apodo en juego: ");
            nickname = input.nextLine();

            // Implement your logic to save the user information
            // For example, you could create a new user object and store the information there

            System.out.println("\nRegistro completado!");
            System.out.println("\nNombre de usuario: " + username);
            System.out.println("\nApodo: " + nickname);


            appendDataBase();



            input.close();

    }
    // Constructor


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


