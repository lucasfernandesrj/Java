package exercicio1aula02;
public class Calcular{
    int valor1;
    int valor2;
    private int resultado;
    private boolean bloqueio = true;
    
    public void status(){
        System.out.println("Bloqueio = "+ bloqueio);
    }
    public void somar(){
        this.resultado = this.valor1 + this.valor2;
        System.out.println("Resultado da Soma = " + this.resultado);
    }
    public void subtrair(){
        this.resultado = this.valor1 - this.valor2;
        System.out.println("Resultado da Subtração = " + this.resultado);
    }
    public void multiplicar(){
        this.resultado = this.valor1 * this.valor2;
        System.out.println("Resultado da Multiplicação = " + this.resultado);
    }
    public void dividir(){
        this.resultado = this.valor1 / this.valor2;
        System.out.println("Resultado da Divisão = " + this.resultado);
    }
    public void resto(){
        this.resultado = this.valor1 % this.valor2;
        System.out.println("Resultado do Resto da divisão = " + this.resultado);
    }
    public void potencializar(){
        this.resultado = (int)Math.pow(this.valor1,this.valor2);
        System.out.println("Resultado da Potencialização = " + this.resultado);
    }
    public void bloquear(){
        this.bloqueio = true;
    }
    public void desbloquear(){
        this.bloqueio = false;
    }
}