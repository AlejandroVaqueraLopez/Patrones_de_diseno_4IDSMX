public class Send extends Production {
    @Override
    public void process(Product product){
        if (product.isWeld()){
            product.setSent(true);
            System.out.println("Step 3: The board is on the way.");
        } else {
            System.out.println("Error: Not possible to send a not welded PCB");
        }
    }
}
