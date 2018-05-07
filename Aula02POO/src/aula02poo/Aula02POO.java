package aula02poo;

public class Aula02POO{
    public static void main(String[] args){
       Caneta c1 = new Caneta();
       c1.cor = "Azul";
       c1.ponta = 0.5f;
       c1.tampada = false;
       c1.tampar();
       c1.rabiscar();
       c1.status();
        System.out.println("");
       Caneta c2 = new Caneta();
       c2.modelo = "2FAS1";
       c2.cor = "Vermelha";
       c2.ponta = 1.0f;
       c2.tampada = true;
       c2.destampar();
       c2.rabiscar();
       c2.status();
    }
}