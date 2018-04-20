/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package idiomasistema;

import java.util.Locale;

/**
 *
 * @author Lucas
 */
public class IdiomaSistema {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Locale loc = Locale.getDefault();
        System.out.println(loc.getDisplayLanguage().toString()); //portugues 
        System.out.println(loc.getCountry()); //BR 
        System.out.println(loc.getDisplayName()); // Portugues (Brasil) 
        System.out.println(loc); //pt_BR 
        System.out.println(loc.getLanguage()); //pt 
        System.out.println(loc.getISO3Language()); //por 
        System.out.println(loc.getISO3Country()); //BRA
        String local = loc.getDisplayLanguage();
        System.out.println("Seu sistema está em " + local);    
    }
    
}
