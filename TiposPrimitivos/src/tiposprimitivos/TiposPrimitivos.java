package tiposprimitivos;

import java.util.Scanner;

/**
 *
 * @author vschn
 */
public class TiposPrimitivos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite o nome");
        String nome = teclado.nextLine();
        System.out.println("Digite a nota");
        float nota = teclado.nextFloat();
        System.out.printf("A nota de %s nota é %.2f \n",nome, nota);
    }
    
}
