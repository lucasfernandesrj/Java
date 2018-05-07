package aula14;

public class Visualizacao {
    private Gafanhoto espectador;
    private Video filme;
    
    public Visualizacao(Gafanhoto espectador,Video filme){
        this.espectador = espectador;
        this.filme = filme;
        this.espectador.setToAssistindo(this.espectador.getToAssistindo()+1);
        this.filme.setViews(this.filme.getViews()+1);
    }
    
    public void avaliar(){
        this.filme.setAvaliacao(5);
    }
    public void avaliar(int nota){
        this.filme.setAvaliacao(nota);
    }
    public void avaliar(float porc){
        
    }

    public Gafanhoto getEspectador() {
        return espectador;
    }

    public void setEspectador(Gafanhoto espectador) {
        this.espectador = espectador;
    }

    public Video getFilme() {
        return filme;
    }

    public void setFilme(Video filme) {
        this.filme = filme;
    }

    @Override
    public String toString() {
        return "Visualizacao{" + "espectador=" + espectador + "\n filme=" + filme + '}';
    }
    
}
