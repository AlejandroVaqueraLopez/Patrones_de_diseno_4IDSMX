public class Main {
    public static void main(String[] args) {
        ServiceBank bank = new ProxyBank();

        bank.serviceOp("Tulio","admin");
        bank.serviceOp("Mijares","client");
    }
}