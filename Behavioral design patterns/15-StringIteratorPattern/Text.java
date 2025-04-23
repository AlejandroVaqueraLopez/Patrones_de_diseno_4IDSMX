public class Text {
    private String content;

    public Text(String content) {
        this.content = content;
    }
    public Iterator createIterator() {
        return new IteratorText(this);
    }
    public String getContent() {
        return content;
    }
}
