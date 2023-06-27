import java.util.Scanner;

public class Palindromo {
    public static void main(String[] args) {
    Scanner entrada = new Scanner (System.in);

    System.out.println("Entre com uma palavra: ");
    String palavra = entrada.next();
    int primeiraPosicao = 0;
    int ultimaPosicao = palavra.length() -1;
    boolean ehUmPalindromo = true;

    while(primeiraPosicao < ultimaPosicao) {
        if(palavra.charAt(primeiraPosicao)  != palavra.charAt(ultimaPosicao)) {
            ehUmPalindromo = false;
        }
        primeiraPosicao++;
        ultimaPosicao--;
    }
    if(ehUmPalindromo) {
        System.out.println("A palavra é um palíndromo");
    }
    else{
        System.out.println("A palavra não é um palíndromo");
    }
    entrada.close();
  }
}
