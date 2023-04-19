import javax.lang.model.type.NullType;
import java.io.*;
import java.util.*;

public class DatabaseManager implements Serializable{
    private Map<String,Character> databaseC = new HashMap<>();//String = num register
    private Map<String,History> databaseH = new HashMap<>();//string = num register
    private Map<String,User> databaseU = new HashMap<>();// string = user name
    private Map<String,List<Challenge>> databaseP = new HashMap<>();// string = num register
    private Map<String,List<Armor>> databaseA = new HashMap<>();// string = Character name
    private Map<String,List<Weapon>> databaseW = new HashMap<>();//string = Character name
    private Map<String,List<Minion>> databaseM = new HashMap<>();//string = Character name
    private Map<String,List<Modifiers>> databaseMo = new HashMap<>();//string = Character name

    public void DatabaseManager(){

    }
    public Map<String,Character> obtainDatabaseC() throws IOException, ClassNotFoundException {

        File myFile = new File("Character.txt");
        Scanner scanner = new Scanner(myFile);
        String[] aux;
        while (scanner.hasNextLine()){
            String linea = scanner.nextLine();
            aux = linea.split(":");
            Character c = toCharacter(aux[1]);
            this.databaseC.put(aux[0], c);
        }
        return this.databaseC;
    }
    public Map<String,History> obtainDatabaseH() throws IOException, ClassNotFoundException {

        File myFile = new File("History.txt");
        Scanner scanner = new Scanner(myFile);
        String[] aux;
        while (scanner.hasNextLine()){
            String linea = scanner.nextLine();
            aux = linea.split(":");
            History h = toHistory(aux[1]);
            this.databaseH.put(aux[0], h);
        }
        return this.databaseH;
    }

    private History toHistory(String s){
        History h = new History();
        String[] aux = s.split(";" + "\n");
        int i = 0;
        while
        return h;
    }

    public Map<String,User> obtainDatabaseU() throws IOException, ClassNotFoundException {

        File myFile = new File("User.txt");
        Scanner scanner = new Scanner(myFile);
        String[] aux;
        while (scanner.hasNextLine()){
            String linea = scanner.nextLine();
            aux = linea.split(":");
            User u = toUser(aux[1]);
            this.databaseU.put(aux[0], u);
        }
        return this.databaseU;
    }

    private User toUser(String s){
        User u = new User();
        String[] aux = s.split(";");
        u.setName(aux[0]);
        u.setNick(aux[1]);
        u.setPassword(aux[2]);
        u.setUsertype(TUser.valueOf(aux[3]));
        return u;
    }

    public Map<String,List<Challenge>> obtainDatabaseP() throws IOException, ClassNotFoundException {

        File myFile = new File("Challenge.txt");
        Scanner scanner = new Scanner(myFile);
        String[] aux;
        while (scanner.hasNextLine()){
            String linea = scanner.nextLine();
            aux = linea.split(":");
            List<Challenge> c = toChallengeList(aux[1]);
            this.databaseP.put(aux[0], c);
        }
        return this.databaseP;
    }
    private List<Challenge> toChallengeList(String s){
        List<Challenge> l = new ArrayList<>();
        Challenge c = new Challenge();
        User u = new User();
        String[] aux = s.split(";");
        int i = 0;
        while (aux[i] != null){
            c.setGold(Integer.parseInt(aux[i]));
            i += 1;
            u = toUser(aux[i]);
            c.setDefiant(u);
            i += 1;
            u = toUser(aux[i]);
            c.setDefied(u);
            i += 1;
            c.setValid(Boolean.parseBoolean(aux[i]));
            i += 1;
            l.add(c);
        }
        return l;
    }
    public Map<String,List<Armor>> obtainDatabaseA() throws IOException, ClassNotFoundException {

        File myFile = new File("Armor.txt");
        Scanner scanner = new Scanner(myFile);
        String[] aux;
        while (scanner.hasNextLine()){
            String linea = scanner.nextLine();
            aux = linea.split(":");
            List<Armor> a = toArmorList(aux[1]);
            this.databaseA.put(aux[0], a);
        }
        return this.databaseA;
    }
    private List<Armor> toArmorList(String s){
        List<Armor> l = new ArrayList<>();
        Armor a = new Armor();
        String[] aux = s.split(";");
        int i = 0;
        while (aux[i] != null){
            a.setAttack(Integer.parseInt(aux[i]));
            i += 1;
            a.setDefense(Integer.parseInt(aux[i]));
            i += 1;
            a.setName(aux[i]);
            i += 1;
            a.setActive(Boolean.parseBoolean(aux[i]));
            i += 1;
            l.add(a);
        }
        return l;
    }
    public Map<String,List<Weapon>> obtainDatabaseW() throws IOException, ClassNotFoundException {

        File myFile = new File("Weapon.txt");
        Scanner scanner = new Scanner(myFile);
        String[] aux;
        while (scanner.hasNextLine()){
            String linea = scanner.nextLine();
            aux = linea.split(":");
            List<Weapon> w = toWeaponList(aux[1]);
            this.databaseW.put(aux[0], w);
        }
        return this.databaseW;
    }

