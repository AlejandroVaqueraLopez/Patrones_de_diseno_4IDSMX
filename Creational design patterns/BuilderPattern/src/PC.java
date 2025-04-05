public class PC {
    private String cpu;
    private String gpu;
    private String power;
    private String motherboard;
    private int ram;
    private float[] _case;

    public PC(String cpu, String gpu, String power, String motherboard, int ram, float[] _case) {
        this.cpu = cpu;
        this.gpu = gpu;
        this.power = power;
        this.motherboard = motherboard;
        this.ram = ram;
        this._case = _case;
    }

    @Override
    public String toString(){
        return "PC("+gpu+","+motherboard+","+cpu+","+String.valueOf(ram)+")";
        //gpu + motherboard + cpu + ram;
    }
}
