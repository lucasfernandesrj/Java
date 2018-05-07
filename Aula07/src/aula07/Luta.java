package aula07;
import java.util.Random;

public class Luta{
    //ATRIBUTOS
    private Lutador desafiado;
    private Lutador desafiante;
    private int rounds;
    private boolean aprovada;
    
    //METODOS especiais
    public void marcarLuta(Lutador desafiante, Lutador desafiado){
        if((desafiante.getCategoria().equals(desafiado.getCategoria()))&& (!desafiante.equals(desafiado))){
            this.aprovada = true;
            this.desafiante = desafiante;
            this.desafiado = desafiado;
            System.out.println("Luta Autorizada!");
        }
        else{ 
            this.aprovada = false;
            this.desafiante = null;
            this.desafiado = null;
            System.out.println("Luta Negada!");
        }
        
    }
    public void lutar(){
        if(this.getAprovada()){
            System.out.println("###### Desafiante ######");
            this.desafiante.apresentar();
            System.out.println("###### Desafiado ######");
            this.desafiado.apresentar();
            Random pontos = new Random();
            int vencedor = pontos.nextInt(3);
            System.out.println("============ Resultado da Luta =============");
            switch(vencedor){
            case 0:
                System.out.println("       A disputa terminou em empate!");
                this.desafiado.empatarLuta();
                this.desafiante.empatarLuta();
                break;
            case 1:
                System.out.println("O lutador desafiado "+this.desafiado.getNome()+" venceu a luta!");
                this.desafiado.ganharLuta();
                this.desafiante.perderLuta();
                break;
            case 2:
                System.out.println("O lutador desafiante "+this.desafiante.getNome()+" venceu a luta!");
                this.desafiante.ganharLuta();
                this.desafiado.perderLuta();
                break;      
            }
            System.out.println("=============================================");
        }
        else System.out.println("Luta não pôde acontecer!");
    }
    //metodo getter and setter

    public Lutador getDesafiado() {
        return desafiado;
    }

    public void setDesafiado(Lutador desafiado) {
        this.desafiado = desafiado;
    }

    public Lutador getDesafiante() {
        return desafiante;
    }

    public void setDesafiante(Lutador desafiante) {
        this.desafiante = desafiante;
    }

    public int getRounds() {
        return rounds;
    }

    public void setRounds(int rounds) {
        this.rounds = rounds;
    }

    public boolean getAprovada() {
        return aprovada;
    }

    public void setAprovada(boolean aprovada) {
        this.aprovada = aprovada;
    }
    
}
