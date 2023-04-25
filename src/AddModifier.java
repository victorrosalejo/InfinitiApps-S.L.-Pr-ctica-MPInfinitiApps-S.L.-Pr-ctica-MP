import java.io.Serializable;
import java.lang.reflect.Modifier;
import java.util.*;

public class AddModifier  implements Serializable {

    private DatabaseManager databaseManager;
    private Map<String, List<Modifiers>> databaseMo = new HashMap<>();

    public Character AddModifier(Character c){
    databaseMo = databaseManager.obtainDatabaseMo();
    Scanner scanner = new Scanner(System.in);
            System.out.println("Si quiere salir escriba 'salir':");
    String salir = scanner.nextLine();
            if(salir == "salir"){
        return c;
    }
            System.out.print("Ingrese el nombre de la nueva modificación: ");
    String name = scanner.nextLine();
    int attack = 0;
            while (attack < 1 || attack > 5) {
        System.out.print("Ingrese el valor de la nueva modificación (entre 1 y 5): ");
        attack = scanner.nextInt();
    }
    String buff;
    boolean b = false;
    boolean a = true;
    while(a) {
        System.out.print("Ingrese el tipo de modificación que desea (Debilidad o Fortaleza): ");
        buff = scanner.nextLine();
        buff.toLowerCase();
        switch (buff) {
            case "debilidad":
                b = false;
                a = false;
                break;
            case "fortaleza":
                b = true;
                a = false;
                break;
            default:
                System.out.println("Entrada no reconocida");
                break;
        }
    }

    Modifiers modifiers = new Modifiers();
            modifiers.setName(name);
            modifiers.setValue(attack);
            modifiers.setBuff(b);
            modifiers.setActive(false);
    List<Modifiers> modifiersList= databaseMo.remove(c.getName());
            modifiersList.add(modifiers);
            c.setModifierList(modifiersList);
            databaseMo.put(c.getName(), modifiersList);
            databaseManager.saveDatabaseMo(databaseMo);
            System.out.print("Modificación añadida correctamente");

            return c;
}


    public DatabaseManager getDatabaseManager() {
        return databaseManager;
    }

    public void setDatabaseManager(DatabaseManager databaseManager) {
        this.databaseManager = databaseManager;
    }


    }




