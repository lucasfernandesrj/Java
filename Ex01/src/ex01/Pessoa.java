package ex01;

public class Pessoa{
    //ATRIBUTOS
    private String nome;
    private int idade;
    private String sexo;
    
    //CONSTRUTOR
    public Pessoa(String nome, int idade, String sexo){
        this.nome = nome;
        this.idade = idade;
        this.sexo = sexo;
    }
    
    //METODOS ESPECIAIS
    public void fazerAniver(){
        this.setIdade(this.getIdade()+1);
        System.out.println("Parabéns pelos seus "+this.getIdade()+" anos, " +this.getNome()+"!");
    }
    
    //METODO GETTER AND SETTER
    public String getNome(){
        return nome;
    }
    private void setNome(String nome){
        this.nome = nome;
    }
    public int getIdade(){
        return idade;
    }
    private void setIdade(int idade){
        this.idade = idade;
    }
    public String getSexo(){
        return sexo;
    }
    private void setSexo(String sexo){
        this.sexo = sexo;
    }
    
}