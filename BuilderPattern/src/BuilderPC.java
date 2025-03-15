public class BuilderPC {

    private String cpu;
    private String gpu;
    private String power;
    private String motherboard;
    private int ram;
    private float[] _case;

    public BuilderPC setCpu(String cpu){
        this.cpu = cpu;
        return this;
    }

    public BuilderPC setGpu(String gpu){
        this.gpu = gpu;
        return this;
    }

    public BuilderPC setPower(String power){
        this.power = power;
        return this;
    }

    public BuilderPC setMotherboard(String motherboard){
        this.motherboard = motherboard;
        return this;
    }

    public BuilderPC setRam(int ram){
        this.ram = ram;
        return this;
    }

    public BuilderPC setCase(float[] _case){
        this._case = _case;
        return this;
    }

    public PC getPC(){
        return new PC(cpu,gpu,power,motherboard,ram,_case);
    }

}
