public class Carro implements Prototype{
    private String nombre;
    public int llantas;
    private float psi;

    public Carro(String nombre, int llantas, float psi) {
        this.nombre = nombre;
        this.llantas = llantas;
        this.psi = psi;
    }

    public String getNombre() {
        return this.nombre;
    }

    public Carro clone(){
        return new Carro(this.nombre, this.llantas, this.psi);
    }

    @Override
    public String toString(){
        return "Carro("+getNombre()+")";
    }



}
