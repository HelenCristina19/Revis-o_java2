import java.util.Scanner;

public class DoWhile {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int numEntradas = 0;
		int soma = 0;
        int numero = 0;
        do {
            System.out.println("Insira um número: ");
            numero = entrada.nextInt();
            soma += numero;
            numEntradas++;

        }while(numEntradas < 10);
        System.out.println("A soma dos 10 números é: " + soma);
        entrada.close();

    }

}
