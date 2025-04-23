public class getBoard extends Production {
    @Override
    public  void process(Product product){
    product.setBoard("PCB generated");
    System.out.println("step 1: PCB generated.");
    if (next != null){
        next.process(product);
    }
    }
}
