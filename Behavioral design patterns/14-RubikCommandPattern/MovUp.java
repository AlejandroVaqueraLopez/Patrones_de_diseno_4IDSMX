public class MovUp implements Move {
    private Cube cube;
    public MovUp(Cube cube){
        this.cube = cube;
    }
    @Override
    public void movement(){
        cube.spinUp();
    }
}
