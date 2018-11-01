/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package data_structures;

/**
 *
 * @author Usuario
 */
public class Cell {
    Matrix matrixGame = new Matrix ();
    
    private static  String alive = "■";
    private static  String dead = "□";
    
    public static String alive (){
        
        return alive;
    }
    
    public static String dead(){
        return dead;
    }
    
    public static void rule1 (){ 
      int alive = 0;
      int vecinoInicialFila;
      int vecinoInicialColumna;
      for (int rows = 0; rows < Matrix.matrixLenght(); rows++) {
          for (int columns = 0; columns < Matrix.matrixLenght(); columns++) {
            
              if(Matrix.getMatrixPosition(rows, columns).equals(Cell.dead())){
                   Matrix.starterNeighboor(rows, columns);
                  for ( vecinoInicialFila = Matrix.getArrayDatosPosition(0); vecinoInicialFila < Matrix.getArrayDatosPosition(2); vecinoInicialFila++) {
                      for ( vecinoInicialColumna = Matrix.getArrayDatosPosition(1); vecinoInicialColumna < Matrix.getArrayDatosPosition(2); vecinoInicialColumna++) {
                          System.out.println(""+Matrix.getMatrixPosition(vecinoInicialFila, vecinoInicialColumna));
                          if(Matrix.getMatrixPosition(vecinoInicialFila, vecinoInicialColumna).equals(Cell.alive())){
                              alive = alive +1;
                          }else{
                              System.out.print("hola");
                          }
                      }
                  }
                  if (alive == 2){
                      Matrix.setStatus(rows, columns, Cell.alive);
                  }
              }else{
                  System.out.println("Salio");
              }
          }
      }
  }
}

    

