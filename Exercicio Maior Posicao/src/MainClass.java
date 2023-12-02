import java.util.Locale;
import java.util.Scanner;

public class MainClass {
    public static void main(String[]args){
        Locale.setDefault(Locale.US);
        Scanner tc = new Scanner(System.in);

        System.out.print("Quantos numeros voce vai digitar? ");
        int n = tc.nextInt();

        double maiorNumero;
        int posicao = 0;

        double[] vetorNumero = new double[n];

        for (int i = 0; i < n; i++){
            System.out.print("Digite um numero: ");
            vetorNumero[i] = tc.nextDouble();
        }

        maiorNumero = vetorNumero[0];

        for (int i = 0; i < vetorNumero.length; i++){
            if (vetorNumero[i] > maiorNumero ){
                maiorNumero = vetorNumero[i];
                posicao = i;
            }
        }

        System.out.print("MAIOR VALOR = " + maiorNumero);

        System.out.print("\nPOSICAO DO MAIOR VALOR = " + posicao);

    }
}
