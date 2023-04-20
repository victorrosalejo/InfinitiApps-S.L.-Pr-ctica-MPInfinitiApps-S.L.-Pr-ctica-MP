public class User {

    private  String name;
    private  String nick;
    private  String password;
    private TUser usertype;
    private  String registerNumber;

    public String getName() {return name;}

    public void setName(String name) {this.name = name;}

    public String getNick() {return nick;}

    public void setNick(String nick) {this.nick = nick;}

    public String getPassword() {return password;}

    public void setPassword(String password) {this.password = password;}

    public TUser getUsertype() {
        return usertype;
    }

    public void setUsertype(TUser usertype) {
        this.usertype = usertype;
    }

    public String getRegisterNumber() {
        return registerNumber;
    }

    public void setRegisterNumber(String registerNumber) {
        this.registerNumber = registerNumber;
    }
}
