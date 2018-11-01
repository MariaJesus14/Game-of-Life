/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package data_structures;

/**
/**
 *@author Jerry Rivera
 * @author Roibin Elizondo
 * @author Maria Rodriguez
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
      int NeighboorInitialRow;
      int NeighboorInitialColumn;
      for (int rows = 0; rows < Matrix.matrixLenght(); rows++) {
          for (int columns = 0; columns < Matrix.matrixLenght(); columns++) {
            
              if(Matrix.getMatrixPosition(rows, columns).equals(Cell.dead())){
                   Matrix.starterNeighboor(rows, columns);
                  for ( NeighboorInitialRow = Matrix.getArrayDatosPosition(0); NeighboorInitialRow < Matrix.getArrayDatosPosition(2); NeighboorInitialRow++) {
                      for ( NeighboorInitialColumn = Matrix.getArrayDatosPosition(1); NeighboorInitialColumn < Matrix.getArrayDatosPosition(2); NeighboorInitialColumn++) {
                          System.out.println(""+Matrix.getMatrixPosition(NeighboorInitialRow, NeighboorInitialColumn));
                          if(Matrix.getMatrixPosition(NeighboorInitialRow, NeighboorInitialColumn).equals(Cell.alive())){
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

    

