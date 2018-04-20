/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package desafiorepita;

import javax.swing.JOptionPane;

/**
 *
 * @author Lucas
 */
public class DesafioRepita {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int numero, total = 0;
        int par = 0,impar = 0;
        int maior = 0, media = 0;
        do{
            
        numero = Integer.parseInt(JOptionPane.showInputDialog(null,
                "<html>Informe um valor <br> (0 interrompe)</html>","",JOptionPane.INFORMATION_MESSAGE));
        if(numero==0)break;
        if(numero%2==0)par++;
        else impar++;
        total++;
        if(numero>100)maior++;
        media+=numero;
        }while(numero!=0);
        
        media=media/total;
        
        JOptionPane.showMessageDialog(null,String.format("<html>Resultado:<br><hr>"
                + "Total valores: %d <br>"
                + "Total pares: %d <br>"
                + "Total ímpares: %d <br>"
                + "Acima de 100: %d <br>"
                + "Media dos valores: %d <html>", total,par,impar,maior,media));
    }
    
}
