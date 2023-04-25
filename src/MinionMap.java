
import java.util.*;

public class MinionMap {
    public Character MinionMap(Character c) {
        for (int i = 0; i < c.getMinionMap().size(); i++) {
            Minion minion = c.getMinionMap().get(i);
            System.out.println("----------------[Conjunto de minions]-----------------");
            System.out.println("----------------------------------------------------");
            System.out.println("----------------[ " + (i + 1) + " ]-----------------");
            System.out.println((i + 1) + ". " + minion.getName());
            System.out.println(("Puntos de vida") + " - " + minion.getHitPoints());
            System.out.println(("Tipo de Minion") + " - " + minion.getTipominion());
        }
        Scanner scanner = new Scanner(System.in);
        System.out.print("Seleccione el número de minion que desea modificar (Introduzca '0' para regresar al menu): ");
        int minionIndex = scanner.nextInt() - 1;
        if (minionIndex == -1) {
            return c;
        } else if (c.getMinionMap().remove(minionIndex) != null) {
            Minion minion = c.getMinionMap().remove(minionIndex);
            System.out.println("Modificando minon: " + minion.getName());
            System.out.println("Seleccione la característica que desea modificar: ");
            System.out.println("1. Nombre");
            System.out.println("2. Puntos de vida");
            System.out.println("3. Tipo de Minion");
            int option = scanner.nextInt();
            List<Minion> minionMap = c.getMinionMap();
            switch (option) {
                case 1 -> {
                    System.out.print("Ingrese el nuevo nombre: ");
                    scanner.nextLine();
                    String newName = scanner.nextLine();
                    minion.setName(newName);
                    minionMap.set(minionIndex - 1, minion);
                    c.setMinionMap(minionMap);
                }
                case 2 -> {
                    int hp = 0;
                    while (hp < 1 || hp > 3) {
                        System.out.print("Ingrese el nuevo valor de puntos de vida (entre 1 y 3): ");
                        hp = scanner.nextInt();
                        minionMap.set(minionIndex - 1, minion);
                        c.setMinionMap(minionMap);
                    }
                    minion.setHitPoints(hp);
                }
                case 3 -> {
                    System.out.println("El tipo actual de minion es" + minion.getTipominion());
                    System.out.print("\n");
                    System.out.println("       -- Seleccione un tipo --");
                    System.out.println("-> Humano");
                    System.out.println("-> Ghoul");
                    System.out.println("-> Demonio");
                    System.out.println("-->");
                    String nuevoTipo = scanner.next();
                    if (nuevoTipo.equalsIgnoreCase("humano") || nuevoTipo.equalsIgnoreCase("ghoul") || nuevoTipo.equalsIgnoreCase("demonio")) {
                        if (nuevoTipo.equals("humanos")) {
                            minion.setTipominion(TMinion.HUMAN);
                            Random rand = new Random();
                            Human human = (Human) minion;
                            TLoyalty[] loy = TLoyalty.values();
                            int randomIndex = rand.nextInt(loy.length);
                            human.setLoyalty(loy[randomIndex]);

                            minionMap.set(minionIndex - 1, human);
                            c.setMinionMap(minionMap);
                        } else if (nuevoTipo.equals("ghouls")) {
                            minion.setTipominion(TMinion.GHOUL);
                            Random rand = new Random();
                            Ghoul ghoul = (Ghoul) minion;
                            int randomIndex = rand.nextInt(3) + 1;
                            ghoul.setDependency(randomIndex);

                            minionMap.set(minionIndex - 1, ghoul);
                            c.setMinionMap(minionMap);
                        } else {
                            minion.setTipominion(TMinion.DEMON);
                            Demon demon = (Demon) minion;
                            System.out.println("¿Cuál es el pacto?");
                            System.out.println("-->");
                            String pacto = scanner.next();
                            demon.setPact(pacto);// falta la lista de minions( no se si deberiamos hacerl
                            minionMap.set(minionIndex - 1, demon);
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
                            demon.setPact(pacto);// falta la lista de minions( no se si deberiamos hacerl
                            minionMap.set(minionIndex - 1, demon);
                            c.setMinionMap(minionMap);
                        }
                    }
                }
                default -> System.out.println("Opción inválida. Intente nuevamente.");
            }

            if (option == 1 || option == 2 || option == 3 || option == 4) {
                System.out.println("Característica modificada correctamente.");
            }
            return c;
        }
        System.out.println("Esbirro no encontrado");
        return c;
    }
}
