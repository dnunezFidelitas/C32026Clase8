/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package c32026clase8;

import javax.swing.JOptionPane;

/**
 *
 * @author viti
 */
public class C32026Clase8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //creaVectorCantidadAccidentes();
        
        UtilMatrix matrix= new UtilMatrix(2, 3);
        JOptionPane.showMessageDialog(null, matrix.toString()); 
        matrix.llenarMatrix();
        JOptionPane.showMessageDialog(null, matrix.toString()); 
        
    }
    
    public static int[] creaVectorCantidadAccidentes(){
        int [] cantidadAccidentes = new int[5];
        //imprimeVector(cantidadAccidentes);
        for (int i = 0; i < cantidadAccidentes.length; i++) {
            cantidadAccidentes[i]=Integer.parseInt
            (JOptionPane.showInputDialog("Dime que cantida de accidentes has tenidio  " +(i+1)));
        };
        imprimeVector(cantidadAccidentes);
        return cantidadAccidentes;
    }
    
    public static void imprimeVector(int [] vector){
        String resultado= "";
        for (int i = 0; i < vector.length; i++) {
            resultado+="i+"+i+":"+vector[i]+"\n";
        }
        JOptionPane.showMessageDialog(null, resultado);
    
    }
    
}
