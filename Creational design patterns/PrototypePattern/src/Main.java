public class Main {
    public static void main(String[] args) {
        System.out.println("metodo prototype");
        Carro c = new Carro("Ford fiest", 4, 50.5F);
        Carro c2 = new Carro(c.getNombre(), 4,5.2F);

        System.out.println("1. " + c.toString());
        System.out.println("2. " + c2.toString());


        //usign prototype clone method
        Carro c3 = c.clone();
        System.out.println("3. " + c3.toString() + " using prototype clone method");

    }
}