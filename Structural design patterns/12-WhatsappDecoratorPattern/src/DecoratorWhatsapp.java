public class DecoratorWhatsapp extends DecoratorBase {
    public DecoratorWhatsapp(INotification ni) {
        super(ni);
    }

    @Override
    public void sendMsg(String msg) {
        super.sendMsg(msg);
        System.out.println("the msg: " + msg + " to: " + data[1]);
    }
}
