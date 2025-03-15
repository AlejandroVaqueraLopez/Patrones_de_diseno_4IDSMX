public class Main {
    public static void main(String[] args) {
        System.out.println("Hello, World!");

        int x = 6;

        //PC pc = new PC("a", "b","c", "d", 8,new float[]{20,40,40});


        BuilderPC builderPC = new BuilderPC();

        PC p = builderPC.setCpu("intel i7").setGpu("RTX 580").setPower("EVGA 800").setMotherboard("Asus mb500").setRam(16).getPC();


        System.out.println(p.toString());

    }
}