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
public class Cachorro extends Lobo{
    
    protected Cachorro(float peso,int idade,int membros){
        super(peso,idade,membros);
    }
    @Override
    public void emitirSom(){
        System.out.println("Som de Cachorro");
    }
    public void reagir(String frase){
        if (frase.equals("Agradavel")) System.out.println("Abanar e latir");
        else System.out.println("Rosnar");
    }
    public void reagir(int hora, int minuto){
        if(hora<12)System.out.println("Abanar");
        else if(hora>=18)System.out.println("Abanar e latir");
        else System.out.println("Ignorar");
    }
    public void reagir(boolean dono){
        if (dono == true) System.out.println("Abanar e latir");
        else System.out.println("Rosnar");
        
    }
    public void reagir(int idade, float peso){
        if(idade<10){
            if(peso<50.0f)System.out.println("Abanar e latir");
            else System.out.println("Latir");
        }
        else if(peso<50.0f)System.out.println("Rosnar");
            else System.out.println("Ignorar");
        
    }
}
