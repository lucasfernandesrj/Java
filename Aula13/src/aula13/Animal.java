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
public abstract class Animal {
    private float peso;
    private int idade;
    private int membros;
    
    protected Animal(float peso,int idade,int membros){
        this.peso = peso;
        this.idade = idade;
        this.membros = membros;
    }
    
    protected abstract void emitirSom();
}
