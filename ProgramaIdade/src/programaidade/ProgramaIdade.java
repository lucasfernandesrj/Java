/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package programaidade;
import java.util.Calendar;
import java.util.Scanner;

/**
 *
 * @author Lucas
 */
public class ProgramaIdade {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Calendar novo = Calendar.getInstance();
        int ano = novo.get(Calendar.YEAR);
        
        Scanner t = new Scanner(System.in);
        System.out.print("Digite o seu ano de nascimento: ");
        int nasc = t.nextInt();
        int idade = ano-nasc;
        System.out.printf("Sua idade é %d anos.\n", idade);
        if(idade>=18){
            System.out.println("Maior de idade.");
        }
        else{
            System.out.println("Menor de idade.");
        }
        
        
    }
    
}
