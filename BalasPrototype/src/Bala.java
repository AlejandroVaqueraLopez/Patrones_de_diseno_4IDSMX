public class Bala implements Prototype{
    private String tamano;
    public int velocidad;

    public Bala(String tamano, int velocidad) {
        this.tamano= tamano;
        this.velocidad= velocidad;
    }

    public String getTamano() {
        return this.tamano;
    }

    public int getVel() {
        return this.velocidad;
    }

    public Bala clone(){
        return new Bala(this.tamano, this.velocidad);
    }

    @Override
    public String toString(){
        return "Proyectil("+getTamano()+" " +String.valueOf(getVel())+ ")";
    }



}
