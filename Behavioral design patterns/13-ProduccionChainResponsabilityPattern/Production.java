public abstract class Production {
    protected Production next;

    public void setNext(Production next) {
        this.next = next;
    }
    public abstract void process(Product product);


}
