import java.util.Scanner;//lib to read any string on console

public class Main {
    public static void main(String[] args) {
        //factory
        System.out.println("Creacion de objetos");
        //Pizza c = new Pizza();
        Factory f = new Factory();



        //scanner
        Scanner s = new Scanner(System.in);//we have 3 types of streams input, output, error
        //Scanner.err.println("error");
        System.out.println("Ingrese una opcion: (a,b,c)");
        String valor = s.nextLine();//to read strings
       // String nums = s.nextInt();//to read numbers



        Comida test = f.getInstance(valor);
        //Comida test = f.getInstance("b");
        test.mostrar();
    }
}