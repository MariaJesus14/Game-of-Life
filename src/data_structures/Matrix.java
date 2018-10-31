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
public class Matrix {
    private static String[][] matrixPrueba;
    private int[] arrayDatos = new int[3];
    
    public Matrix() {
    
    }
     public Matrix(int row,int column){
        matrixPrueba= new String [row][column];
    }
    public static void matrix_size(int size){
      
      matrixPrueba= new String [size][size];
    }
    
    public static void createCells (){
        for (int i = 0; i < matrixPrueba.length; i++) {
            for (int j = 0; j < matrixPrueba.length; j++) {
                matrixPrueba[i][j] ="□";
            }
        }
    }
    
    public void addCell (int row, int colunm){
        if(row <0 && colunm <0){
        }else{
            matrixPrueba[row][colunm] ="■" ;
        }
    }
    
    public static String printMatrix (){
        String tabla = "";
        for (int fila = 0; fila < matrixPrueba.length; fila++) {
            for (int columna = 0; columna < matrixPrueba.length; columna++) {
                tabla = tabla +" | "+matrixPrueba[fila][columna];
            }
            
            tabla = tabla +" | ";
            tabla = tabla + "\n";
        }
        return tabla;
    }
    
    public int[] starterNeighboor (int rowsCelula, int columnsCelula){
        int[] arrayDatos = new int[3];
        rowsCelula = rowsCelula-1;
        columnsCelula = columnsCelula-1;
        int totalVecinos = 8;
        for (int rows = 0; rows < 8; rows++) {
            for (int columns = 0; columns < 8; columns++) {
                if(rows < 0 && columns < 0){
                    totalVecinos = totalVecinos -1;
                }else{
                 arrayDatos[0] = rows;
                 arrayDatos[1] = columns;
                 arrayDatos[2] = totalVecinos;
                 System.out.print(""+arrayDatos[0]+arrayDatos[1]+arrayDatos[2]);
                 return this.arrayDatos = arrayDatos;
                 //System.out.print(""+arrayDatos[0]+arrayDatos[1]+arrayDatos[2]);
                }
            }
        }
        return this.arrayDatos = arrayDatos;
    }   
    
    public void rule1 (){
      int alive = 0;
      int vecinoInicialFila = 0;
      int vecinoInicialColumna = 0;
      for (int rows = 0; rows < matrixPrueba.length; rows++) {
          for (int columns = 0; columns < matrixPrueba.length; columns++) {
              starterNeighboor(rows, columns);
              if(matrixPrueba[rows][columns]== "□"){
                  for ( vecinoInicialFila = arrayDatos[0]; vecinoInicialFila < arrayDatos[2]; vecinoInicialFila++) {
                      for ( vecinoInicialColumna = arrayDatos[1]; vecinoInicialColumna < arrayDatos[2]; vecinoInicialColumna++) {
                          if(matrixPrueba[vecinoInicialFila][vecinoInicialColumna] == "■"){
                              alive = alive +1;
                          }else{
                              System.out.print("hola");
                          }
                      }
                  }
                  if (alive == 3){
                      matrixPrueba[rows][columns] = "■";
                  }
              }else{
                  
              }
          }
      }
  }

}
