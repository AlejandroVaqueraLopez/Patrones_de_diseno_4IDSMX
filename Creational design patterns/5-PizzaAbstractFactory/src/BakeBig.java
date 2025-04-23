public class BakeBig implements AbstractFactory{

    @Override
    public itPizza cookIt() {
        return new bigIt();
    }

    @Override
    public mexPizza cookMex() {
        return new bigMex();
    }
}
