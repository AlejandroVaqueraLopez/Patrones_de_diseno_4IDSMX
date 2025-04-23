
public class  Notification implements INotification{
    private final String username;
    protected final String[] data;//this should be a DB

    public Notification(String username) {
        this.username = username;
        this.data = new String[]{"123456", "Juan@gmail.com"};
    }

    @Override
    public String getUsername() {
        return username;
    }

    @Override
    public void sendMsg (String msg) {
        System.out.println("the msg: " + msg + " to: " + data[1]);
    }

}
