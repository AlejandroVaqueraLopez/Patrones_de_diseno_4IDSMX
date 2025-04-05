public class Main {
        public static void main(String[] args) {
            System.out.println("metodo prototype");
            Bala c = new Bala("Mediana", 19);
            Bala c2 = new Bala(c.getTamano(), 3);

            System.out.println("1. " + c.toString());
            System.out.println("2. " + c2.toString());


            //usign prototype clone method
            Bala c3 = c.clone();
            System.out.println("3. " + c3.toString() + " using prototype clone method");

        }
}