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


    public void ValidateChallenges(){
        databaseManager = new DatabaseManager();
        databaseP = databaseManager.obtainDatabaseP();
        List<Map.Entry<String, List<Challenge>>> challenges =new ArrayList<>(databaseP.entrySet());
        List<Integer> aux = new ArrayList<>();
        System.out.println("----------------[Lista de Desafíos por validar]-----------------");
        System.out.println("Los desafíos validados no se mostrarán");
        for (int i = 0; i <= challenges.size(); i++) {
            for (int j = 0; j <= challenges.get(i).getValue().size(); j++) {
                Challenge ch = challenges.get(i).getValue().get(j);
                if (!ch.isValid()) {
                    aux.add(j);
                    System.out.println((i+j+1) + ". ");
                    System.out.println(("Desafiante") + " - " + ch.getDefiant().getName());
                    System.out.println(("Desafiado") + " - " + ch.getDefied().getName());
                    System.out.println(("Oro apostado") + " - " + ch.getGold());
                }else{
                    aux.add(-1);
                }
            }
        }

        Scanner scanner = new Scanner(System.in);
        int chIndex = 0;
        while (!scanner.hasNextInt()); {
            System.out.print("Seleccione el número de desafío que desea validar: ");
            chIndex = scanner.nextInt() - 1;
        }
        int  aux2 = aux.get(chIndex);
        Challenge ch = challenges.get(chIndex).getValue().remove(aux2);
        ch.setValid(true);
        challenges.get(chIndex).getValue().add(ch);
        System.out.println("Validado. Ahora debe escoger las modificaciones");
        databaseP.clear();
        for (int i = 0; i<= challenges.size(); i++){
            String str = challenges.get(i).getKey();
            List<Challenge> chall = challenges.get(i).getValue();
            databaseP.put(str,chall);
        }
        databaseManager.saveDatabaseP(databaseP);
        databaseMo = databaseManager.obtainDatabaseMo();
        databaseC = databaseManager.obtainDatabaseC();


        Character character1 = databaseC.get(ch.getDefiant().getRegisterNumber());
        List<Modifiers> listmod = character1.getModifiersList();
        databaseMo.remove(character1.getName());

        Character character2 = databaseC.get(ch.getDefied().getRegisterNumber());
        List<Modifiers> listmod2 = character2.getModifiersList();
        databaseMo.remove(character2.getName());

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
        databaseMo.put(character2.getName(),listmod2);
        databaseMo.put(character1.getName(),listmod);
        databaseManager.saveDatabaseMo(databaseMo);
    }

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
