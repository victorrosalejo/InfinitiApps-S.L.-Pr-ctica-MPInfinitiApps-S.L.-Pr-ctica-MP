import java.util.List;
import java.util.Scanner;

public class SpecialAbility {

    public Character SpecialAbility(Character c) {

        Ability ability = c.getSpecialAbility();
        System.out.println("----------------[Habilidad especial]-----------------");
        System.out.println("----------------------------------------------------");
        System.out.println(("Ataque") + " - " + ability.getAttack());
        System.out.println(("Defensa") + " - " + ability.getDefense());

        Scanner scanner = new Scanner(System.in);
        System.out.println("Seleccione la característica que desea modificar o escriba 0 para salir: ");
        System.out.println("1. Ataque");
        System.out.println("2. Defensa");
        int option = scanner.nextInt();
        switch (option) {
            case 0:
                break;
            case 1:
                int newAttack = 0;
                while (newAttack < 1 || newAttack > 3) {
                    System.out.print("Ingrese el nuevo valor de ataque (entre 1 y 3): ");
                    newAttack = scanner.nextInt();
                }
                ability.setAttack(newAttack);
                break;
            case 2:
                int newDefense = 0;
                while (newDefense < 1 || newDefense > 3) {
                    System.out.print("Ingrese el nuevo valor de defensa (entre 1 y 3): ");
                    newDefense = scanner.nextInt();
                }
                ability.setDefense(newDefense);
                break;
            default:
                System.out.println("Opción inválida. Intente nuevamente.");
                break;
        }
        if (option == 1 || option == 2){
            System.out.println("Característica modificada correctamente.");
        }
        c.setSpecialAbility(ability);
        return c;
    }
}
