public class Singleton {
    private static Singleton instance;
    private static String account;
    private static String password;

    private Singleton(){}

    public static Singleton getInstance(){
        if(instance == null){
            return new Singleton();
        }
        return instance;
    }

    public String getAccount(){
        return account;
    }

    public String getPassword(){
        return password;
    }

    public void setAccount(String account){
        this.account = account;
    }

    public void setPass(String password){
        this.password = password;
    }

}

