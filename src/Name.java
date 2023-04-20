import java.util.Scanner;

public class Name {
private String  name;


    public Character Name (Character c){
        System.out.println("El nombre actual del personaje es: " + c.getName());
        System.out.print("Escribe el nuevo nombre para el personaje: ");
        Scanner scanner = new Scanner(System.in);
        String nuevoNombre = scanner.next();
        System.out.print("Escribe de nuevo el nombre para confirmar: ");
        String confirmacionNombre = scanner.next();

        if (nuevoNombre.equals(confirmacionNombre)) {
            c.setName(nuevoNombre);
            System.out.println("El nombre del personaje se ha cambiado correctamente a " + c.getName());
        } else {
            System.out.println("Los nombres no coinciden. No se ha cambiado el nombre del personaje.");
        }
        scanner.close();
    return c;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
