import java.util.Scanner;

public class Loop {

    public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int numEntradas = 0;
		int numero;
		int soma = 0;
		System.out.println("Insira 10 números separados por espaço: ");
		while(numEntradas < 10) {
			numero = entrada.nextInt();
			soma += numero;
			numEntradas++;
			
        }
		System.out.print("A soma destes 10 números é: " + soma);
		entrada.close();
	}

}
