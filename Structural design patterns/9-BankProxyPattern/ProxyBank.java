public class ProxyBank implements ServiceBank {
    private Bank bancor;

    public  ProxyBank(){
    this.bancor = new Bank();
    }

    @Override
    public void serviceOp(String user, String role){
       if("admin".equals(role)){
           bancor.serviceOp(user,role);
       }
       else {
           System.out.println("Denied Access for " +user);
           System.out.println("Admin role required.\n");
       }
    }
}
