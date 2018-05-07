package aula11;

public class Bolsista extends Aluno{
    private int bolsa;
    
    public Bolsista(String nome, int idade, String sexo, int matricula,String curso, int bolsa){
        super(nome, idade, sexo, matricula, curso);
        this.bolsa=bolsa;
    }
    
    protected final void renovarBolsa(){
        System.out.println("Bolsa renovada");
    }
    
    @Override
    protected void pagarMensalidade(){
        System.out.println("Mensalidade de bolsa paga");
    }

    public int getBolsa() {
        return bolsa;
    }

    public void setBolsa(int bolsa) {
        this.bolsa = bolsa;
    }
    
}