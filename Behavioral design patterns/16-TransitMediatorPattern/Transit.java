public abstract class Transit {
    protected Police police;
    protected String name;

    public Transit(String name, Police police) {
        this.name = name;
        this.police = police;
    }
    public abstract void getMsg(String message);
    public void sendMsg(String message) {
        police.sendMsg(message, this);
    }
    public String getName(){
        return name;
    }
}
