import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class DeleteCharacter  implements Serializable {

    private Map<String, Character> databaseC = new HashMap<>();
    private DatabaseManager databaseManager;

    public void DeleteCharacter(User u,boolean b) {
        Scanner input = new Scanner(System.in);
        String  option;
        databaseManager = new DatabaseManager();
        databaseC = databaseManager.obtainDatabaseC();
        if(b) {
            System.out.println("========== Menu de Borrado de personaje ==========");
            System.out.println("1. Borrar Personaje ");
            System.out.println("2. Salir (cualquier entrada)");
            option = input.nextLine();
            switch (option) {
                case "1" -> {
                    Character c = databaseC.remove(u.getRegisterNumber());
                    databaseManager.saveDatabaseC(databaseC);
                    DeleteEquipment delEquip = new DeleteEquipment();
                    delEquip.DeleteEquipment(c);
                }
                default -> {
                    Menu menu = new Menu();
                    menu.Menu(u);
                }
            }
        }else{
            Character c = databaseC.remove(u.getRegisterNumber());
            databaseManager.saveDatabaseC(databaseC);
            DeleteEquipment delEquip = new DeleteEquipment();
            delEquip.DeleteEquipment(c);
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


}
