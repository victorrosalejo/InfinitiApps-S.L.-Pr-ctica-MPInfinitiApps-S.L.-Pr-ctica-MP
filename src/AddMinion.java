import java.io.Serializable;
import java.util.*;

public class AddMinion implements Serializable {


    public List<Minion> AddMinion(List<Minion> m){
        Minion newMinion = new Minion();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Si quiere salir escriba 'salir':");
        String salir = scanner.nextLine();
        if(salir.equalsIgnoreCase("salir")){
            return m;
        }
        System.out.print("Ingrese el nombre del nuevo esbirro: ");
        String name = scanner.nextLine();
        newMinion.setName(name);

        int hP = 0;
        while (hP < 1 || hP > 3) {
            System.out.print("Ingrese la vida del nuevo esbirro (entre 1 y 3): ");
            hP = scanner.nextInt();
        }
        newMinion.setHitPoints(hP);

        boolean aux = false;
        while (!aux) {
            System.out.print("Ingrese el tipo del nuevo esbirro (Ghoul, Humano o Demonio): ");
            String type = scanner.nextLine();
            aux = type.equalsIgnoreCase("ghoul") || (type.equalsIgnoreCase("humano")) || type.equalsIgnoreCase("demonio");

            switch (type) {
                case "humano" -> {
                    newMinion.setTipominion(TMinion.HUMAN);
                    Random rand = new Random();
                    Human human = (Human) newMinion;
                    TLoyalty[] loy = TLoyalty.values();
                    int randomIndex = rand.nextInt(loy.length);
                    human.setLoyalty(loy[randomIndex]);
                    m.add(human);
                }
                case "ghouls" -> {
                    newMinion.setTipominion(TMinion.GHOUL);
                    Random rand = new Random();
                    Ghoul ghoul = (Ghoul) newMinion;
                    int randomIndex = rand.nextInt(3) + 1;
                    ghoul.setDependency(randomIndex);
                    m.add(ghoul);
                }
                case "demon" -> {
                    newMinion.setTipominion(TMinion.DEMON);
                    Demon demon = (Demon) newMinion;
                    System.out.println("¿Cuál es el pacto?");
                    System.out.println("-->");
                    String pacto = scanner.next();
                    demon.setPact(pacto);// falta la lista de minions( no se si deberiamos hacerl
                    m.add(newMinion);
                    System.out.println("¿Quieres añadir un minion al demonio (S/N)");
                    System.out.println("-->");
                    String opt = scanner.next();
                    List<Minion> minList = new ArrayList<>();
                    while (opt.equalsIgnoreCase("S")) {
                        AddMinion addMinion = new AddMinion();
                        minList = addMinion.AddMinion(minList);
                        System.out.println("¿Quieres añadir otro minion al demonio (S/N)");
                        System.out.println("-->");
                        opt = scanner.next();
                    }
                    demon.setMinionList(minList);
                    demon.setPact(pacto);
                    m.add(demon);
                }
                default -> {
                    System.out.println("Tipo erróneo");
                }
            }

        }
        System.out.print("Esbirro añadido correctamente");
        return m;

    }
}
