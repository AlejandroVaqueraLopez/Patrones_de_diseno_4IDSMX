public class Main {
    public static void main(String[] args) {
        System.out.println("Production factory using Chain of Responsabilities.\n");
        Production getBoard =  new getBoard();
        Production weld = new Weld();
        Production send = new Send();

        getBoard.setNext(weld);
        weld.setNext(send);

        Product product = new Product();
        getBoard.process(product);
    }
}