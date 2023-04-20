import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class CharacterMenu {

    private User user;
    private DatabaseManager databaseManager;
    private Map<String, User> databaseU = new HashMap<>();
    private Map<String, Character> databaseC = new HashMap<>();

    public  void CharacterMenu (User u) {
        Scanner input = new Scanner(System.in);
        databaseManager = new DatabaseManager();


        databaseC = databaseManager.obtainDatabaseC();
        System.out.println("========== Menu del Personaje ==========");
        System.out.println("(Se te redigira a la opcion optima)");
        System.out.println("1. Borrar Personaje ");
        System.out.println("2. Crear Personaje");

        if (databaseC.get(u.getRegisterNumber()) == null){

            newCharacter(u);


        }
        else{
            deleteCharacter(u, databaseC.get(u.getRegisterNumber()));
        }




    }

    //Constructor implementado luego
    private void deleteCharacter(User u, Character c){
        DeleteCharacter deleteCharacter = new DeleteCharacter();
        deleteCharacter.DeleteCharacter(u, c);
    }

    private void newCharacter(User u) {
        NewCharacter newCharacter = new NewCharacter();
        newCharacter.NewCharacter(u);
    }
    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}

