/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package graphic_interface;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import logical_model.ImprimirTabla;
import logical_model.GestorEs;

/**
 *
 * @author Roibin
 */
public class Window_cell {

    ImprimirTabla imprimir = new ImprimirTabla();
    GestorEs gestor = new GestorEs();

    public void cell() {
        boolean back = true;
        String buttons[] = {"Aleatoreamente", "Manualmente"};
        Icon iconCell = new ImageIcon(getClass().getResource("/graphic_interface/iconCell.jpg"));
        String option = (String) JOptionPane.showInputDialog(null, "Seleccione la forma mediante la cual desea generar las celulas ", "Seleccion de celulas", JOptionPane.INFORMATION_MESSAGE, iconCell, buttons, buttons[0]);
        while (back == true) {
            switch (option) {
                case "Aleatoreamente":

                    

                    break;
                case "Manualmente":
                    //System.out.println(""+imprimir.metodo1());
                    imprimir.addCell(gestor.pedirEntero("Introduzca la fila"), gestor.pedirEntero("Introduzca la columna"));
                    imprimir.addCell(gestor.pedirEntero("Introduzca la fila"), gestor.pedirEntero("Introduzca la columna"));
                    //imprimir.pruebaAsignar1();
                    System.out.println(""+imprimir.metodo1());
                    //int row = gestor.pedirEntero("Ingrese la fila");
                    //int colunm = gestor.pedirEntero("Ingrese la columna");

                    //imprimir.addCell(row, colunm);
                    // imprimir.reglaGeneral1();
                    gestor.mostrarMensaje(imprimir.metodo1());

                    //JOptionPane.showMessageDialog(null, imprimir.metodo1());
                    //back = false;
                    break;
                default:
            }
        }
    }
}
