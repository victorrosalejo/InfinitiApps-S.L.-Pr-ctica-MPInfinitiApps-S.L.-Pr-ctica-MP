import java.util.List;
import java.util.Scanner;

public class WeaponSet {

    public Character WeaponSet(Character c) {
        for (int i = 0; i < c.getWeaponSet().size(); i++) {
                Weapon weapon = c.getWeaponSet().get(i);
                System.out.println("----------------[Conjunto de armas]-----------------");
                System.out.println("----------------------------------------------------");
                System.out.println("----------------[ " + (i + 1) + " ]-----------------");
                System.out.println((i + 1) + ". " + weapon.getName());
                System.out.println(("Ataque") + " - " + weapon.getAttack());
                System.out.println(("Defensa") + " - " + weapon.getDefence());
                System.out.println(("Manos") + " - " + weapon.getHands());
        }
        Scanner scanner = new Scanner(System.in);
        System.out.print("Seleccione el número de arma que desea modificar(Introduzca '0' para regresar al menu): ");
        int weaponIndex = scanner.nextInt()-1;
        if (weaponIndex == -1) {
            return c;
        } else if (c.getWeaponSet().remove(weaponIndex) != null) {
        Weapon weapon = c.getWeaponSet().remove(weaponIndex);
        System.out.println("Modificando arma: " + weapon.getName());
        System.out.println("Seleccione la característica que desea modificar: ");
        System.out.println("1. Nombre");
        System.out.println("2. Ataque");
        System.out.println("3. Defensa");
        System.out.println("4. Manos");
        int option = scanner.nextInt();
        switch (option) {
            case 1:
                System.out.print("Ingrese el nuevo nombre: ");
                scanner.nextLine();
                String newName = scanner.nextLine();
                weapon.setName(newName);
            break;
            case 2:
                int newAttack = 0;
                while (newAttack < 1 || newAttack > 3) {
                    System.out.print("Ingrese el nuevo valor de ataque (entre 1 y 3): ");
                    newAttack = scanner.nextInt();
                }
                weapon.setAttack(newAttack);
            break;
            case 3:
                int newDefense = 0;
                while (newDefense < 1 || newDefense > 3) {
                    System.out.print("Ingrese el nuevo valor de defensa (entre 1 y 3): ");
                    newDefense = scanner.nextInt();
                }
                weapon.setDefence(newDefense);
            break;
            case 4:
                int newHands = 0;
                while (newHands < 1 || newHands > 2) {
                    System.out.print("Ingrese el nuevo valor de manos (entre 1 y 2): ");
                    newHands = scanner.nextInt();
                }
                weapon.setHands(newHands);
            break;
            default:
                System.out.println("Opción inválida. Intente nuevamente.");
            break;
        }
        if (option == 1 || option == 2 || option == 3 || option == 4){
            System.out.println("Característica modificada correctamente.");
        }
        List<Weapon> weaponList = c.getWeaponSet();
        weaponList.set(weaponIndex-1,weapon);
        c.setWeaponSet(weaponList);
        return c;
    }
    System.out.println("Arma no encontrada");
    return c;
}
}
