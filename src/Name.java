import java.io.Serializable;
import java.util.Scanner;

public class Name implements Serializable {
private String  name;


    public Character Name (Character c){
        System.out.println("El nombre actual del personaje es: " + c.getName());
        System.out.print("Escribe el nuevo nombre para el personaje (Introduzca 'salir' para regresar al menu): ");
        Scanner scanner = new Scanner(System.in);
        String nuevoNombre = scanner.next();
        if (nuevoNombre.equals("salir")) {
            return  c;
        }
        System.out.print("Escribe de nuevo el nombre para confirmar: ");
        String confirmacionNombre = scanner.next();

        if (nuevoNombre.equals(confirmacionNombre)) {
            c.setName(nuevoNombre);
            System.out.println("El nombre del personaje se ha cambiado correctamente a " + c.getName());
        } else {
            System.out.println("Los nombres no coinciden. No se ha cambiado el nombre del personaje.");
        }
    return c;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
