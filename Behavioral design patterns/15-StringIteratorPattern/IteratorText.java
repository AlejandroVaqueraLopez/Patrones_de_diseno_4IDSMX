public class IteratorText implements Iterator{
    private Text text;
    private int pos = 0;

    public IteratorText(Text text){
        this.text = text;
    }
    @Override
    public boolean hasNext() {
        return pos < text.getContent().length();
    }
    @Override
    public char nextChar() {
        return text.getContent().charAt(pos++);
    }
}
