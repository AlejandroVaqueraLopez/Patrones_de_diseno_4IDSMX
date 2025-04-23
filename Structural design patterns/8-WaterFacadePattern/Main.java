public class Main {
    public static void main(String[] args) {
        System.out.println("Water purifier\n");
        Water water = new Water();
        Filter filter = new Filter();
        Bucket bucket = new Bucket();
        Purifier purifier = new Purifier(water,filter,bucket);

        purifier.start();
        System.out.println("purifier is working");
        purifier.stop();
    }
}