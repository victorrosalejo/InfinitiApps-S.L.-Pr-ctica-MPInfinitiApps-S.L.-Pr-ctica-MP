import java.io.*;
import java.util.HashMap;
import java.util.Map;

public class DatabaseManager implements Serializable{
    private Map<String,Character> databaseC = new HashMap<>();//String = num register
    private Map<String,History> databaseH = new HashMap<>();//string = num register
    private Map<String,User> databaseU = new HashMap<>();// string = user name
    private Map<String,Challenge> databaseP = new HashMap<>();// string = num register
    private Map<String,Armor> databaseA = new HashMap<>();// string = AHHHH
    private Map<String,Weapon> databaseW = new HashMap<>();//string = AHHHHHH

    public void DatabaseManager(){

    }
    public Map<String,Object> obtainDatabase(Map<String, Object> map,int n){

        ByteArrayInputStream bs= new ByteArrayInputStream(bytes); // bytes es el byte[]
        ObjectInputStream is = new ObjectInputStream(bs);
        ClaseSerializable unObjetoSerializable = (ClaseSerializable)is.readObject();
        is.close();
    }

    public void saveDatabase(Map<String,Object> map, int n){
        ByteArrayOutputStream bs= new ByteArrayOutputStream();
        ObjectOutputStream os = new ObjectOutputStream (bs);
        os.writeObject(unObjetoSerializable);  // this es de tipo DatoUdp
        os.close();
        byte[] bytes =  bs.toByteArray(); // devuelve byte[]

    }

}
