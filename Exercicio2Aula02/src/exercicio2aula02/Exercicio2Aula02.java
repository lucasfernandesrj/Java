package exercicio2aula02;

public class Exercicio2Aula02{
    public static void main(String[]args){
        Cachorro c1 = new Cachorro();
        c1.dono = "Paulo";
        c1.nome = "Thor";
        c1.raca = "Puddle";
        c1.custo = 5;
        c1.idade = 12;
        c1.tamanho = 1.75f;
        c1.acordar();
        c1.status();
        c1.alimentar();
        c1.brincar();
        c1.alimentar();
        c1.limpar();
        c1.doar();
        System.out.println("");
        c1.status();
        c1.dormir();
        c1.alimentar();
        c1.brincar();
        c1.alimentar();
        c1.limpar();
    }
}