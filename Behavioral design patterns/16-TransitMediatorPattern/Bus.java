public class Bus extends Transit {
    public Bus(String name, Police police){
        super(name,police);
    }
    @Override
    public void getMsg(String message){
        System.out.println(name + " must " + message + "\n");
    }
}
