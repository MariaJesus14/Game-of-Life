/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package graphic_interface;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import data_structures.Matrix;
import logical_model.GestorEs;
import data_structures.Cell;

/**
 *@author Jerry Rivera
 * @author Roibin Elizondo
 * @author Maria Rodriguez
 */
public class Window_cell {
    GestorEs gestor = new GestorEs();

    public void cell() {
        boolean back = true;
        String buttons2 []={"Agregar","Jugar"};
        String buttons[] = {"Aleatoreamente", "Manualmente"};
        Icon iconCell = new ImageIcon(getClass().getResource("/graphic_interface/iconCell.jpg"));
        Icon iconContinue = new ImageIcon(getClass().getResource("/graphic_interface/images.jpg"));
        String option = (String) JOptionPane.showInputDialog(null, "Seleccione la forma mediante la cual desea generar las celulas ", "Seleccion de celulas", JOptionPane.INFORMATION_MESSAGE, iconCell, buttons, buttons[0]);
         
        while (back == true) {
            switch (option) {
                case "Aleatoreamente":

                    break;
                case "Manualmente":
                    int option2 = (int)JOptionPane.showOptionDialog(null, "Seleccione ", "Continuar", JOptionPane.INFORMATION_MESSAGE,JOptionPane.YES_NO_CANCEL_OPTION, iconContinue, buttons2, buttons2[0]);
                    if (option2==0){
                    Matrix.addCell(gestor.pedirEntero("Ingrese fila"),gestor.pedirEntero("Ingrese columna"));
                    
                    gestor.mostrarMensaje(Matrix.printMatrix());
                    }else{
                        
                        Cell.rule1();
                        gestor.mostrarMensaje(Matrix.printMatrix());
                        back=false;
                    }
                    break;
                   
                default:
            }
        }
    }
}
