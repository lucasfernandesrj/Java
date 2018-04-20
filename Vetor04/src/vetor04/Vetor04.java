/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vetor04;

import java.util.Arrays;

/**
 *
 * @author Lucas
 */
public class Vetor04 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int vet[] = {3, 5, 1, 8, 4};
        for(int v:vet){
            System.out.print(v + " ");
        }
        //Arrays.fill(vet,8);
        int pos = Arrays.binarySearch(vet, 1);
        System.out.println("\nEncontrei o valor " + 1 + " na posição "+pos);
    }
    
}
