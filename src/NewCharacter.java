import java.util.*;

public class NewCharacter {
    private Map<String,Character> databaseC = new HashMap<>();
    private Map<String,List<Armor>> databaseA = new HashMap<>();// string = Character name
    private Map<String,List<Weapon>> databaseW = new HashMap<>();//string = Character name
    private Map<String,List<Minion>> databaseM = new HashMap<>();//string = Character name
    private Map<String,List<Modifiers>> databaseMo = new HashMap<>();//string = Character name
    private DatabaseManager databaseManager;


    public Character NewCharacter(User u){
        Scanner input = new Scanner(System.in);
        Character nuevoChar = new Character();
        String nombre, desc;
        int tiponuevo;

        System.out.println("========== Menu de Creacion de personaje ==========");

        System.out.println("1. Introduce tu nombre de personaje");
        nombre = input.nextLine();
        nuevoChar.setName(nombre);
        System.out.println("2. Elije tu raza:");

        System.out.println("1: Cazador");
        System.out.println("2: Licantropo");
        System.out.println("3: Vampiro");

        tiponuevo = input.nextInt();

        Random rand = new Random();
        boolean isVamp = false;

        switch (tiponuevo) {
            case 1:
                nuevoChar.setType("Vampiro");
                nuevoChar.setAge(rand.nextInt(20, 101));
                isVamp = true;
                break;
            case 2:
                nuevoChar.setType("Licántropo");

                break;
            case 3:
                nuevoChar.setType("Cazador");

                break;
            default:
                System.out.println("Ese número es erróneo");
                break;
        }

        System.out.println("3. Introduce la historia de tu personaje");
        desc = input.nextLine();
        nuevoChar.setDescription(desc);




        nuevoChar.setGoldValue(300);
        nuevoChar.sethP(5);
        nuevoChar.setPower(rand.nextInt(0,5));
        nuevoChar.setWins(0);
        //Armas y aramduras
        nuevoChar.setWeaponSet(newWeapon());
        nuevoChar.setArmorSet(newArmor());
        nuevoChar.setFighting(false);

        //Minions

        nuevoChar.setMinionMap(newMinions(isVamp));


        // nueva habilidad
        Ability ab = new Ability();
        ab.setType(nuevoChar.getType());
        ab.setAttack(rand.nextInt(1,4));
        ab.setDefense(rand.nextInt(1,4));
        nuevoChar.setSpecialAbility(ab);

        // mod
        nuevoChar.setModifierList(newModifiers());







        return nuevoChar;
    }


    private List<Weapon> newWeapon () {
        Weapon nuevoWeapon = new Weapon();
        Random randInt = new Random();
        List<Weapon> listaweapons = new ArrayList<>();
        String nombre;
        String[] nombresArmas = {"Espada", "Hacha", "Martillo", "Lanza", "Arco", "Ballesta", "Pistola", "Rifle", "Cuchillo", "Garra"};
        for (int a = 0 ; a < 3; a++) {
            nombre = nombresArmas[(randInt.nextInt(0, 10))];
            nuevoWeapon.setAttack(randInt.nextInt(1, 4));
            nuevoWeapon.setDefence(randInt.nextInt(0, 3));
            nuevoWeapon.setName(nombre);
            nuevoWeapon.setHands(randInt.nextInt(1, 3));
            nuevoWeapon.setActive(false);
            listaweapons.add(nuevoWeapon);

        }
        return listaweapons;
    }

    private List<Armor> newArmor () {
        Armor nuevoAr = new Armor();
        Random randInt = new Random();
        List<Armor> listaAr = new ArrayList<>();
        String nombre;
        String[] nombresAr = {"Armadura de placas", "Armadura de malla", "Armadura de cuero", "Armadura de escamas", "Armadura de cota de malla con capucha", "Armadura de brigandina", "Armadura de bandido", "Armadura de anillas", "Armadura de anillas", "Armadura de la Orden Sagrada"};
        for (int a = 0 ; a < 3; a++) {
            nombre = nombresAr[(randInt.nextInt(0, 10))];
            nuevoAr.setAttack(randInt.nextInt(1, 4));
            nuevoAr.setDefense(randInt.nextInt(0, 3));
            nuevoAr.setName(nombre);
            nuevoAr.setActive(false);
            listaAr.add(nuevoAr);

        }
        return listaAr;
    }


