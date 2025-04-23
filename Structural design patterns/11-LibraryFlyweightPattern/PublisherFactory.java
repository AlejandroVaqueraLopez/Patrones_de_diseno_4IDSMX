import java.util.HashMap;

public class PublisherFactory {
    private HashMap<String, publisherC> books = new HashMap<>();

    public publisherC getPublisher(String name){
        publisherC book = books.get(name);
        if(book == null){
            book = new publisherC(name);
            books.put(name, book);
        }
        return book;
    }
}
