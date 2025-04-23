public class Can implements Cart {
    private String product;

    public Can(String product){
        this.product = product;
    }

    @Override
    public void add(){
        System.out.printf("Adding %s from can section\n",product);
    }
}
