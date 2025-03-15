public class Main {
    public static void main(String[] args) {
        System.out.println("Hello, World!");

        Singleton r = Singleton.getInstance();

        System.out.printf("Count => %d\n",r.getCount());
        r.setCount();
        System.out.printf("Count => %d\n",r.getCount());

        Singleton s = Singleton.getInstance();
        System.out.printf("Count => %d\n",s.getCount());
        s.setCount();
        System.out.printf("Count => %d\n",s.getCount());
    }
}