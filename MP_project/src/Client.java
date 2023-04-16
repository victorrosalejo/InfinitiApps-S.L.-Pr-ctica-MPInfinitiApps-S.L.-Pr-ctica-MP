import java.util.*;

public class Client extends User{

    private String registerNumber;
    private boolean ban;
    private List<Combat> result = new ArrayList<>();

    public String getRegisterNumber() {return registerNumber;}

    public void setRegisterNumber(String registerNumber) {this.registerNumber = registerNumber;}

    public boolean isBan() {return ban;}

    public void setBan(boolean ban) {this.ban = ban;}

    public List<Combat> getResult() {return result;}

    public void setResult(List<Combat> result) {this.result = result;}
}
