public class Main {
    public static void main(String[] args) {
        System.out.println("Adapter pattern");

        TV_new tn = new TV_new();
        tn.watch();

        TV_old to = new TV_old();

        AdapterTV adapter = new AdapterTV(to);

        adapter.watch();

    }
}