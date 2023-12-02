import java.util.Locale;
import java.util.Scanner;

public class MainClass {
    public static void main(String[]args){
        Locale.setDefault(Locale.US);
        Scanner tc = new Scanner(System.in);

        System.out.print("Quantos elementos vai ter o vetor? ");
        int n = tc.nextInt();

        double[] vetorNumeros = new double[n];

        double somaVetores = 0, mediaVetores = 0.0;
        for (int i = 0; i < n; i++){
            System.out.print("Digite um numero: ");
            vetorNumeros[i] = tc.nextDouble();

            somaVetores += vetorNumeros[i];
        }

        mediaVetores = somaVetores / n;
        System.out.print("MEDIA DO VETOR = " + mediaVetores);

        for (int i = 0; i < n; i++){
            if (vetorNumeros[i] < mediaVetores){
                System.out.println("\nElementos abaixo da media:" + vetorNumeros[i]);
            }
        }


    }
}
