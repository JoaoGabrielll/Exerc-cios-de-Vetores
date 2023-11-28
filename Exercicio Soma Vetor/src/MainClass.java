import java.util.Locale;
import java.util.Scanner;

public class MainClass {
    public static void main(String[]args){
        Locale.setDefault(Locale.US);
        Scanner tc = new Scanner(System.in);

        System.out.print("Quantos numeros você vai digitar? ");
        int n = tc.nextInt();

        double[] vetor = new double[n];

        for (int i = 0; i < n; i++){
            System.out.print("Digite um numero ");
            vetor[i] = tc.nextDouble();
        }

        double soma = 0;
        for (int i = 0; i < n; i++){
            soma = soma + vetor[i];
        }

        double media = soma / n;

        System.out.print("VALORES = ");
        for (int i = 0; i < n; i++){
            System.out.printf("%.1f ", vetor[i]);
        }
        System.out.printf("\nSoma = %.2f\n", soma);
        System.out.printf("Soma = %.2f\n", media);

        tc.close();
    }
}
