import java.io.Serializable;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class AddWeapon  implements Serializable {
    private DatabaseManager databaseManager = new DatabaseManager();
    private Map<String, List<Weapon>> databaseW = new  HashMap<>();

    public Character AddWeapon(Character c){
            databaseW = databaseManager.obtainDatabaseW();
            Scanner scanner = new Scanner(System.in);
            System.out.println("Si quiere salir escriba 'salir':");
            String salir = scanner.nextLine();
            if(salir == "salir"){
                return c;
            }
            System.out.print("Ingrese el nombre del nuevo arma: ");
                String name = scanner.nextLine();
            int attack = 0;
            while (attack < 1 || attack > 3) {
                System.out.print("Ingrese el ataque del nuevo arma (entre 1 y 3): ");
                attack = scanner.nextInt();
            }
            int defense = -1;
            while (defense < 0 || defense > 3) {
                System.out.print("Ingrese la defensa del nuevo arma (entre 0 y 3): ");
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
            newWeapon.setActive(false);
            List<Weapon> weaponList= databaseW.remove(c.getName());
            weaponList.add(newWeapon);
            c.setWeaponSet(weaponList);
            databaseW.put(c.getName(), weaponList);
            databaseManager.saveDatabaseW(databaseW);
            System.out.print("Arma añadida correctamente");

            return c;
    }


    public DatabaseManager getDatabaseManager() {
        return databaseManager;
    }

    public void setDatabaseManager(DatabaseManager databaseManager) {
        this.databaseManager = databaseManager;
    }

}
