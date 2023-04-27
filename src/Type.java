import java.io.Serializable;
import java.util.Scanner;

public class Type implements Serializable {
    public Character Type(Character c){
        System.out.println("El tipo actual de personaje es" + c.getType() );
        System.out.print("\n");
        System.out.println("-- Seleccione un personaje --");
        System.out.println("-> Vampiro");
        System.out.println("-> Licántropo");
        System.out.println("-> Cazador");
        Scanner scanner = new Scanner(System.in);
        String nuevoTipo = scanner.next();

        if (nuevoTipo.equalsIgnoreCase("Vampiro") || nuevoTipo.equalsIgnoreCase("Licántropo") || nuevoTipo.equalsIgnoreCase("Cazador")) {
            c.setType(nuevoTipo);
            Ability ab = c.getSpecialAbility();
            TCharacter tc = c.getType();
            ab.setType(tc);
            c.setSpecialAbility(ab);
            System.out.println("\nTipo actualizado del persoanje actualizado a "+ c.getType());
        } else {
            System.out.println("\nTipo inválido. El tipo debe ser Vampiro, Licántropo o Cazador.");
        }

        return c;
    }
}
