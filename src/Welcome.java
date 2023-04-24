import java.util.Scanner;
public class Welcome {

    public void Welcome() {
        Scanner scanner = new Scanner(System.in);
        String aux;
        int choice = 0;
        boolean b = true;

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
                    b = false;
                    break;
                default:
                    System.out.println("Opción inválida");
                    aux = scanner.nextLine();
                    break;
            }
        } while (b);  //condiciona hasta que se meta un input valido
        scanner.close();
        System.exit(03);
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
