public class Meat implements Cart {
    private String product;

    public Meat(String product){
        this.product = product;
    }

    @Override
    public void add(){
        System.out.printf("Adding %s from meat section\n",product);
    }
}
