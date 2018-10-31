/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package graphic_interface;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/**
 *
 * @author Roibin
 */
public class Window_cell {

    public void cell() {
        boolean back = true;
        String buttons[] = {"Aleatoreamente", "Manualmente"};
        Icon iconCell = new ImageIcon(getClass().getResource("/graphic_interface/iconCell.jpg"));

        while (back == true) {
            String option = (String) JOptionPane.showInputDialog(null, "Seleccione la forma mediante la cual desea generar las celulas ", "Seleccion de celulas", JOptionPane.INFORMATION_MESSAGE, iconCell, buttons, buttons[0]);

            switch (option) {
                case "Aleatoreamente":
                    
                        
                    
                    break;
                case "Manualmente":

                    break;
                    default:
            }
        }
    }
}
