public class AdapterTV implements TV{
    private TV_old wa;

    public AdapterTV(TV_old wa){
        this.wa = wa;
    }

    @Override
    public void watch(){
        wa.mirar();
    };
}
