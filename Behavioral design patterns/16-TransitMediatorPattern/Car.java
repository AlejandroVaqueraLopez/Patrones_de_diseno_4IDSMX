public class Car extends Transit {
    public Car(String name, Police police){
        super(name,police);
    }
    @Override
    public void getMsg(String message){
        System.out.println(name + " must " + message);
    }
}
