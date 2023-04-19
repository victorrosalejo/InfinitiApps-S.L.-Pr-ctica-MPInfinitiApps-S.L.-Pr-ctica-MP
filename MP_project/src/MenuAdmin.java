import java.util.Scanner;

public class MenuAdmin {


    public void MenuAdmin(User u) {
        Scanner scanner = new Scanner(System.in);
        boolean continuar = true;
        while (continuar) {
            System.out.println("=== Menú de Administrador ===");
            System.out.println("1. Eliminar Administrador");
            System.out.println("2. Editar Personaje");
            System.out.println("3. Validar Desafío");
            System.out.println("4. Agregar Característica");
            System.out.println("5. Banear Usuario");
            System.out.println("6. Salir");
            System.out.print("Seleccione una opción: ");

            int opcion = scanner.nextInt();
            switch (opcion) {
                case 1:
                    deleteAdmin(u);
                    break;
                case 2:
                    editCharacter();
                    break;
                case 3:
                    validateChallenges();
                    break;
                case 4:
                    addFeature(u);
                    break;
                case 5:
                    banUser(u);
                    break;
                case 6:
                    continuar = false;  //WARNING LINE
                    backAdmin();
                    break;
                default:
                    System.out.println("Opción inválida");
                    break;
            }
        }
    }

    private void deleteAdmin(User u){
        DeleteAdmin deleteadmin = new DeleteAdmin();
        deleteadmin.DeleteAdmin(u);
    }

    private void editCharacter(){
        EditCharacter editCharacter = new EditCharacter();
        editCharacter.EditCharacter();
    }

    private void validateChallenges(){
        ValidateChallenges validateChallenges = new ValidateChallenges();
        validateChallenges.ValidateChallenges();
    }
    private void addFeature(User u){
        AddFeature addFeature = new AddFeature();
        addFeature.AddFeature(u);
    }
    private void banUser(User u){
        UserManager userManager = new UserManager();
        userManager.UserManager();
    }

    //método para ir hacia atrás en el menu admin
    private void backAdmin(){
        Login login = new Login();
        login.Login();
    }




}

