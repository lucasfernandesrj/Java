/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package numeros;

import java.util.Scanner;

/**
 *
 * @author Lucas
 */
public class Numeros {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int num, soma=0;
        String resposta;
        Scanner teclado = new Scanner(System.in);
        do{
            System.out.print("Digite um número: ");
            num = teclado.nextInt();
            soma+=num;
            System.out.print("Quer continuar? [S/N] ");
            resposta = teclado.next();
        }while(resposta.equals("S") || resposta.equals("s"));
        System.out.printf("A soma de todos os valores é %d.\n", soma);
    }
    
}
