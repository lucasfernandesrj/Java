/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vetor01;

/**
 *
 * @author Lucas
 */
public class Vetor01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int n[] = {3,2,8,7,5,4};
        System.out.println("Total de casas de N é "+ n.length);
        for(int c=0;c<n.length;c++){
            System.out.println("na posição "+ c + " temos o valor "+ n[c]);
        }
    }
    
}
