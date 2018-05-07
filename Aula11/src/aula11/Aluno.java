package aula11;

public class Aluno extends Pessoa{
    private int matricula;
    private String curso;
    public Aluno(String nome,int idade,String sexo,int matricula,String curso){
        super(nome,idade,sexo);
        this.curso = curso;
        this.matricula = matricula;
    }
    
    protected void pagarMensalidade(){
        System.out.println("Mensalidade paga");
    }
    //@override public void fazerAniv(){} //Metodo final não pode ser sobrescrito (ele já está em pessoa)

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }
    
    
}