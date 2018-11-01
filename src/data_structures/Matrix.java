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
    Cell cell = new Cell();
    private static String[][] matrixGame;
    private  static int[] arrayDatos = new int[3];
    
    public Matrix() {
    
    }
     public Matrix(int row,int column){
        matrixGame= new String [row][column];
    }
    public static void matrix_size(int size){
      
      matrixGame= new String [size][size];
    }
    
    public static int matrixLenght (){
        return matrixGame.length;
    }
    
    public static void createCells (){
        for (int i = 0; i < matrixGame.length; i++) {
            for (int j = 0; j < matrixGame.length; j++) {
                matrixGame[i][j] = Cell.dead();
            }
        }
    }
    
    public static int getArrayDatosPosition (int index){
        return Matrix.arrayDatos[index];
    }
    public static String getMatrixPosition(int rows, int columns){
        return matrixGame[rows][columns];
    }
    
    
    
    public static void addCell (int row, int colunm){
        if(row <0 && colunm <0){
        }else{
            matrixGame[row][colunm] = Cell.alive();
        }
    }
    
    public static void setStatus (int rows, int columns, String status){
        matrixGame[rows][columns]= status;
    }
    
    public static String printMatrix (){
        String tabla = "";
        for (int fila = 0; fila < matrixGame.length; fila++) {
            for (int columna = 0; columna < matrixGame.length; columna++) {
                tabla = tabla +" | "+matrixGame[fila][columna];
            }
            
            tabla = tabla +" | ";
            tabla = tabla + "\n";
        }
        return tabla;
    }
    
    public static int[] starterNeighboor (int rowsCelula, int columnsCelula){
        int[] arrayDatos = new int[3];
        rowsCelula = rowsCelula-1;
        columnsCelula = columnsCelula-1;
        System.out.println("ColCel"+columnsCelula+"FilCel"+rowsCelula);
        int totalVecinos = 8;
        for (int rows = rowsCelula; rows < 8; rows++) {
            for (int columns = columnsCelula; columns < 8; columns++) {
                if(rows < 0 && columns < 0){
                    totalVecinos = totalVecinos -1;
                    System.out.println("Rows"+rows+"Column"+columns+"vecino"+totalVecinos);
                }else{
                 arrayDatos[0] = rows;
                 arrayDatos[1] = columns;
                 arrayDatos[2] = totalVecinos;
                 //System.out.print(""+arrayDatos[0]+arrayDatos[1]+arrayDatos[2]);
                 return Matrix.arrayDatos = arrayDatos;
                 //System.out.print(""+arrayDatos[0]+arrayDatos[1]+arrayDatos[2]);
                }
            }
        }
        return Matrix.arrayDatos = arrayDatos;
    }   
    
//    public void rule1 (){
//      int alive = 0;
//      int vecinoInicialFila = 0;
//      int vecinoInicialColumna = 0;
//      for (int rows = 0; rows < matrixGame.length; rows++) {
//          for (int columns = 0; columns < matrixGame.length; columns++) {
//              starterNeighboor(rows, columns);
//              if(matrixGame[rows][columns]== Cell.dead()){
//                  for ( vecinoInicialFila = arrayDatos[0]; vecinoInicialFila < arrayDatos[2]; vecinoInicialFila++) {
//                      for ( vecinoInicialColumna = arrayDatos[1]; vecinoInicialColumna < arrayDatos[2]; vecinoInicialColumna++) {
//                          if(matrixGame[vecinoInicialFila][vecinoInicialColumna] == Cell.alive()){
//                              alive = alive +1;
//                          }else{
//                              System.out.print("hola");
//                          }
//                      }
//                  }
//                  if (alive == 3){
//                      matrixGame[rows][columns] = Cell.alive();
//                  }
//              }else{
//                  
//              }
//          }
//      }
//  }

}
