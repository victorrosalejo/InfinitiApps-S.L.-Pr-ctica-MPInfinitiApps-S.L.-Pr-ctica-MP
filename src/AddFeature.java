import java.io.Serializable;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class AddFeature  implements Serializable {

    private DatabaseManager databaseManager = new DatabaseManager();
    private Map<String, Character> databaseC = new HashMap<>();
    private Map<String,List<Minion>> databaseM = new HashMap<>();


    public void AddFeature(User u){
    Scanner scanner = new Scanner(System.in);
    int option = 0;
    boolean exit = false;
    databaseC = databaseManager.obtainDatabaseC();
    Character c = databaseC.remove(u.getRegisterNumber());

    while(!exit){
        System.out.println("Seleccione una opción:");
        System.out.println("1. Agregar modificador");
        System.out.println("2. Agregar arma");
        System.out.println("3. Agregar armadura");
        System.out.println("4. Agregar minions");
        System.out.println("5. Salir");

        option = scanner.nextInt();

        switch(option){
            case 1:
                c = addModifier(c);
                break;
            case 2:
                c = addWeapon(c);
                break;
            case 3:
                c = addArmor(c);
                break;
            case 4:
                c = addMinions(c);
                break;
            case 5:
                exit = true;
                break;
            default:
                System.out.println("Opción inválida. Intente de nuevo.");
                break;
        }
    }
    databaseC.put(u.getRegisterNumber(),c);

}

    public DatabaseManager getDatabaseManager() {
        return databaseManager;
    }

    public void setDatabaseManager(DatabaseManager databaseManager) {
        this.databaseManager = databaseManager;
    }

    private Character addModifier(Character c){
        AddModifier addModifier = new AddModifier();
        c =  addModifier.AddModifier(c);
        return  c;
    }

    private Character addWeapon(Character c){
        AddWeapon addWeapon = new AddWeapon();
        c = addWeapon.AddWeapon(c);
        return c;
    }

    private Character addArmor(Character c){
        AddArmor addArmor = new AddArmor();
        c = addArmor.AddArmor(c);
        return c;
    }

    private Character addMinions(Character c){
        AddMinion addMinion = new AddMinion();
        c.setMinionMap(addMinion.AddMinion(c.getMinionMap()));
        databaseM.remove(c.getName());
        databaseM.put(c.getName(),c.getMinionMap());
        databaseManager.saveDatabaseM(databaseM);
        return c;

    }


}
