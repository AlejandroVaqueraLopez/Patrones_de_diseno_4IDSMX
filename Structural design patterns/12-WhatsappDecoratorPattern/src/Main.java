public class Main {
    public static void main(String[] args) {
        //DecoratorWhatsapp whatsapp = new DecoratorWhatsapp();
        //whatsapp.sendMsg("this is a message for ");
        INotification n = new DecoratorWhatsapp(
                new Notification("Luis macias"));

        n.sendMsg("Luis macias");
    }
}