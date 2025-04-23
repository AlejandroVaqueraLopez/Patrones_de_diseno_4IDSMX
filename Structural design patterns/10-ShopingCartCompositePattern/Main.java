public class Main {
    public static void main(String[] args) {
        System.out.println("shoping cart using composite");

        Meat c1 = new Meat("red meat");
        Meat c2 = new Meat("white meat");
        Vegetables v1 = new Vegetables("Lettuce");
        Can e1 = new Can("corn");

        c1.add();
        System.out.println("\n");

        Composite composite = new Composite();
        composite.add(c1);
        composite.add(c2);
        composite.add(v1);
        composite.add(e1);
    }
}