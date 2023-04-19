import java.util.Scanner;
public class Welcome {

    public void Welcome() {
        Scanner input = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\n<><><><><><><><><><><><><><><><><><><>\n");
            System.out.println("\n[-------------------------------------]\n");
            System.out.println("Welcome to the Login/Register menu!");
            System.out.println("1. Login");
            System.out.println("2. Register");
            System.out.println("3. Exit");
            System.out.println("\n[-------------------------------------]\n");

            System.out.print("Enter your choice: ");
            choice = input.nextInt();

            switch (choice) {
                case 1:
                    login();
                    break;
                case 2:
                    register();
                    break;
                case 3:
                    System.out.println("\nExiting...");
                    break;
                default:
                    System.out.println("Invalid choice!");
            }
            System.out.println();
        } while (choice != 3);  //condiciona hasta que se meta un input valido
        input.close();
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
