package application;

import entities.Pessoa;

import java.util.Scanner;

public class MainClass {
    public static void main(String[]args){
        Scanner tc = new Scanner(System.in);

        System.out.print("Quantas pessoas voce vai digitar? ");
        int n = tc.nextInt();

        int idade, maiorIdade = 0;
        String nome, nomePessoa = null;

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

        maiorIdade = vetorPessoas[0].getIdade();

        for (int i = 0; i < vetorPessoas.length; i++){
            if (vetorPessoas[i].getIdade() > maiorIdade ){
                maiorIdade = vetorPessoas[i].getIdade();
                nomePessoa = vetorPessoas[i].getNome();
            }
        }

        System.out.print("PESSOA MAIS VELHA: " + nomePessoa);

        tc.close();
    }
}