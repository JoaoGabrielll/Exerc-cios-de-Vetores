import java.util.Scanner;

public class MainClass {
    public static void main(String[]args){
        Scanner tc = new Scanner(System.in);

        System.out.print("Quantos elementos vai ter o vetor? ");
        int n = tc.nextInt();

        int[] numeroVetor = new int[n];

        int tamanhoVetor = 0, somaVetores = 0;
        double mediaVetores = 0.0;

        for (int i = 0; i < n; i++){
            System.out.print("Digite um numero: ");
            numeroVetor[i] = tc.nextInt();

            if (numeroVetor[i] % 2 == 0) {
                somaVetores += numeroVetor[i];
                tamanhoVetor++;
            }
        }

        if (somaVetores > 0){
            mediaVetores = (double) somaVetores / tamanhoVetor;
            System.out.print("MEDIA DOS PARES = " + mediaVetores);
        }else{
            System.out.println("NENHUM NUMERO PAR");
        }

        tc.close();
    }
}
