package contabanco;
public class ContaBanco{
    public static void main(String[]args){
        Banco p1 = new Banco(1111,"Jubileu");
        
        Banco p2 = new Banco(22222,"Creuza");
        p2.abrirConta("CP");
        p1.abrirConta("CC");
        p1.depositar(300);
        p2.depositar(500);
        p2.sacar(100);
        p2.sacar(1000);
        p1.fecharConta();
        p1.sacar(350);
        p1.fecharConta();
        
        
        p1.imprime();
        p2.imprime();
    }
    
}