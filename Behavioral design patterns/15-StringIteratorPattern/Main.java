public class Main {
    public static void main(String[] args) {
        System.out.println("Iterator pattern, show letter by letter of String\n");
        Text text = new Text("my test is lala lala la la");
        Iterator iterator = text.createIterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.nextChar());
        }

    }
}