/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logical_model;

/**
 *
 * @author Usuario
 */
public class LifeGame {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        GestorEs gestores = new GestorEs();
        ImprimirTabla imprimirtabla = new ImprimirTabla();
        imprimirtabla.pruebaAsignar1();
        //imprimirtabla.pruebaAsignar2();
        String tabla = imprimirtabla.metodo1();
        
        gestores.mostrarMensaje(imprimirtabla.metodo1());
        imprimirtabla.addCell(gestores.pedirEntero("Introduzca la fila"), gestores.pedirEntero("Introduzca la columna"));
        imprimirtabla.addCell(gestores.pedirEntero("Introduzca la fila"), gestores.pedirEntero("Introduzca la columna"));
        imprimirtabla.addCell(gestores.pedirEntero("Introduzca la fila"), gestores.pedirEntero("Introduzca la columna"));
        imprimirtabla.addCell(gestores.pedirEntero("Introduzca la fila"), gestores.pedirEntero("Introduzca la columna"));
        imprimirtabla.addCell(gestores.pedirEntero("Introduzca la fila"), gestores.pedirEntero("Introduzca la columna"));
        imprimirtabla.addCell(gestores.pedirEntero("Introduzca la fila"), gestores.pedirEntero("Introduzca la columna"));
//        
        //gestores.mostrarMensaje(imprimirtabla.metodo1());
        //imprimirtabla.vecinoInicial(0, 0)
        
        imprimirtabla.reglaGeneral1();
        gestores.mostrarMensaje(imprimirtabla.metodo1());
       
        
    }
    
}
