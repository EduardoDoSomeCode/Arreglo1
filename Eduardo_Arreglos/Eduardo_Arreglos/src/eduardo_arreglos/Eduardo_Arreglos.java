/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eduardo_arreglos;

/**
 *
 * @author LPA1
 */
public class Eduardo_Arreglos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
            int[] numeros=new int[100];
            //Lo recorro y le asigno números
            for(int i=0;i<numeros.length;i++){
                //a la fila de numeros se le asigna a un valor
            numeros[i]=i+1;
            //Se imprime el valor hasta llegar a 100
            System.out.println(numeros[i]);
            }

    }
    
}
