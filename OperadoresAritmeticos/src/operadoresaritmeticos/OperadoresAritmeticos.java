/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package operadoresaritmeticos;

/**
 *
 * @author Lucas
 */
public class OperadoresAritmeticos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        /*int numero = 10;
        int valor = 4 + numero++;
        System.out.println(valor);
        System.out.println(numero);
        numero = numero+=5;
        System.out.println(numero);
        numero = numero*=2;
        System.out.println(numero);*/
        float v = 25.78f;
        System.out.println(v);
        int ar = (int) Math.floor(v);
        System.out.println(ar);
        ar = Math.round(v);
        System.out.println(ar);
        ar = (int) Math.ceil(v);
        System.out.println(ar);
        ar = (int) Math.cbrt(v);
        System.out.println(ar);
        ar = (int)Math.sqrt(v);
        System.out.println(ar);
    }
    
}
