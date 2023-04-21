import java.io.*;
import java.util.*;


public class DatabaseManager implements Serializable{
    private Map<String,Character> databaseC = new HashMap<>();//String = num register
    private Map<String,History> databaseH = new HashMap<>();//string = num register
    private Map<String, User> databaseU = new HashMap<>();// string = user name
    private Map<String,List<Challenge>> databaseP = new HashMap<>();// string = num register
    private Map<String,List<Armor>> databaseA = new HashMap<>();// string = Character name
    private Map<String,List<Weapon>> databaseW = new HashMap<>();//string = Character name
    private Map<String,List<Minion>> databaseM = new HashMap<>();//string = Character name
    private Map<String,List<Modifiers>> databaseMo = new HashMap<>();//string = Character name

    public void DatabaseManager(){

    }
    public Map<String,Character> obtainDatabaseC() {
        try {
            FileInputStream fis = new FileInputStream("Character.bin");
            ObjectInputStream ois = new ObjectInputStream(fis);
            Map<String,Character> m = (Map<String,Character>) ois.readObject();
            ois.close();
            fis.close();
            System.out.println("Estructura leída del archivo binario con éxito.");
            return m;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    public Map<String,History> obtainDatabaseH() {
        try {
            FileInputStream fis = new FileInputStream("History.bin");
            ObjectInputStream ois = new ObjectInputStream(fis);
            Map<String,History> m = (Map<String,History>) ois.readObject();
            ois.close();
            fis.close();
            System.out.println("Estructura leída del archivo binario con éxito.");
            return m;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }



    public Map<String, User> obtainDatabaseU() {
        try {
            FileInputStream fis = new FileInputStream("User.bin");
            ObjectInputStream ois = new ObjectInputStream(fis);
            Map<String, User> m = (Map<String, User>) ois.readObject();
            ois.close();
            fis.close();
            System.out.println("Estructura leída del archivo binario con éxito.");
            return m;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
    public Map<String,List<Challenge>> obtainDatabaseP() {
        try {
            FileInputStream fis = new FileInputStream("Challenge.bin");
            ObjectInputStream ois = new ObjectInputStream(fis);
            Map<String,List<Challenge>> m = (Map<String,List<Challenge>>) ois.readObject();
            ois.close();
            fis.close();
            System.out.println("Estructura leída del archivo binario con éxito.");
            return m;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    public Map<String,List<Armor>> obtainDatabaseA() {
        try {
            FileInputStream fis = new FileInputStream("Armor.bin");
            ObjectInputStream ois = new ObjectInputStream(fis);
            Map<String,List<Armor>> m = (Map<String,List<Armor>>) ois.readObject();
            ois.close();
            fis.close();
            System.out.println("Estructura leída del archivo binario con éxito.");
            return m;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
    public Map<String,List<Weapon>> obtainDatabaseW() {
        try {
            FileInputStream fis = new FileInputStream("Weapon.bin");
            ObjectInputStream ois = new ObjectInputStream(fis);
            Map<String,List<Weapon>> m = (Map<String,List<Weapon>>) ois.readObject();
            ois.close();
            fis.close();
            System.out.println("Estructura leída del archivo binario con éxito.");
            return m;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
    public Map<String,List<Minion>> obtainDatabaseM() {
        try {
            FileInputStream fis = new FileInputStream("Minion.bin");
            ObjectInputStream ois = new ObjectInputStream(fis);
            Map<String,List<Minion>> m = (Map<String,List<Minion>>) ois.readObject();
            ois.close();
            fis.close();
            System.out.println("Estructura leída del archivo binario con éxito.");
            return m;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
    public Map<String,List<Modifiers>> obtainDatabaseMo() {
        try {
            FileInputStream fis = new FileInputStream("Modifier.bin");
            ObjectInputStream ois = new ObjectInputStream(fis);
            Map<String,List<Modifiers>> m = (Map<String,List<Modifiers>>) ois.readObject();
            ois.close();
            fis.close();
            System.out.println("Estructura leída del archivo binario con éxito.");
            return m;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
    public void saveDatabaseC(Map<String,Character> m ) {
        try {
            FileOutputStream fos = new FileOutputStream("Character.bin");
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(m);
            oos.close();
            fos.close();
            System.out.println("Estructura escrita en el archivo binario con éxito.");
        } catch (IOException e) {
            FileOutputStream fos;
            try {
                fos = new FileOutputStream("Character.bin");
                try {
                    fos.close();
                } catch (IOException ex) {
                    throw new RuntimeException(ex);
                }
                saveDatabaseC(m);
            } catch (FileNotFoundException ex) {
                throw new RuntimeException(ex);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void saveDatabaseH(Map<String,History> m ){
        try {
            FileOutputStream fos = new FileOutputStream("History.bin");
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(m);
            oos.close();
            fos.close();
            System.out.println("Estructura escrita en el archivo binario con éxito.");
        } catch (IOException e) {
            FileOutputStream fos;
            try {
                fos = new FileOutputStream("History.bin");
                try {
                    fos.close();
                } catch (IOException ex) {
                    throw new RuntimeException(ex);
                }
                saveDatabaseH(m);
            } catch (FileNotFoundException ex) {
                throw new RuntimeException(ex);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public void saveDatabaseU(Map<String, User> m ) {
        try {
            FileOutputStream fos = new FileOutputStream("User.bin");
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(m);
            oos.close();
            fos.close();
            System.out.println("Estructura escrita en el archivo binario con éxito.");
        } catch (IOException e) {
            FileOutputStream fos;
            try {
                fos = new FileOutputStream("User.bin");
                try {
                    fos.close();
                } catch (IOException ex) {
                    throw new RuntimeException(ex);
                }
                saveDatabaseU(m);
            } catch (FileNotFoundException ex) {
                throw new RuntimeException(ex);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public void saveDatabaseP(Map<String,List<Challenge>> m ) {
        try {
            FileOutputStream fos = new FileOutputStream("Challenge.bin");
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(m);
            oos.close();
            fos.close();
            System.out.println("Estructura escrita en el archivo binario con éxito.");
        } catch (IOException e) {
            FileOutputStream fos;
            try {
                fos = new FileOutputStream("Challenge.bin");
                try {
                    fos.close();
                } catch (IOException ex) {
                    throw new RuntimeException(ex);
                }
                saveDatabaseP(m);
            } catch (FileNotFoundException ex) {
                throw new RuntimeException(ex);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public void saveDatabaseA(Map<String,List<Armor>> m ) {
        try {
            FileOutputStream fos = new FileOutputStream("Armor.bin");
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(m);
            oos.close();
            fos.close();
            System.out.println("Estructura escrita en el archivo binario con éxito.");
        } catch (IOException e) {
            FileOutputStream fos;
            try {
                fos = new FileOutputStream("Armor.bin");
                try {
                    fos.close();
                } catch (IOException ex) {
                    throw new RuntimeException(ex);
                }
                saveDatabaseA(m);
            } catch (FileNotFoundException ex) {
                throw new RuntimeException(ex);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public void saveDatabaseW(Map<String,List<Weapon>> m ) {  // cambie weapon a lista de weapons
        try {
            FileOutputStream fos = new FileOutputStream("Weapon.bin");
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(m);
            oos.close();
            fos.close();
            System.out.println("Estructura escrita en el archivo binario con éxito.");
        } catch (IOException e) {
            FileOutputStream fos;
            try {
                fos = new FileOutputStream("Weapon.bin");
                try {
                    fos.close();
                } catch (IOException ex) {
                    throw new RuntimeException(ex);
                }
                saveDatabaseW(m);
            } catch (FileNotFoundException ex) {
                throw new RuntimeException(ex);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public void saveDatabaseM(Map<String,List<Minion>> m ) {
        try {
            FileOutputStream fos = new FileOutputStream("Minion.bin");
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(m);
            oos.close();
            fos.close();
            System.out.println("Estructura escrita en el archivo binario con éxito.");
        } catch (IOException e) {
            FileOutputStream fos;
            try {
                fos = new FileOutputStream("Minion.bin");
                try {
                    fos.close();
                } catch (IOException ex) {
                    throw new RuntimeException(ex);
                }
                saveDatabaseM(m);
            } catch (FileNotFoundException ex) {
                throw new RuntimeException(ex);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public void saveDatabaseMo(Map<String,List<Modifiers>> m ) {
        try {
            FileOutputStream fos = new FileOutputStream("Modifier.bin");
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(m);
            oos.close();
            fos.close();
            System.out.println("Estructura escrita en el archivo binario con éxito.");
        } catch (IOException e) {
            FileOutputStream fos;
            try {
                fos = new FileOutputStream("Modifier.bin");
                try {
                    fos.close();
                } catch (IOException ex) {
                    throw new RuntimeException(ex);
                }
                saveDatabaseMo(m);
            } catch (FileNotFoundException ex) {
                throw new RuntimeException(ex);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
