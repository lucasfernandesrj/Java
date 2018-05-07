package exercicio2aula02;

public class Cachorro{
    public String raca;
    public String nome;
    public int idade;
    public float tamanho;
    public int custo = 10;
    public String dono;
    private boolean acordado = false;
    
    
    public void status(){
        System.out.println("Raça = "+ raca);
        System.out.println("Nome = "+ nome);
        System.out.println("Idade = "+ idade);
        System.out.println("Tamanho = "+ tamanho);
        System.out.println("Custo = "+ custo+" reais");
        System.out.println("Dono = "+ dono);
    }
    public void brincar(){
        if (acordado == true)System.out.println("Brincando");
        else System.out.println("O cachorro está dormindo! Não pode brincar!");
    }
    public void passear(){
        if (acordado == true)System.out.println("Passeando");
        else System.out.println("O cachorro está dormindo! Não pode passear!");
    }
    public void doar(){
        this.dono = "Lucas";
        this.custo = 15;
    }
    public void vender(){
        this.dono = "Mariana";
        this.custo = 50;
    }
    public void limpar(){
        if (acordado == true)System.out.println("Tomando Banho");
        else System.out.println("O cachorro está dormindo! Não pode tomar banho!");
    }
    public void alimentar(){
        if (acordado == true)System.out.println("Comendo");
        else System.out.println("O cachorro está dormindo! Não pode comer!");
    }
    public void dormir(){
        acordado = false; 
    }
    public void acordar(){
        acordado = true;
    }
}