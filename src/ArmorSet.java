import java.io.Serializable;
import java.util.List;
import java.util.Scanner;

public class ArmorSet implements Serializable {
        public Character ArmorSet(Character c){
            for(int i = 0; i<c.getArmorSet().size();i++)

    {
        Armor armor = c.getArmorSet().get(i);
        System.out.println("----------------[Conjunto de armaduras]-----------------");
        System.out.println("----------------------------------------------------");
        System.out.println("----------------[ " + (i + 1) + " ]-----------------");
        System.out.println((i + 1) + ". " + armor.getName());
        System.out.println(("Ataque") + " - " + armor.getAttack());
        System.out.println(("Defensa") + " - " + armor.getDefense());
    }

    Scanner scanner = new Scanner(System.in);
            System.out.print("Seleccione el número de armadura que desea modificar (Introduzca '0' para regresar al menu): ");
    int armorIndex = scanner.nextInt() - 1;
    if (armorIndex == -1){
        return c;
    } else if (c.getArmorSet().remove(armorIndex) != null) {
        Armor armor = c.getArmorSet().remove(armorIndex);
        System.out.println("Modificando armadura: " + armor.getName());
        System.out.println("Seleccione la característica que desea modificar: ");
        System.out.println("1. Nombre");
        System.out.println("2. Ataque");
        System.out.println("3. Defensa");
        int option = scanner.nextInt();
        switch (option) {
            case 1:
                System.out.print("Ingrese el nuevo nombre: ");
                scanner.nextLine();
                String newName = scanner.nextLine();
                armor.setName(newName);
                break;
            case 2:
                int newAttack = 0;
                while (newAttack < 1 || newAttack > 3) {
                    System.out.print("Ingrese el nuevo valor de ataque (entre 1 y 3): ");
                    newAttack = scanner.nextInt();
                }

                armor.setAttack(newAttack);
                break;
            case 3:
                int newDefense = 0;
                while (newDefense < 1 || newDefense > 3) {
                    System.out.print("Ingrese el nuevo valor de defensa (entre 1 y 3): ");
                    newDefense = scanner.nextInt();
                }
                armor.setDefense(newDefense);
                break;
            default:
                System.out.println("Opción inválida. Intente nuevamente.");
                break;
        }
        if (option == 1 || option == 2 || option == 3) {
            System.out.println("Característica modificada correctamente.");
        }
        List<Armor> armorList = c.getArmorSet();
        armorList.set(armorIndex - 1, armor);
        c.setArmorSet(armorList);
        return c;
    }
    System.out.println("Armadura no encontrada");
    return c;
}
}


