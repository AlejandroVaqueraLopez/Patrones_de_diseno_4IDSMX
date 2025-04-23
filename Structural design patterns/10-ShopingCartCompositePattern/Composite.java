import java.util.List;
import java.util.ArrayList;

public class Composite implements Cart {
    private List<Cart> cart = new ArrayList<>();

    public void add(Cart c){
        cart.add(c);
    }
    public void delete(Cart c){
        cart.remove(c);
    }

    @Override
    public void add(){
        for(Cart c : cart){
            c.add();
        }
    }

}
