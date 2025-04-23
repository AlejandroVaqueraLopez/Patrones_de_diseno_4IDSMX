public class Main {
    public static void main(String[] args) {
        System.out.println("Flyweight Library\n");
        PublisherFactory pf = new PublisherFactory();
        publisherC P1 = pf.getPublisher("Owner Larousse");
        publisherC P2 =  pf.getPublisher("Editorial Larousse");

        P1.showBook("The amazing amazonas");
        P1.showBook("Jungle animals and more");
        P2.showBook("Geography of Hawaii");
    }
}