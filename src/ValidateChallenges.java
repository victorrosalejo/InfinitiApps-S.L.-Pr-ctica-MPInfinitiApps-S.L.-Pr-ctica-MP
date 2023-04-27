import java.io.Serializable;
import java.util.*;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class ValidateChallenges implements Serializable {
    private DatabaseManager databaseManager;
    private Map<String, List<Challenge>> databaseP = new HashMap<>();
    private Map<String,List<Modifiers>> databaseMo = new HashMap<>();
    private Map<String,Character> databaseC = new HashMap<>();
    private Map<String,User> databaseU = new HashMap<>();

    public void ValidateChallenges(){
        databaseManager = new DatabaseManager();
        databaseP = databaseManager.obtainDatabaseP();
        List<Map.Entry<String, List<Challenge>>> challenges =new ArrayList<>(databaseP.entrySet());
        List<Integer> aux = new ArrayList<>();
        System.out.println("\n          [-------------------------------------]");
        System.out.println("                       VALIDAR DESAFIO");
        System.out.println("          [-------------------------------------]\n");
        System.out.println("     [---------------- LISTA DE DESAFIOS -------------] ");

        Set<String> keyset = databaseP.keySet();

        for (String key : keyset) {
            List<Challenge> ch = databaseP.get(key);
            System.out.println("     Numero de registro:" + key);
            if (!ch.isEmpty()) {
                for (int k= 0; k < ch.size();k++){
                    System.out.println("                 -Numero de desafío: " + k);
                    System.out.println("                 >Desafiante: " + ch.get(k).getDefiant());
                    System.out.println("                 >Desafiado: " + ch.get(k).getDefied());
                    System.out.println("                 >Oro apostado: " + ch.get(k).getGold());
                    System.out.println("     ------------------------------------------------- ");}
            }
            else if (ch.isEmpty()) {
                System.out.println("                 >El usuario no tiene desafíos pendientes");
                System.out.println("     ------------------------------------------------- ");
            }
        }





        //Pedimos el numeor de registro y numero de desafío a validar.
        Scanner scanner = new Scanner(System.in);
        int chIndex = 0;
        String numReg = null;
        Boolean validateWhile = true;
        while (validateWhile) {
            try {
                System.out.print("Seleccione el número de registro donde está el desafío a validar('s' para salir): ");
                numReg = scanner.next();
                if (numReg.equalsIgnoreCase("s")) { // Si se ingresa 's', salimos del while
                    break;
                }
                System.out.print("Seleccione el número de desafío a validar");
                chIndex = Integer.parseInt(scanner.next());
                validateWhile = false;
            } catch (NumberFormatException e) {
                System.out.println("Error: Debe introducir un número válido.");
            }
        }


        if (numReg == "s"){
        //me elimina o me valida un desafío
            int op = 0;
        List<Challenge> c = databaseP.get(numReg);
        switch(op) {
            case 1:
                System.out.println("El dasafío " + chIndex + "ha sido validado correctamente.");
                c.get(chIndex).setValid(true);
                break;
            case 2:
                System.out.println("El desafío" + chIndex + "ha sido eliminado correctamente.");
                c.remove(chIndex);
                break;
            default:
                System.out.println("Opción inválida");
        }

        System.out.println("Ahora debe escoger las modificaciones");

        //Sirve para sacar el nombre u usarlo en el mapa de modificadores.
        databaseManager = new DatabaseManager();
        databaseU = databaseManager.obtainDatabaseU();
        String name1 = null;
        String name2 = null;
        for (int i = 0; i < databaseU.size(); i++){
            if (databaseU.get(i).getRegisterNumber().equals(c.get(chIndex).getDefiant().getRegisterNumber())){
                name1 = databaseU.get(i).getName();
            }
        }
        for (int i = 0; i < databaseU.size(); i++){
            if (databaseU.get(i).getRegisterNumber().equals(c.get(chIndex).getDefied().getRegisterNumber())){
                name2 = databaseU.get(i).getName();
            }
        }

        List<Modifiers> listmod = databaseMo.get(name1);
        List<Modifiers> listmod2 = databaseMo.get(name2);

        System.out.println("Aqui se muestran los modificadores del desafiante");
        for(int i = 0; i < listmod.size(); i++){
            listmod.get(i).setActive(false);
            Modifiers modifiers = listmod.get(i);
            System.out.println((i+1) + modifiers.getName());
        }
        boolean x = true;
        while(x) {
            System.out.println("Introduce el número del modificador que quieres activar (introduce '0' para salir)");
            Integer q = scanner.nextInt()-1;
            if (Objects.equals(q, -1)) {
                x = false;
            }else if (q < listmod.size() && q>-1) {
                listmod.get(q).setActive(true);
            }else {
                System.out.println("Número incorrecto");
            }        }
        System.out.println("Aqui se muestran los modificadores del desafiado");
        for(int i = 0; i < listmod2.size(); i++){
            listmod2.get(i).setActive(false);
            Modifiers modifiers = listmod2.get(i);
            System.out.println((i+1) + modifiers.getName());
        }
        x = true;
        while(x) {
            System.out.println("Introduce el número del modificador que quieres activar (introduce '0' para salir)");
            Integer q = scanner.nextInt()-1;
            if (Objects.equals(q, -1)) {
                x = false;
            }else if (q < listmod2.size() && q>-1) {
                listmod2.get(q).setActive(true);
            }else {
                System.out.println("Número incorrecto");
            }
        }
        databaseMo.put(name1,listmod);
        databaseMo.put(name2,listmod2);
        databaseManager.saveDatabaseMo(databaseMo);
    }}

    public DatabaseManager getDatabaseManager() {
        return databaseManager;
    }

    public void setDatabaseManager(DatabaseManager databaseManager) {
        this.databaseManager = databaseManager;
    }

    public Map<String, List<Challenge>> getDatabaseP() {
        return databaseP;
    }

    public void setDatabaseP(Map<String, List<Challenge>> databaseP) {
        this.databaseP = databaseP;
    }
}
