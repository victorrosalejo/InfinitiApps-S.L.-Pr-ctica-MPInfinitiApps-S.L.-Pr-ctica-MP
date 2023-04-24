import java.io.Serializable;
import java.util.*;


public class UserManager implements Serializable {
private DatabaseManager databaseManager = new DatabaseManager();
private Map<String, User> databaseU = new HashMap<>();


   public void UserManager() {
       databaseU = databaseManager.obtainDatabaseU();
       boolean salir = false;
       Scanner scanner = new Scanner(System.in);
       while (!salir) {
           System.out.println("\n--- Menú de Baneo de Usuarios ---");
           System.out.println("1. Mostrar todos los usuarios");
           System.out.println("2. Banear un usuario");
           System.out.println("3. Desbanear un usuario");
           System.out.println("4. Salir");
           System.out.print("Ingrese la opción deseada: ");
           int opcion = scanner.nextInt();
           //numero de registro distitno de 0
           switch (opcion) {
               case 1 -> {
                   // Mostrar todos los usuarios
                   System.out.println("\n--- Lista de Usuarios ---");
                   for (int i = 1; i < databaseU.size(); i++) {
                           System.out.println("--------------------------------");
                           System.out.println("Nombre de usuario" + databaseU.get(i).getName() + " ---");
                            if (databaseU.get(i).isBanned()) {
                               System.out.println("--> Este usuario se encuentra banaeado");
                           } else {
                               System.out.println("--> Este usuario se encuentra desbaneado");
                           }
                       }
                   }
               case 2 -> {

                   System.out.println("---  Banear usuario ---");
                   System.out.print("Introduce el nombre del usuario a banear--> ");
                   String codeUser = scanner.next();
                   if (!codeUser.startsWith("¬")) {
                        User u = databaseU.remove(codeUser);
                        if ( u != null) {
                               if (u.isBanned()) {
                                   System.out.println("El usuario ya está baneado");
                               } else {
                                   u.setBanned(true);
                                   databaseU.put(codeUser, u);
                               }
                           } else {
                               System.out.println("El usuario no existe");
                        }
                   }

               }
               case 3 -> {
                   System.out.println("---  Desbanear usuario ---");
                   System.out.print("Introduce el nombre del usuario a desbanear--> ");
                   String codeUser = scanner.next();
                   if (!codeUser.startsWith("¬")) {
                       User u = databaseU.remove(codeUser);
                       if ( u != null) {
                           if (!u.isBanned()) {
                               System.out.println("El usuario no está baneado");
                           } else {
                               u.setBanned(false);
                               databaseU.put(codeUser, u);
                           }
                       } else {
                           System.out.println("El usuario no existe");
                       }

                   }
               }
               case 4 -> salir = true;
           }
           System.out.println("Usuarios modificados correctamente");
       }
       databaseManager.saveDatabaseU(databaseU);
   }




}






