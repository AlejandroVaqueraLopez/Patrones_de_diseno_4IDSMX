public class AdapterPrinter implements Printer{
    private Printer_old pri;

    public AdapterPrinter(Printer_old pri){
        this.pri = pri;
    }

    @Override
    public void print(){
        pri.imprimir();
    };
}
