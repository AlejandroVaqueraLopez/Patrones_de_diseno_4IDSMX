import java.util.Scanner;//lib to read any string on console

public class Main {
    public static void main(String[] args) {
        //factory
        System.out.println("Figures: ");
        //Pizza c = new Pizza();
        Factory f = new Factory();

        //scanner
        Scanner s = new Scanner(System.in);//we have 3 types of streams input, output, error
        //Scanner.err.println("error");
        System.out.println("Insert opc: (a,b,c,d,e)");
        String value = s.nextLine();//to read strings
        // String nums = s.nextInt();//to read numbers

        Figure test = f.getInstance(value);
        //Comida test = f.getInstance("b");
        test.show();
    }
}
