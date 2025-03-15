import java.util.Scanner;//lib to read any string on console

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello, World!");

        Singleton r = Singleton.getInstance();
        //scanner
        Scanner s = new Scanner(System.in);//we have 3 types of streams input, output, error

        System.out.println("Insert new account: ");
        String newAccount = s.nextLine();//to read strings
        r.setAccount(newAccount);

        System.out.println("Insert new password: ");
        String newPassword = s.nextLine();//to read strings
        r.setPass(newPassword);

        System.out.printf("Account created! => %s\n",r.getAccount());
        System.out.printf("Account created! => %s\n",r.getPassword());
    }
}
