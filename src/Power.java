import java.util.Scanner;

public class Power {
    public Character Power(Character c) {
        Scanner scanner = new Scanner(System.in);
        int i = c.getPower();
        System.out.println("Poder del persoanje: " + (i));
        while (true) {
            System.out.println("Introduce el nuevo valor [0-5] (Introduzca 'salir' para regresar al menu):");
            String input = scanner.nextLine();

            //verificamos si se quiere salir del programa
            if (input.equals("salir")) {
                break;
            }

            //verificamos si el input es un número válido entre 0 y 10
            try {
                int value = Integer.parseInt(input);
                if (value >= 0 && value <= 5) {
                    //asignamos el valor a la variable correspondiente
                    c.setPower(value);
                    break;
                } else {
                    System.out.println("El número debe estar entre 0 y 5.");
                }
            } catch (NumberFormatException e) {
                System.out.println("Debe introducir un número válido.");
            }

        }
        return c;
    }
}