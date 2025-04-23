public class Main {
    public static void main(String[] args) {
        System.out.println("Command pattern for rubik cube solving\n");
        Cube cube = new Cube();

        Move spinUp = new MovUp(cube);
        Move spinRight = new MovRight(cube);
        Move spinLeft = new MovLeft(cube);

        Invoker control = new Invoker();

        control.Movement(spinUp);
        control.Movement(spinRight);
        control.Movement(spinLeft);
    }
}