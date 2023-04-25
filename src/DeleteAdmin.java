import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class DeleteAdmin  implements Serializable {
    private DatabaseManager databaseManager = new DatabaseManager();
    private Map<String, User> databaseU = new HashMap<>();

        public void DeleteAdmin(User u) {

            this.databaseU = databaseManager.obtainDatabaseU();

            String ADMIN_USERNAME = u.getName();
            String ADMIN_PASSWORD = u.getPassword();
            Scanner scanner = new Scanner(System.in);

            // Simulamos la autenticación de un administrador
            System.out.println("Ingrese el nombre de usuario del administrador:");
            String username = scanner.nextLine();
            System.out.println("Ingrese la contraseña del administrador:");
            String password = scanner.nextLine();
            if (!username.equals(ADMIN_USERNAME) || !password.equals(ADMIN_PASSWORD)) {
                System.out.println("Nombre de usuario o contraseña incorrectos. Saliendo...");
                System.exit(0);
            }

            boolean exit = false;
            while (!exit) {
                System.out.println("\n--- Menú de Administrador ---");
                System.out.println("1. Eliminar cuenta de administrador");
                System.out.println("2. Salir");
                System.out.println("Seleccione una opción:");

                int option = scanner.nextInt();
                scanner.nextLine();

                switch (option) {
                    case 1:
                        System.out.println("¿Está seguro de que desea eliminar la cuenta de administrador? (S/N)");
                        String confirm = scanner.nextLine();
                        if (confirm.equalsIgnoreCase("S")) {
                            databaseU.remove(username); //Elimina del mapa principal el usuario de adminsitrador.
                            System.out.println("La cuenta de administrador ha sido eliminada. Saliendo...");
                            this.databaseManager.saveDatabaseU(databaseU);
                            Welcome welcome = new Welcome();
                            welcome.Welcome();
                        } else if (confirm.equalsIgnoreCase("N")) {
                            System.out.println("Eliminación de cuenta de administrador cancelada.");
                        } else {
                            System.out.println("Opción no válida. Vuelva a intentarlo.");
                        }
                        break;
                    case 2:
                        System.out.println("Saliendo...");
                        exit = true;
                        break;
                    default:
                        System.out.println("Opción no válida. Vuelva a intentarlo.");
                        break;
                }
            }
        }
}

