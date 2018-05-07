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
public class Mamifero extends Animal {
    
    protected Mamifero(float peso,int idade,int membros){
        super(peso,idade,membros);
    }
    @Override
    protected void emitirSom() {
        System.out.println("Som de Mamifero");
    }
    
}
