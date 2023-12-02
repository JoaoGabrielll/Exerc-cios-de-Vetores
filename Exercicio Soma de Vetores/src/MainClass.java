import java.util.Scanner;

public class MainClass {
    public static void main(String[]args){
        Scanner tc = new Scanner(System.in);

        System.out.print("Quantos valores vai ter cada vetor? ");
        int n = tc.nextInt();

        int[] vetorA = new int[n];
        int[] vetorB = new int[n];
        int[] resultado = new int[n];

        System.out.println("Digite os valores do vetor A: ");
        for (int i = 0; i < n; i++){
            vetorA[i] = tc.nextInt();
        }

        System.out.println("Digite os valores do vetor B: ");
        for (int i = 0; i < n; i++){
            vetorB[i] = tc.nextInt();
        }

        for (int i = 0; i < n; i++){
            resultado[i] = vetorA[i] + vetorB[i];
        }

        System.out.println("VETOR RESULTANTE:");
        for (int i = 0; i < n; i++){
            System.out.println(resultado[i]);
        }

    }
}
