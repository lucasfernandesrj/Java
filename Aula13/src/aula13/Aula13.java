/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula13;

/**
 *
 * @author Lucas
 */
public class Aula13 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Animal a = new Animal();
        Mamifero m = new Mamifero(0.5f,12,4);
        Lobo l = new Lobo(45.7f,15,4);
        Cachorro c = new Cachorro(30.9f,5,4);
        
        m.emitirSom();
        l.emitirSom();
        c.emitirSom();
        c.reagir(true);
        c.reagir("Agradavel");
        c.reagir(12, 35);
    }
    
}
