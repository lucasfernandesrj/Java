package aula07;

public class Lutador{
    
    //ATRIBUTOS
    private String nome;
    private String nacionalidade;
    private int idade;
    private float altura;
    private float peso;
    private String categoria;
    private int vitorias, derrotas, empates;
    
    //CONSTRUTOR
    public Lutador( String nome, 
                    String nacionalidade, 
                    int idade, 
                    float altura, 
                    float peso,
                    int vitorias, 
                    int derrotas, 
                    int empates) {
        this.nome = nome;
        this.nacionalidade = nacionalidade;
        this.idade = idade;
        this.altura = altura;
        this.setPeso(peso);
        this.vitorias = vitorias;
        this.derrotas = derrotas;
        this.empates = empates;
    }
    
    
    // METODOS
    public void apresentar(){
        System.out.println("Nome: " + this.getNome());
        System.out.println("Origem: " + this.getNacionalidade());
        System.out.println("Idade: "+this.getIdade()+" anos.");
        System.out.println("Altura: "+this.getAltura()+"m de altura.");
        System.out.println("Pesando: "+this.getPeso()+"Kg");
        System.out.println("Ganhou: "+this.getVitorias());
        System.out.println("Perdeu: "+this.getDerrotas());
        System.out.println("Empatou: "+this.getEmpates());
    }
    public void status(){
        System.out.println("-------------------------");
        System.out.print(this.getNome());
        System.out.println(" é um peso "+this.getCategoria());
        System.out.println(this.getVitorias()+" Vitórias.");
        System.out.println(this.getDerrotas()+" Derrotas.");
        System.out.println(this.getEmpates()+" Empates.");
        
    }
    public void ganharLuta(){
        this.setVitorias(this.getVitorias()+1);
    }
    public void perderLuta(){
        this.setDerrotas(this.getDerrotas()+1);
    }
    public void empatarLuta(){
        this.setEmpates(this.getEmpates()+1);
    }
    
    //METODOS GETTER AND SETTER
    public String getNome(){
        return nome;
    }
    private void setNome(String nome){
        this.nome = nome;
    }

    public String getNacionalidade() {
        return nacionalidade;
    }

    private void setNacionalidade(String nacionalidade) {
        this.nacionalidade = nacionalidade;
    }

    public int getIdade() {
        return idade;
    }

    private void setIdade(int idade) {
        this.idade = idade;
    }

    public float getAltura() {
        return altura;
    }

    private void setAltura(float altura) {
        this.altura = altura;
    }

    public float getPeso() {
        return peso;
    }

    private void setPeso(float peso) {
        this.peso = peso;
        setCategoria();
    }

    public String getCategoria() {
        return categoria;
    }

    private void setCategoria() {
        if (getPeso() < 52.2) categoria = "Inválido";
        else if (getPeso() <= 70.3) categoria = "Leve";
             else if (getPeso() < 83.9) categoria = "Médio";
                  else if (getPeso() < 120.2) categoria = "Pesado";
                        else categoria = "Inválido";
    }

    public int getVitorias() {
        return vitorias;
    }

    private void setVitorias(int vitorias) {
        this.vitorias = vitorias;
    }

    public int getDerrotas() {
        return derrotas;
    }

    private void setDerrotas(int derrotas) {
        this.derrotas = derrotas;
    }

    public int getEmpates() {
        return empates;
    }

    private void setEmpates(int empates) {
        this.empates = empates;
    }
    
    
   
}