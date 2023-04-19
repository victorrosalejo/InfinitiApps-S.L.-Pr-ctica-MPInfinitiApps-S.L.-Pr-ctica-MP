import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import java.util.Scanner;


public class Register {
    private DatabaseManager databaseManager;
    private Map<String, User> databaseU = new HashMap<>();



    private void appendDataBase() {

        databaseManager.saveDatabaseU(databaseU);



    }



    public void Register(){
            Scanner input = new Scanner(System.in);
            String username, password, nickname, adminletter;
            User user = new User();

            adminletter = "¬";
            System.out.println("\n<><><><><><><><><><><><><><><><><><><>\n");
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
            if (username.startsWith(adminletter)){
                User a = (User) user;
                a.setRegisterNumber("0");

            }
            else{
                User userUser = (User) user;

                Random rand = new Random();  //lnnll
                StringBuilder sb = new StringBuilder();
                char[] letras = {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J'};
                sb.append(letras[rand.nextInt(letras.length)]); // letra aleatoria
                sb.append(rand.nextInt(10)); // número aleatorio
                sb.append(rand.nextInt(10)); // número aleatorio
                sb.append(letras[rand.nextInt(letras.length)]); // letra aleatoria
                sb.append(letras[rand.nextInt(letras.length)]); // letra aleatoria
                String resultado = sb.toString();
                userUser.setRegisterNumber(resultado);

            }

            System.out.println("\nRegistro completado!");
            System.out.println("\nNombre de usuario: " + username);
            System.out.println("\nApodo: " + nickname);


            appendDataBase();

            input.close();

            Welcome();


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

    public void Welcome(){
        Welcome welcome = new Welcome();
        welcome.Welcome();

    }
}


