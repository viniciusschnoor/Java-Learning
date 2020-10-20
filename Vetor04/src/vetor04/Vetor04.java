/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vetor04;

import java.util.Arrays;

/**
 *
 * @author vschn
 */
public class Vetor04 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int n[] = { 9, 1, 5, 2, 7 };
        for ( int v: n ) {
            System.out.print(v + " ");
        }
        System.out.println("");
        Arrays.sort(n);
        for ( int v: n ) {
            System.out.print(v + " ");
        }
        System.out.println("");
        int p = Arrays.binarySearch(n, 9);
        System.out.println("Encontrei o valor na posição " + p);
    }
    
}
