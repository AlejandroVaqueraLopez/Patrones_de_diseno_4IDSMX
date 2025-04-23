public class MovRight implements Move {
    private Cube cube;
    public MovRight(Cube cube){
        this.cube = cube;
    }
    @Override
    public void movement(){
        cube.spinRight();
    }
}
