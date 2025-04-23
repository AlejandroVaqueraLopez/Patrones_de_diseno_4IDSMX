public class publisherC implements Publisher {
    private final String name;

    public publisherC(String name){
        this.name=name;
    }
    @Override
    public void showBook(String title){
        System.out.println("Title: " + title + ", Publisher: " + name);
    }
}
