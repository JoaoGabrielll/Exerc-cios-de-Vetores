package application;

import entities.CalculadoraEstatistica;
import entities.Pessoa;
import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[]args){
        Locale.setDefault(Locale.US);
        Scanner tc = new Scanner(System.in);

        String nome;
        int idade;
        double altura;
        System.out.print("Quantas pessoas serão digitadas? ");
        int n = tc.nextInt();

        Pessoa[] vetorPessoas = new Pessoa[n];
        double somaAltura = 0;
        double nIdades = 0;

        for (int i = 0; i < n; i++){
            System.out.println("Dados da " + (i + 1) +"ª pessoa");

            System.out.print("Nome: ");
            nome = tc.next();
            System.out.print("Idade: ");
            idade = tc.nextInt();
            System.out.print("Altura: ");
            altura = tc.nextDouble();

            somaAltura += altura;

            Pessoa pessoa = new Pessoa(nome, idade, altura);
            vetorPessoas[i] = pessoa;

            if (idade < 16){
                nIdades++;
            }
        }

        System.out.printf("\nAltura média: %.2f%n", CalculadoraEstatistica.calcularMediaAltura(somaAltura, n));

        System.out.println("Pessoas com menos de 16 anos: " +CalculadoraEstatistica.calcularIdade(nIdades, n) + "%");

        CalculadoraEstatistica.pessoasIdadeMenor16(vetorPessoas, n);

        tc.close();
    }
}