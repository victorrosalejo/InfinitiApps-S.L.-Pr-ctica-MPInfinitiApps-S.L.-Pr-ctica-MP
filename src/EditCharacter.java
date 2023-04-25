import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class EditCharacter implements Serializable {

    private DatabaseManager databaseManager;
    private Map<String, Character> databaseC = new HashMap<>();

    public void EditCharacter(){
        databaseManager = new DatabaseManager();
        databaseC = databaseManager.obtainDatabaseC();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese el numero de registro del jugador a editar:");
        String player = scanner.next();
        Character c = databaseC.remove(player);
        if (c == null) {
            System.out.println("El jugador no tiene personajes.");
        } else {

            scanner = new Scanner(System.in);
            boolean exit = false;
            while (!exit) {
                System.out.println("\n--- Menú de edición de personaje ---");
                System.out.println("1.  Editar nombre");
                System.out.println("2.  Editar tipo");
                System.out.println("3.  Editar equipo de armas");
                System.out.println("4.  Editar equipo de armadura");
                System.out.println("5.  Editar puntos de vida");
                System.out.println("6.  Editar poder");
                System.out.println("7.  Editar mapa de secuaces");
                System.out.println("8.  Editar descripción");
                System.out.println("9.  Editar habilidades especiales");
                System.out.println("10. Editar valores de oro");
                System.out.println("11. Editar lista de modificadores");
                System.out.println("12. Editar victorias");
                System.out.println("13. Salir");
                System.out.println("Seleccione una opción:");

                int option = scanner.nextInt();
                scanner.nextLine();

                switch (option) {
                    case 1:
                        c = editName(c);
                        databaseC.put(player, c);
                        databaseManager.saveDatabaseC(databaseC);
                        break;
                    case 2:
                        c = editType(c);
                        databaseC.put(player, c);
                        databaseManager.saveDatabaseC(databaseC);
                        break;
                    case 3:
                        c = editWeaponSet(c);
                        databaseC.put(player, c);
                        databaseManager.saveDatabaseC(databaseC);
                        break;
                    case 4:
                        c = editArmor(c);
                        System.out.println("Equipo de armadura editado.");
                        break;
                    case 5:
                        c = editHitPoints(c);
                        System.out.println("Puntos de vida editados.");
                        break;
                    case 6:
                        c = editPower(c);
                        System.out.println("Poder editado.");
                        break;
                    case 7:
                        c = editMinionMap(c);
                        System.out.println("Mapa de secuaces editado.");
                        break;
                    case 8:
                        c = editDescription(c);
                        System.out.println("Descripción editada.");
                        break;
                    case 9:
                        c = editSpecialAbilities(c);
                        System.out.println("Habilidades especiales editadas.");
                        break;
                    case 10:
                        c = editGoldValues(c);
                        System.out.println("Valores de oro editados.");
                        break;
                    case 11:
                        c = editModifiersList(c);
                        System.out.println("Lista de modificadores editada.");
                        break;
                    case 12:
                        c = editWins(c);
                        System.out.println("Victorias editadas.");
                        break;
                    case 13:
                        System.out.println("Saliendo...");
                        exit = true;
                        break;
                    default:
                        System.out.println("Opción no válida. Vuelva a intentarlo.");
                        break;
            }
            EditCharacter(); //volver a llamar al menu 
        }

    }
    }
    private Character editName(Character c){
        Name name = new Name();
        c = name.Name(c);
        return c;
    }
    private Character editType(Character c){  //Type
        Type editType = new Type();
        c = editType.Type(c);
        return c;
    }

    private Character editWeaponSet(Character c){ //WeaponSet
        WeaponSet weaponSet = new WeaponSet();
        c = weaponSet.WeaponSet(c);
        return c;
    }
    private Character editArmor(Character c){
        ArmorSet armorSet = new ArmorSet();
        c = armorSet.ArmorSet(c);
        return c;
    }

    private Character editHitPoints(Character c){
        HitPoints HitPoints = new HitPoints();
        c = HitPoints.HitPoints(c);
        return c;
    }

    private Character editPower(Character c){
        Power Power = new Power();
        c = Power.Power(c);
        return c;
    }

    private Character editMinionMap(Character c){
        MinionMap minionMap = new MinionMap();
        c = minionMap.MinionMap(c);
        return c;
    }

    private Character editDescription(Character c) {
        Description description = new Description();
        c = description.Description(c);
        return c;
    }
    private Character editSpecialAbilities(Character c){
        SpecialAbility specialAbilities = new SpecialAbility();
        c = specialAbilities.SpecialAbility(c);
        return c;
    }
    private Character editGoldValues(Character c){
        GoldValue goldValues = new GoldValue();
        c = goldValues.GoldValue(c);
        return c;
    }
    private Character editModifiersList(Character c){
        ModifierList modifiersList = new ModifierList();
        c = modifiersList.ModifierList(c);
        return c;
    }
    private Character editWins(Character c){
        Wins wins = new Wins();
        c = wins.Wins(c);
        return c;
    }


    public DatabaseManager getDatabaseManager() {
        return databaseManager;
    }

    public void setDatabaseManager(DatabaseManager databaseManager) {
        this.databaseManager = databaseManager;
    }

    public Map<String, Character> getDatabaseC() {
        return databaseC;
    }

    public void setDatabaseC(Map<String, Character> databaseC) {
        this.databaseC = databaseC;
    }

}
