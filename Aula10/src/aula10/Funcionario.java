package aula10;

public class Funcionario extends Pessoa{
    String setor;
    boolean trabalhando;
    
    public void mudarTrabalho(boolean trabalhando){
        this.setTrabalhando(trabalhando);
    }

    public String getSetor() {
        return setor;
    }

    public void setSetor(String setor) {
        this.setor = setor;
    }

    public boolean getTrabalhando() {
        return trabalhando;
    }

    public void setTrabalhando(boolean trabalhando) {
        this.trabalhando = trabalhando;
    }


    
    
}
