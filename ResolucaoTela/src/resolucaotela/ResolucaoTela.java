/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package resolucaotela;

import java.awt.Toolkit;

/**
 *
 * @author Lucas
 */
public class ResolucaoTela {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Toolkit tk = Toolkit.getDefaultToolkit();
        int h = tk.getScreenSize().height;
        int w = tk.getScreenSize().width;
        System.out.println("Sua tela tem resolução "+ w +" x " + h);
    }
    
}
