import java.util.Scanner;

public class MainClass {
    public static void main(String[]args){
        Scanner tc = new Scanner(System.in);

        System.out.println("Quantos numeros você vai digitar?");
        int n = tc.nextInt();

        int[] vetor = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.println("Digite um numero");
            vetor[i] = tc.nextInt();
        }

        System.out.println("NÚMEROS NEGATIVOS");
        for (int i = 0; i < n; i++){
            if (vetor[i] < 0){
                System.out.printf("%d\n", vetor[i]);
            }
        }

    }
}