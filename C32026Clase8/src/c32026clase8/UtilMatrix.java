/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package c32026clase8;

import javax.swing.JOptionPane;

/**
 *
 * @author viti
 */
public class UtilMatrix {
    
    private String [][] matrix;

    public UtilMatrix(int filas, int columnas) {
        matrix=new String [filas][columnas];
        //recomedación inicializara los string vacios
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                matrix[i][j]="";
            }
        }
    }

    public String[][] getMatrix() {
        return matrix;
    }

    public void setMatrix(String[][] matrix) {
        this.matrix = matrix;
    }

    @Override
    public String toString() {
        String resultado="";
        
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                resultado+=matrix[i][j] + " -- ";
            }
            resultado+="\n";
        }
        
        return "utilMatrix{" + "matrix=\n" + resultado + '}';
    }
    
    
    public void llenarMatrix(){
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j]=JOptionPane.showInputDialog( "Digite el espacio fila "+ (i+1) + " columna " + (j+1));
         
            }
        }
    }
    
    
    
    
    
    
}
