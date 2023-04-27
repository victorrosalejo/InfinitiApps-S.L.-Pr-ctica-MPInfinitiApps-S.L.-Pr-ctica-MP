import java.io.Serializable;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class EquipmentMenu implements Serializable {
    private DatabaseManager databaseManager = new DatabaseManager();
    private Map<String, List<Armor>> databaseA = new HashMap<>();
    private Map<String, List<Weapon>> databaseW = new HashMap<>();
    private Map<String,Character> databaseC = new HashMap<>();


    public Map<String, List<Armor>> getDatabaseA() {
        return databaseA;
    }

    public void setDatabaseA(Map<String, List<Armor>> databaseA) {
        this.databaseA = databaseA;
    }

    public Map<String, List<Weapon>> getDatabaseW() {
        return databaseW;
    }

    public void setDatabaseW(Map<String, List<Weapon>> databaseW) {
        this.databaseW = databaseW;
    }

    public Map<String, Character> getDatabaseC() {
        return databaseC;
    }

    public void setDatabaseC(Map<String, Character> databaseC) {
        this.databaseC = databaseC;
    }


    public DatabaseManager getDatabaseManager() {
        return databaseManager;
    }

    public void setDatabaseManager(DatabaseManager databaseManager) {
        this.databaseManager = databaseManager;
    }

    public void EquipentMenu(User u){
        Scanner input = new Scanner(System.in);
        String selectedA, selectedW;

        Map<String, List<Armor>> databaseA = databaseManager.obtainDatabaseA();
        List<Armor> ArmadurasInv = databaseA.get(u.getName());
        Map<String, List<Weapon>> databaseW = databaseManager.obtainDatabaseW();
        List<Weapon> ArmasInv = databaseW.get(u.getName());

        System.out.println("\n[-------------------------------------]\n");

        for (Armor elemento : ArmadurasInv) {
            System.out.println(elemento.getName() +"," + elemento.isActive());
        }

        for (Weapon elemento1 : ArmasInv ) {
            System.out.println(elemento1.getName() +"," + elemento1.isActive());
        }
        System.out.print("\n--> Introduce el nombre de la armadura a equipar(Igual que se mostro): ");
        selectedA = input.nextLine();
        System.out.print("\n--> Introduce el nombre del arma a equipar(Igual que se mostro): ");
        selectedW = input.nextLine();



        boolean validoW = false; // esta exquisito
        boolean validoA = false;
        do{

            for (Armor elemento : ArmadurasInv) {
                if (selectedA == elemento.getName()){
                    validoA = true;
                    elemento.setActive(true);
                }
                else {
                    elemento.setActive(false); // esto se hace para que se desactiven todas las armaduras ya activadas previamente
                }

            }
            if (validoA == false){
                System.out.print("\n--> No existe: ");
                System.out.print("\n--> Introduce el nombre de la armadura otra vez: ");
                selectedA = input.nextLine();

            }


            for (Weapon elemento : ArmasInv) {
                if (selectedW == elemento.getName()){
                    validoW = true;
                    elemento.setActive(true);
                }
                else {
                    elemento.setActive(false); // esto se hace para que se desactiven todas las armas ya activadas previamente
                }

            }
            if (validoW == false){
                System.out.print("\n--> No existe: ");
                System.out.print("\n--> Introduce el nombre del arma otra vez: ");
                selectedW = input.nextLine();

            }
        }while(validoA == true && validoW == true);
        System.out.println("\n[-------------------------------------]\n");

        databaseManager.saveDatabaseW(databaseW);
        databaseManager.saveDatabaseA(databaseA);


    }

}
