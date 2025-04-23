public class Main {

    private itPizza ItalianPizza;
    private mexPizza MexicanPizza;

    private Main(AbstractFactory factory) {
        ItalianPizza = factory.cookIt();
        MexicanPizza= factory.cookMex();
    }

    private void abrir(){
        ItalianPizza.open();
        MexicanPizza.open();
    }

    public static void main(String[] args) {
        BakeFam bakeFam = new BakeFam();
        Main app = new Main(bakeFam);
        app.abrir();
    }
}