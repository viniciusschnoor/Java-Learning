/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package comparacaostring;

/**
 *
 * @author vschn
 */
public class ComparacaoString {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String nome1 = "Vinicius";
        String nome2 = "Vinicius";
        String nome3 = new String("Vinicius");
        String res = ( nome1.equals(nome3) ) ? "IGUAL" : "DIFERENTE" ;
        System.out.println(res);
    }
    
}
