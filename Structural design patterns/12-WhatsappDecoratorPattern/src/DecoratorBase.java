public class DecoratorBase implements INotification{
   private final INotification decorator;
    protected final String[] data;//this should be a DB

   public DecoratorBase(INotification decorator) {
       this.decorator = decorator;
       this.data = new String[]{"1234234", "juan@gmail.com"};
   }

    @Override
    public String getUsername() {
        return decorator.getUsername();
    }

    @Override
    public void sendMsg (String msg) {
       decorator.sendMsg(msg);
    }
}
