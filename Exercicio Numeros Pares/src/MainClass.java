import java.util.Scanner;

public class MainClass {
    public static void main(String[]args){
        Scanner tc = new Scanner(System.in);

        int pegarNumeros = 0;

        System.out.print("Quantos numeros voce vai digitar? ");
        int n = tc.nextInt();

        int[] vetorNumeros = new int[n];

        for (int i = 0; i < n; i++){
            System.out.print("Digite um numero: ");
            vetorNumeros[i] = tc.nextInt();

            if (vetorNumeros[i] % 2 == 0){
                pegarNumeros++;
            }
        }

        System.out.println("NUMEROS PARES:");
        for (int i = 0; i < n; i++){
            if (vetorNumeros[i] % 2 == 0) {
                System.out.printf("%d ", vetorNumeros[i]);
            }
        }
        System.out.println();
        System.out.print("\nQUANTIDADE DE PARES = " + pegarNumeros);
    }
}
