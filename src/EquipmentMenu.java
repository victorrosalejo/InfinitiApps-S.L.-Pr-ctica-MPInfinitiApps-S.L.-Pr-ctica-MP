import java.io.Serializable;
import java.util.*;

public class EquipmentMenu implements Serializable {
    private DatabaseManager databaseManager = new DatabaseManager();
    private Map<String, List<Armor>> databaseA = new HashMap<>();
    private Map<String, List<Weapon>> databaseW = new HashMap<>();
    private Map<String, Character> databaseC = new HashMap<>();


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

    public void EquipmentMenu(User u) {
        Scanner input = new Scanner(System.in);
        String selectedA, selectedW;

        Map<String, List<Armor>> databaseA = databaseManager.obtainDatabaseA();
        databaseC = databaseManager.obtainDatabaseC();
        Character c = databaseC.remove(u.getRegisterNumber());
        List<Armor> ArmadurasInv = databaseA.get(c.getName());

        System.out.print("\n<><><><><><><><><><><><><><><><><><><>\n");
        System.out.println("\n[-------------------------------------]");
        System.out.println(   "         MENU DE EQUIPAMIENTO         ");
        System.out.println("[-------------------------------------]\n");

        System.out.println("Se han desequipado todas las armas y armaduras");
        int i = 1;
        int a = -1;
        boolean valido = false;

        System.out.println("     [------------------- ARMADURA ------------------] ");
            for (Armor elemento : ArmadurasInv) {
                elemento.setActive(false);
                System.out.println(i + ". " + elemento.getName() + ", ataque: " + elemento.getAttack() + ", defensa: " + elemento.getDefense() + ", sin equipar");
                i++;
            }

        do {
            System.out.println("     ------------------------------------------------- ");
            System.out.print("--> Introduce el numero de la armadura a equipar: ");
            selectedA = input.nextLine();
            try {
                a = Integer.parseInt(selectedA);
                a -= 1;

                valido = true;
            } catch (NumberFormatException e) {
                System.out.println("El valor no es un número");

            }
            if(a< 0 || a>= ArmadurasInv.size()) {
                System.out.println("El valor no es un entero válido");
                valido = false;
            }
            for(int j = 0; j< ArmadurasInv.size(); j++) {
                if (a == j) {
                    ArmadurasInv.get(j).setActive(true);
                    System.out.println("\nArmadura correctamente equipada");
                    System.out.print("Armadura "+ArmadurasInv.get(j).getName() + ", equipada");
                    selectedA = input.nextLine();
                }
            }

        } while (!valido );

        databaseManager.saveDatabaseA(databaseA);
        c.setArmorSet(ArmadurasInv);

        Map<String, List<Weapon>> databaseW = databaseManager.obtainDatabaseW();
        List<Weapon> ArmasInv = databaseW.get(c.getName());

        i = 1;
        a = -1;
        int manosocupadas = 0;
        valido = false;

        System.out.println("     [--------------------- ARMAS -------------------] ");
        for (Weapon elemento1 : ArmasInv) {
            elemento1.setActive(false);
            System.out.println(i + ". " + elemento1.getName() + ", manos: " + elemento1.getHands() + ", ataque: " + elemento1.getAttack() + ", defensa: " + elemento1.getDefence() + ", sin equipar");
            i++;
        }

        do {
            System.out.println("     [-----------------------------------------------] ");
            System.out.print("--> Introduce el numero del arma a equipar: ");
            selectedW = input.nextLine();
            try {
                a = Integer.parseInt(selectedW);
                a -= 1;

                valido = true;
            } catch (NumberFormatException e) {
                System.out.println("\nEl valor no es un número");
            }
            if(a< 0 || a>= ArmasInv.size()){
                System.out.println("El valor no es un entero válido");
            }
            for(int j = 0; j< ArmasInv.size(); j++) {
                if (ArmasInv.get(j).isActive() && a == j){
                    System.out.println("\nArma ya equipada");
                }else if (a == j) {
                    ArmasInv.get(j).setActive(true);
                    if (manosocupadas + ArmasInv.get(j).getHands() < 3) {
                        manosocupadas += ArmasInv.get(j).getHands();
                        System.out.print("\nArma "+ArmasInv.get(j).getName() + ", equipada");
                        System.out.print("\nArma correctamente equipada ");
                        selectedA = input.nextLine();
                    }else{
                        System.out.println("No puedes superar el número de manos");
                        selectedA = input.nextLine();
                    }
                }
            }

        } while (!valido || manosocupadas != 2 );
        System.out.println("Todas las manos ocupadas");
        selectedA = input.nextLine();
        c.setWeaponSet(ArmasInv);
        databaseC.put(u.getRegisterNumber(),c);
        databaseManager.saveDatabaseC(databaseC);
        databaseManager.saveDatabaseW(databaseW);
        menu(u);
    }

    private void menu(User u){
        Menu menu = new Menu();
        menu.Menu(u);
    }
}


