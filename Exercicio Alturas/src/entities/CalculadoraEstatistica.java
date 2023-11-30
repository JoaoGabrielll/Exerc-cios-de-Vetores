package entities;

public class CalculadoraEstatistica {
    public static double calcularMediaAltura(double somaAltura, int n){
        return somaAltura / n;
    }

    public static double calcularIdade(double nIdades, int n){
        return (nIdades / n) * 100;
    }

    public static void pessoasIdadeMenor16 (Pessoa[] vetorPessoas, int n){
        for (int i = 0; i < n; i++){
            if(vetorPessoas[i].getIdade() < 16){
                System.out.println(vetorPessoas[i].getNome());
            }
        }
    }
}
