import java.io.*;
import java.util.*;


public class DatabaseManager implements Serializable{

    public Map<String,Character> obtainDatabaseC() {
        File file = new File("Character.bin");
        if (!file.exists()) {
            try {
                file.createNewFile();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
        try {
            FileInputStream fis = new FileInputStream(file);
            ObjectInputStream ois = new ObjectInputStream(fis);
            Map<String,Character> m = (Map<String,Character>) ois.readObject();
            ois.close();
            fis.close();
            return m;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    public Map<String,History> obtainDatabaseH() {
        File file = new File("History.bin");
        if (!file.exists()) {
            try {
                file.createNewFile();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
        try {
            FileInputStream fis = new FileInputStream(file);
            ObjectInputStream ois = new ObjectInputStream(fis);
            Map<String,History> m = (Map<String,History>) ois.readObject();
            ois.close();
            fis.close();
            return m;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }



    public Map<String, User> obtainDatabaseU() {
        File file = new File("User.bin");
        if (!file.exists()) {
            try {
                file.createNewFile();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
        try {
            FileInputStream fis = new FileInputStream(file);
            ObjectInputStream ois = new ObjectInputStream(fis);
            Map<String, User> m = (Map<String, User>) ois.readObject();
            ois.close();
            fis.close();
            return m;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
    public Map<String,List<Challenge>> obtainDatabaseP() {
        File file = new File("Challenge.bin");
        if (!file.exists()) {
            try {
                file.createNewFile();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
        try {
            FileInputStream fis = new FileInputStream(file);
            ObjectInputStream ois = new ObjectInputStream(fis);
            Map<String,List<Challenge>> m = (Map<String,List<Challenge>>) ois.readObject();
            ois.close();
            fis.close();
            return m;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    public Map<String,List<Armor>> obtainDatabaseA() {
        File file = new File("Armor.bin");
        if (!file.exists()) {
            try {
                file.createNewFile();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
        try {
            FileInputStream fis = new FileInputStream(file);
            ObjectInputStream ois = new ObjectInputStream(fis);
            Map<String,List<Armor>> m = (Map<String,List<Armor>>) ois.readObject();
            ois.close();
            fis.close();
            return m;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
    public Map<String,List<Weapon>> obtainDatabaseW() {
        File file = new File("Weapon.bin");
        if (!file.exists()) {
            try {
                file.createNewFile();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
        try {
            FileInputStream fis = new FileInputStream(file);
            ObjectInputStream ois = new ObjectInputStream(fis);
            Map<String,List<Weapon>> m = (Map<String,List<Weapon>>) ois.readObject();
            ois.close();
            fis.close();
            return m;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
    public Map<String,List<Minion>> obtainDatabaseM() {
        File file = new File("Minion.bin");
        if (!file.exists()) {
            try {
                file.createNewFile();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
        try {
            FileInputStream fis = new FileInputStream(file);
            ObjectInputStream ois = new ObjectInputStream(fis);
            Map<String,List<Minion>> m = (Map<String,List<Minion>>) ois.readObject();
            ois.close();
            fis.close();
            return m;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
    public Map<String,List<Modifiers>> obtainDatabaseMo() {
        File file = new File("Modifier.bin");
        if (!file.exists()) {
            try {
                file.createNewFile();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
        try {
            FileInputStream fis = new FileInputStream(file);
            ObjectInputStream ois = new ObjectInputStream(fis);
            Map<String,List<Modifiers>> m = (Map<String,List<Modifiers>>) ois.readObject();
            ois.close();
            fis.close();
            return m;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
    public void saveDatabaseC(Map<String,Character> m ) {
        File file = new File("Character.bin");
        if (!file.exists()) {
            try {
                file.createNewFile();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
        try {
            FileOutputStream fos = new FileOutputStream(file);
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(m);
            oos.close();
            fos.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void saveDatabaseH(Map<String,History> m ){
        File file = new File("History.bin");
        if (!file.exists()) {
            try {
                file.createNewFile();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
        try {
            FileOutputStream fos = new FileOutputStream(file);
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(m);
            oos.close();
            fos.close();


        } catch (Exception e) {


            e.printStackTrace();
            History historial = new History();
            m.put("C59DA", historial );

        }
    }
    public void saveDatabaseU(Map<String, User> m ) {
        File file = new File("User.bin");
        if (!file.exists()) {
            try {
                file.createNewFile();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
        try {
            FileOutputStream fos = new FileOutputStream(file);
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(m);
            oos.close();
            fos.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public void saveDatabaseP(Map<String,List<Challenge>> m ) {
        File file = new File("Challenge.bin");
        if (!file.exists()) {
            try {
                file.createNewFile();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
        try {
            FileOutputStream fos = new FileOutputStream(file);
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(m);
            oos.close();
            fos.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public void saveDatabaseA(Map<String,List<Armor>> m ) {
        File file = new File("Armor.bin");
        if (!file.exists()) {
            try {
                file.createNewFile();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
        try {
            FileOutputStream fos = new FileOutputStream(file);
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(m);
            oos.close();
            fos.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public void saveDatabaseW(Map<String,List<Weapon>> m ) {
        File file = new File("Weapon.bin");
        if (!file.exists()) {
            try {
                file.createNewFile();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
        try {
            FileOutputStream fos = new FileOutputStream(file);
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(m);
            oos.close();
            fos.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public void saveDatabaseM(Map<String,List<Minion>> m ) {
        File file = new File("Minion.bin");
        if (!file.exists()) {
            try {
                file.createNewFile();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
        try {
            FileOutputStream fos = new FileOutputStream(file);
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(m);
            oos.close();
            fos.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public void saveDatabaseMo(Map<String,List<Modifiers>> m ) {
        File file = new File("Modifier.bin");
        if (!file.exists()) {
            try {
                file.createNewFile();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
        try {
            FileOutputStream fos = new FileOutputStream(file);
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(m);
            oos.close();
            fos.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
