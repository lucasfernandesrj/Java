package aula11;

public class Aula11{
    
    public static void main(String [] args){
        
        
     //Pessoa p1 = new Pessoa();  //Classe abstrata não pode ser instanciada
       Visitante v1 = new Visitante("Maria",15,"F");
       Aluno a1 = new Aluno("José",17,"M",5555,"Adm");
       Bolsista b1 = new Bolsista("Luiz",19,"M",666,"Fin",1);
       
       
       v1.fazerAniv();
        System.out.println("");
        
       a1.fazerAniv();
       a1.pagarMensalidade();
        System.out.println("");
        
       b1.fazerAniv();
       b1.pagarMensalidade();
       b1.renovarBolsa();
        System.out.println("");
    }
}