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
public class Window_size {

    Window_cell cell = new Window_cell();

    public void size() {
        boolean back = true;
        String buttons[] = {"8 x 8", "9 x 9", "10 x 10", "11 x 11", "12 x 12", "13 x 13", "14 x 14", "15 x 15", "16 x 16", "17 x 17", "18 x 18", "19 x 19", "20 x 20"};
        Icon iconSize = new ImageIcon(getClass().getResource("/graphic_interface/iconSize.jpg"));
        try {
            
        
        while (back == true) {
            String option = (String) JOptionPane.showInputDialog(null, "Elija el tamaño de la cuadricula para iniciar el juego", "Tamaño de cuadricula", JOptionPane.INFORMATION_MESSAGE, iconSize, buttons, buttons[0]);

            switch (option) {
                case "8 x 8":
                    cell.cell();
                    back = true;
                    break;
                case "9 x 9":

                    break;
                case "10 x 10":

                    break;
                case "11 x 11":
                    break;
                case "12 x 12":
                    break;
                case "13 x 13":
                    break;
                case "14 x 14":
                    break;
                case "15 x 15":
                    break;
                case "16 x 16":
                    break;
                case "17 x 17":
                    break;
                case "18 x 18":
                    break;
                case "19 x 19":
                    break;
                case "20 x 20":
                    break;
                default:
            }
        }
        } catch (Exception e) {
        }
    }
}
