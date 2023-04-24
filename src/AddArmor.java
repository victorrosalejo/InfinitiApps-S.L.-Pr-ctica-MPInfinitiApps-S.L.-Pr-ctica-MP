import java.io.Serializable;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class AddArmor implements Serializable {

    private DatabaseManager databaseManager;
    private Map<String, List<Armor>> databaseA = new HashMap<>();

    public Character AddArmor(Character c){
        databaseA = databaseManager.obtainDatabaseA();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Si quiere salir escriba 'salir':");
        String salir = scanner.nextLine();
        if(salir == "salir"){
            return c;
        }
        System.out.print("Ingrese el nombre de la nueva armadura: ");
        String name = scanner.nextLine();
        int attack = -1;
        while (attack < 0 || attack > 3) {
            System.out.print("Ingrese el ataque de la nueva armadura (entre 0 y 3): ");
            attack = scanner.nextInt();
        }
        int defense = 0;
        while (defense < 1 || defense > 3) {
            System.out.print("Ingrese la defensa de la nueva armadura (entre 1 y 3): ");
            defense = scanner.nextInt();
        }
        Armor newArmor = new Armor();
        newArmor.setName(name);
        newArmor.setAttack(attack);
        newArmor.setDefense(defense);
        newArmor.setActive(false);
        List<Armor> armorList= databaseA.remove(c.getName());
        armorList.add(newArmor);
        c.setArmorSet(armorList);
        databaseA.put(c.getName(), armorList);
        databaseManager.saveDatabaseA(databaseA);
        System.out.print("Armadura añadida correctamente");
        return c;

    }


    public DatabaseManager getDatabaseManager() {
        return databaseManager;
    }

    public void setDatabaseManager(DatabaseManager databaseManager) {
        this.databaseManager = databaseManager;
    }

}
