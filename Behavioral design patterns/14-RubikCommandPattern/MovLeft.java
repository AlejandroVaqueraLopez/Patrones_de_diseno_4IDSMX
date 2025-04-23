public class MovLeft implements Move {
    private Cube cube;
    public MovLeft(Cube cube){
        this.cube = cube;
    }
    @Override
    public void movement(){
        cube.spinLeft();
    }
}