    private List<Minion> newMinions(boolean vamp){
        Minion minion = new Minion();
        List<Minion> minionList= new ArrayList<>();
        Random randInt = new Random();
        String nombre ;
        TMinion tipo = null;


        String[] nombresNombres = {"Kaneki", "Nishiki", "Touka", "Shuu", "Hinami", "McMenú"};
        ArrayList<TMinion> nombresTm = new ArrayList<>();
        nombresTm.add(tipo.GHOUL);
        nombresTm.add(tipo.HUMAN);
        nombresTm.add(tipo.DEMON);

        for (int a = 0 ; a < 3; a++) {
            nombre = nombresNombres[(randInt.nextInt(0, 6))];

            minion.setName(nombre);
            minion.setDescription("Un nuevo minion listo para pelear");
            minion.setHitPoints(randInt.nextInt(1, 4));

            minion.setTipominion(nombresTm.get((randInt.nextInt(0, 3))));
            if (minion.getTipominion() == tipo.DEMON) {
                Demon demon = (Demon) minion;
                List<Minion> nuevalista = new ArrayList<>();
                demon.setPact("Este es un demonio peculiar, su madre se llama (Nihao ZhongWhuo wo Bing chilling)");
                for (int b = 0; b < 3; b++) {

                    Minion nuevominion = new Minion();

                    nuevominion.setName(nombre);
                    nuevominion.setDescription("Un nuevo minion listo para pelear");
                    nuevominion.setHitPoints(randInt.nextInt(1, 4));
                    nuevalista.add(nuevominion);


                    demon.setMinionList(nuevalista);


                }
                minionList.add(demon);
            }
            else if(minion.getTipominion() == tipo.GHOUL) {
                Ghoul ghoul = (Ghoul) minion;
                ghoul.setDependency(randInt.nextInt(1,6));

                minionList.add(ghoul);
            }
            else if (minion.getTipominion() == tipo.HUMAN && vamp == false) {

                Human human = (Human) minion;
                TLoyalty[] loy = TLoyalty.values();
                int randomIndex = randInt.nextInt(loy.length);
                human.setLoyalty(loy[randomIndex]);

                minionList.add(human);
            }

        }

        return minionList;

    }
        //modificar 1-5 dos tipos f o d
    private List<Modifiers> newModifiers(){
        List<Modifiers> nuevalista = new ArrayList<>();
        Modifiers nuevoMod = new Modifiers();
        Random rand = new Random();
        int nuevobuff ;
        String nombre;
        String[] nombresBuffos = {"Potencia Arcana", "Agilidad Divina", "Tenacidad Colosal", "Fuerza del Dragón", "Percepción Celestial", "Vitalidad Mágica"};

        for (int a = 0 ; a < 3; a++) {

            nombre = nombresBuffos[rand.nextInt(0,6)];
            nuevoMod.setName(nombre);
            nuevoMod.setActive(false);
            nuevoMod.setValue(rand.nextInt(1, 6));
            nuevobuff = rand.nextInt(0, 2);
                if (nuevobuff == 0) {
                    nuevoMod.setBuff(false);
                }
                else {
                    nuevoMod.setBuff(true);

                }
            nuevalista.add(nuevoMod);

        }



        return nuevalista;
    }

    public Map<String, Character> getDatabaseC() {
        return databaseC;
    }

    public void setDatabaseC(Map<String, Character> databaseC) {
        this.databaseC = databaseC;
    }

    public DatabaseManager getDatabaseManager() {
        return databaseManager;
    }

    public void setDatabaseManager(DatabaseManager databaseManager) {
        this.databaseManager = databaseManager;
    }
}
