public class Weld extends Production {
    @Override
    public void process(Product product){
        if(product.getBoard() !=null){
            product.setWeld(true);
            System.out.println("Step 2: PCB welded!.");
        }
        if (next != null){
            next.process(product);
        }
    }
}
