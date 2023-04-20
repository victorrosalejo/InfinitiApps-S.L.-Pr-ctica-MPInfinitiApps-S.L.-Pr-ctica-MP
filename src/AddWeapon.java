import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class AddWeapon {
    private DatabaseManager databaseManager;
    private Map<String, List<Weapon>> databaseW = new  HashMap<>();
    private Weapon w;


    private void appendWeapon(Weapon w, Map<String, Weapon> databaseW){


        /*import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class WeaponSet {

    public Character WeaponSet(Character c) {
        Scanner scanner = new Scanner(System.in);
        boolean exit = false;
        while (!exit) {
            System.out.println("--- Gestión de armas ---");
            System.out.println("1. Ver lista de armas");
            System.out.println("2. Añadir arma");
            System.out.println("3. Eliminar arma");
            System.out.println("4. Salir");
            System.out.print("Seleccione una opción: ");
            int option = scanner.nextInt();
            System.out.println();

            switch (option) {
                case 1:
                    displayWeaponList(c);
                    break;
                case 2:
                    addWeapon(c);
                    break;
                case 3:
                    removeWeapon(c);
                    break;
                case 4:
                    exit = true;
                    break;
                default:
                    System.out.println("Opción inválida. Intente nuevamente.");
                    break;
            }
            System.out.println();
        }
        scanner.close();
        return c;
    }

    public void displayWeaponList(Character c){
            if (c.getWeaponSet().isEmpty()) {
                System.out.println("No hay armas en la lista.");
            }
            else{
            System.out.println("--- Lista de armas ---");
        for (int i = 0; i < c.getWeaponSet().size(); i++) {
            Weapon weapon = c.getWeaponSet().get(i);
            System.out.println("----------------[ "+ (i+1) +" ]-----------------");
            System.out.println((i+1) + ". " + weapon.getName());
            System.out.println(("Attack") + " - " + weapon.getAttack());
            System.out.println(("Defense") + " - " + weapon.getDefence());
            System.out.println(("Hands") + " - " + weapon.getHands());
            }
        }
    }

        private void addWeapon(Character c) {
            System.out.print("Ingrese el nombre del nuevo arma: ");
            Scanner scanner = new Scanner(System.in);
                String name = scanner.nextLine();
            int attack = 0;
            while (attack < 1 || attack > 3) {
                System.out.print("Ingrese el ataque del nuevo arma (entre 1 y 3): ");
                attack = scanner.nextInt();
            }
            int defense = 0;
            while (defense < 1 || defense > 3) {
                System.out.print("Ingrese la defensa del nuevo arma (entre 1 y 3): ");
                defense = scanner.nextInt();
            }
            int hands = 0;
            while (hands < 1 || hands > 2) {
                System.out.print("Ingrese las manos del nuevo arma (entre 1 y 2): ");
                hands = scanner.nextInt();
            }
            Weapon newWeapon = new Weapon();
            newWeapon.setName(name);
            newWeapon.setAttack(attack);
            newWeapon.setDefence(defense);
            newWeapon.setHands(hands);
            List<Weapon> weaponList= c.getWeaponSet();
            weaponList.add(newWeapon);
            System.out.print("Arma añadida correctamente");
       }

        private void removeWeapon(Character c) {
            System.out.print("Ingrese el nombre del arma a eliminar");
            Scanner scanner = new Scanner(System.in);
            String name = scanner.nextLine();
                for (int i = 0; i < c.getWeaponSet().size(); i++) {
                    Weapon weapon = c.getWeaponSet().get(i);
                    if (weapon.getName().equals(name)) {
                        c.getWeaponSet().remove(i);
                        System.out.print("Arma eliminada correctamente");
                        } else {
                        System.out.print("El arma a eliminar no existe");
            }
        }
    }
}
*/

    }
    public Character AddWeapon(Character c){
        return c;
    }

    public DatabaseManager getDatabaseManager() {
        return databaseManager;
    }

    public void setDatabaseManager(DatabaseManager databaseManager) {
        this.databaseManager = databaseManager;
    }

    public Map<String, List<Weapon>> getDatabaseW() {

        return databaseW;
    }

    public void setDatabaseW(Map<String, List<Weapon>> databaseW) {

        this.databaseW = databaseW;
    }

    public Weapon getW() {

        return w;
    }

    public void setW(Weapon w) {

        this.w = w;
    }


}
