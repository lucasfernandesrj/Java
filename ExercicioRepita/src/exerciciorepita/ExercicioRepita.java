/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exerciciorepita;
import javax.swing.JOptionPane;

/**
 *
 * @author Lucas
 */
public class ExercicioRepita {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //JOptionPane.showMessageDialog(null, "Olá, Mundo!","Boas Vindas", JOptionPane.ERROR_MESSAGE);
        int num, soma=0;
        do{
        num = Integer.parseInt(JOptionPane.showInputDialog(null,"<html>Informe um número: <br><em>(valor 0 interrompe)</em></html>"));
        //JOptionPane.showMessageDialog(null, String.format("Você digitou o valor %d. Parabéns!!!\n", num));
        soma+=num;
        }while(num != 0);
        JOptionPane.showMessageDialog(null, String.format("<html>Resultado final:<br><hr> O somatório vale %d.</html>", soma));
    }
}
