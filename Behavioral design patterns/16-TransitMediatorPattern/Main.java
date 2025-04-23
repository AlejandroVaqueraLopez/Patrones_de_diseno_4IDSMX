public class Main {
    public static void main(String[] args) {
        System.out.println("Transit police Mediator pattern\n");

        PoliceC police = new PoliceC();
        
        Transit car1 = new Car("Tsuru tuneado", police);
        Transit bus1 = new Bus("Camion bluebird", police);

        police.registerTransit(car1);
        police.registerTransit(bus1);

        car1.sendMsg("cross the street");
        bus1.sendMsg("spin to Right");


    }
}