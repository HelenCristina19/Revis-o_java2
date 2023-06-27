import java.util.Scanner;

public class For {
    
    public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int numEntradas = 10;
		int soma = 0;
        int numero;
        System.out.println("Entre com 10 números separados por espaços");
        for (int i = 0; i < numEntradas; i++) {
			numero = entrada.nextInt();
			soma += numero;
        }
        System.out.println("A soma destes dez números é: " + soma);
        entrada.close();
    }
}
