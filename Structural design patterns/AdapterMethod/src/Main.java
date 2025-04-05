public class Main {
    public static void main(String[] args) {
        System.out.println("Adapter pattern");

        Printer_new pn = new Printer_new();
        pn.print();

        Printer_old po = new Printer_old();

        AdapterPrinter adapter = new AdapterPrinter(po);

        adapter.print();

    }
}