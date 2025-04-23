public class BakeFam implements AbstractFactory{

    @Override
    public itPizza cookIt() {
        return new itFam();
    }

    @Override
    public mexPizza cookMex() {
        return new mexFam();
    }
}
