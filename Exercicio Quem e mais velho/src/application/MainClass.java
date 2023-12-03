package application;

import entities.MostrarDados;
import entities.Pessoa;
import java.util.Scanner;

public class MainClass {
    public static void main(String[]args){
        Scanner tc = new Scanner(System.in);

        System.out.print("Quantas pessoas voce vai digitar? ");
        int n = tc.nextInt();

        int idade, maiorIdade = 0;
        String nome;

        Pessoa[] vetorPessoas = new Pessoa[n];

        for (int i = 0; i < n; i++){
            System.out.println("Dados da " + (i + 1) + "ª pessoa:");

            System.out.print("Nome: ");
            nome = tc.next();
            System.out.print("Idade: ");
            idade = tc.nextInt();

            Pessoa pessoa = new Pessoa(nome, idade);
            vetorPessoas[i] = pessoa;

        }

        System.out.println(MostrarDados.dadosPessoas(vetorPessoas));

        tc.close();
    }
}