    private List<Weapon> toWeaponList(String s){
        List<Weapon> l = new ArrayList<>();
        Weapon w = new Weapon();
        String[] aux = s.split(";");
        int i = 0;
        while (aux[i] != null){
            w.setAttack(Integer.parseInt(aux[i]));
            i += 1;
            w.setDefence(Integer.parseInt(aux[i]));
            i += 1;
            w.setName(aux[i]);
            i += 1;
            w.setHands(Integer.parseInt(aux[i]));
            i += 1;
            w.setActive(Boolean.parseBoolean(aux[i]));
            i += 1;
            l.add(w);
        }
        return l;
    }

    public Map<String,List<Minion>> obtainDatabaseM() throws IOException, ClassNotFoundException {

        File myFile = new File("Minion.txt");
        Scanner scanner = new Scanner(myFile);
        String[] aux;
        while (scanner.hasNextLine()){
            String linea = scanner.nextLine();
            aux = linea.split(":");
            List<Minion>  m = toMinionList(aux[1]);
            this.databaseM.put(aux[0], m);
        }
        return this.databaseM;
    }

    private List<Minion> toMinionList(String s){
        List<Minion> l = new ArrayList<>();
        Minion m = new Minion();
        String[] aux = s.split(";");
        int i = 0;
        while (aux[i] != null){
            m.setName(aux[i]);
            i += 1;
            m.setHitPoints(Integer.parseInt(aux[i]));
            i += 1;
            m.setDescription(aux[i]);
            i += 1;
            if (aux[i] == "Ghoul"){
                i += 1;
                ((Ghoul) m).setDependency(Integer.parseInt(aux[i]));
            } else if (aux[i] == "Human") {
                i += 1;
                ((Human) m).setLoyalty(TLoyalty.valueOf(aux[i]));
            }else{
                i += 1;
                ((Demon) m).setPact(aux[i]);
                i += 1;
                int id = aux[i].indexOf("(");
                int id2 = s.indexOf(")", id);
                String aux1 = s.substring(id,id2);
                ((Demon) m).setMinionList(toMinionList(aux1));
            }
            i += 1;
            l.add(m);
        }
        return l;
    }


    public Map<String,List<Modifiers>> obtainDatabaseMo() throws IOException, ClassNotFoundException {

        File myFile = new File("Modifiers.txt");
        Scanner scanner = new Scanner(myFile);
        String[] aux;
        while (scanner.hasNextLine()){
            String linea = scanner.nextLine();
            aux = linea.split(":");
            List<Modifiers>  m = toModifiersList(aux[1]);
            this.databaseMo.put(aux[0], m);
        }
        return this.databaseMo;
    }

    private List<Modifiers> toModifiersList(String s){
        List<Modifiers> l = new ArrayList<>();
        Modifiers m = new Modifiers();
        String[] aux = s.split(";");
        int i = 0;
        while (aux[i] != null){
            m.setName(aux[i]);
            i += 1;
            m.setValue(Integer.parseInt(aux[i]));
            i += 1;
            m.setBuff(Boolean.parseBoolean(aux[i]));
            i += 1;
            l.add(m);
        }
        return l;
    }

    private Character toCharacter(String s) throws IOException, ClassNotFoundException {
        Character c = new Character();
        String[] aux = s.split(";");
        c.setName(aux[0]);
        c.setDescription(aux[1]);
        c.setType(aux[2]);
        Map<String,List<Weapon>> arm = obtainDatabaseW();
        List<Weapon> w = arm.get(aux[0]);
        c.setWeaponSet(w);
        Map<String,List<Armor>> armor = obtainDatabaseA();
        List<Armor> a = armor.get(aux[0]);
        c.setArmorSet(a);
        int ind = Integer.parseInt(aux[3]);
        c.sethP(ind);
        ind = Integer.parseInt(aux[4]);
        c.setPower(ind);
        Map<String,List<Minion>> mini = obtainDatabaseM();
        List<Minion> m = mini.get(aux[0]);
        c.setMinionMap(m);
        Ability ab = new Ability();
        ab.setType(c.getType());
        ab.setAttack(Integer.parseInt(aux[5]));
        ab.setDefense(Integer.parseInt(aux[6]));
        c.setSpecialAbility(ab);
        ind = Integer.parseInt(aux[7]);
        c.setGoldValue(ind);
        Map<String,List<Modifiers>> modi = obtainDatabaseMo();
        List<Modifiers> mo = modi.get(aux[0]);
        c.setModifierList(mo);
        ind = Integer.parseInt(aux[8]);
        c.setWins(ind);
        ind = Integer.parseInt(aux[9]);
        c.setTypeAttack(ind);
        c.setFighting(Boolean.parseBoolean(aux[10]));
        return c;
    }

    public void saveDatabaseC(Map<String,Character> map) throws IOException {
        ByteArrayOutputStream bs= new ByteArrayOutputStream();
        ObjectOutputStream os = new ObjectOutputStream (bs);
        os.writeObject(unObjetoSerializable);  // this es de tipo DatoUdp
        os.close();
        byte[] bytes =  bs.toByteArray(); // devuelve byte[]

    }

}


//steven es gitano
// SISISIISISISSISISIS