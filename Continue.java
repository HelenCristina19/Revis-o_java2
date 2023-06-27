import java.util.Scanner;

public class Continue {
    
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int numEntradas = 10;
        int numero = 0;
        System.out.println("Entre com dez números inteiros: ");
        for ( int i = 0; i < numEntradas; i++) {
            numero = entrada.nextInt();
            if (numero % 2 == 0) {
                continue;
            }
            System.out.println("Este número é ímpar.");
        }
        entrada.close();
    }    
}
