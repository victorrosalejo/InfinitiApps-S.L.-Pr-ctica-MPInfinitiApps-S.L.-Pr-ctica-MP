import java.util.Scanner;
public class Welcome {

    public void Welcome() {
        Scanner scanner = new Scanner(System.in);
        int choice = 0;

        do {
            System.out.println("\n<><><><><><><><><><><><><><><><><><><>\n");
            System.out.println("\n[-------------------------------------]\n");
            System.out.println("Bienvenido al juego");
            System.out.println("1. Login");
            System.out.println("2. Registrarse");
            System.out.println("3. Salir");
            System.out.println("\n[-------------------------------------]\n");

            System.out.print("Escriba el número de la opción deseada: ");
            String input = scanner.nextLine();
            int numero = 0;
            try {
                numero = Integer.parseInt(input);
                System.out.println("Has introducido el número " + numero);
            } catch (NumberFormatException e) {
                System.out.println("No has introducido un número entero válido.");
            }
            switch (numero) {
                case 1:
                    login();
                    break;
                case 2:
                    register();
                    break;
                case 3:
                    System.out.println("\nSaliendo...");
                    break;
                default:
                    System.out.println("Opción inválida");
            }
            System.out.println();
        } while (choice != 3);  //condiciona hasta que se meta un input valido
        scanner.close();
    }
    private void login(){
        Login login = new Login();
        login.Login();
    }

    private void register(){
        Register register = new Register();
        register.Register();
    }

}
