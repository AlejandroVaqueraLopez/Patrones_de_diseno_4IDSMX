public class Main {
    public static void main(String[] args) {
        System.out.println("Hello, World!");

        //PC pc = new PC("a", "b","c", "d", 8,new float[]{20,40,40});
        BuilderTostilocos builderTostilocos = new BuilderTostilocos();

        Tostilocos t = builderTostilocos.setCueritos(true).setPepino(true).setCacahuate(true).setJicama(true).getTostilocos();


        System.out.println(t.toString());

    }
}
