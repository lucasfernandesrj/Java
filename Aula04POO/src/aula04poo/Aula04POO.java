package aula04poo;

public class Aula04POO{
    public static void main(String[]args){
        Caneta c1 = new Caneta("Nic",0.4f,"Amarela");
        System.out.println(""+ c1.toString());
        
        CanetaManual c2 = new CanetaManual("Bic","Azul",1.5f);
        c2.status();
        
    }
}