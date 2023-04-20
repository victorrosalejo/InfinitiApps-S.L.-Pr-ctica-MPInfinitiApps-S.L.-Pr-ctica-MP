import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class DeleteCharacter {

    private Map<String, Character> databaseC = new HashMap<>();
    private DatabaseManager databaseManager;

    public void DeleteCharacter(User u, Character c) {
        Scanner input = new Scanner(System.in);
        int option;
        databaseManager = new DatabaseManager();
        databaseC = databaseManager.obtainDatabaseC();
        System.out.println("========== Menu de Borrado de personaje ==========");
        System.out.println("1. Borrar Personaje ");
        System.out.println("2. Salir");
        option = input.nextInt();
        switch (option) {
            case 1:
                databaseC.remove(u.getRegisterNumber());

                newcharacter(u);

                break;
            case 2:

                charactermenu(u);
                break;
        }
    }
        public Map<String, Character> getDatabaseC () {
            return databaseC;
        }

        public void setDatabaseC (Map < String, Character > databaseC){
            this.databaseC = databaseC;
        }

        public DatabaseManager getDatabaseManager () {
            return databaseManager;
        }

        public void setDatabaseManager (DatabaseManager databaseManager){
            this.databaseManager = databaseManager;
        }


        private void newcharacter (User u){
            NewCharacter newCharacter = new NewCharacter();
            newCharacter.NewCharacter(u);
        }

        private void charactermenu(User u){
            CharacterMenu characterMenu = new CharacterMenu();
            characterMenu.CharacterMenu(u);

        }

        //delete equipment

}
