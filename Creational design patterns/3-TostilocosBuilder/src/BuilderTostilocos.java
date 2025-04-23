public class BuilderTostilocos {

    private boolean cueritos;
    private boolean pepino;
    private boolean cacahuates;
    private boolean jicama;

    public BuilderTostilocos setCueritos(boolean cueritos){
        this.cueritos = cueritos;
        return this;
    }

    public BuilderTostilocos setPepino(boolean pepino){
        this.pepino = pepino;
        return this;
    }

    public BuilderTostilocos setCacahuate(boolean cacahuates){
        this.cacahuates = cacahuates;
        return this;
    }

    public BuilderTostilocos setJicama(boolean jicama){
        this.jicama = jicama;
        return this;
    }

    public Tostilocos getTostilocos() {
        return new Tostilocos(cueritos,pepino,cacahuates,jicama);
    }

}
