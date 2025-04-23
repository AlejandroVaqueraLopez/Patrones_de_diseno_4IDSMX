public class Vegetables implements Cart {
    private String product;

    public Vegetables(String product){
        this.product = product;
    }

    @Override
    public void add(){
        System.out.printf("Adding %s from vegetables section\n",product);
    }
}
