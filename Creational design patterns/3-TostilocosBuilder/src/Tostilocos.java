public class Tostilocos {
    private boolean cueritos;
    private boolean pepino;
    private boolean cacahuates;
    private boolean jicama;

    public Tostilocos(boolean cueritos, boolean pepino, boolean cacahuates, boolean jicama) {
        this.cueritos = cueritos;
        this.pepino = pepino;
        this.cacahuates = cacahuates;
        this.jicama = jicama;

    }

    @Override
    public String toString(){
        return "Tostilocos(cueritos: "+cueritos+",pepino: "+pepino+",cacahuate: "+cacahuates+",jicama: "+jicama+")";
        //gpu + motherboard + cpu + ram;
    }
}
