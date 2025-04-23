public class Bank implements ServiceBank {
    @Override
    public void serviceOp(String user, String role){
        System.out.println("Operation incoming...");
        System.out.println("\nOperation successfuly done by: " + user +"\n");
    }
}
