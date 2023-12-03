package application;

import entities.Aluno;
import entities.AlunosAprovados;
import java.util.Locale;
import java.util.Scanner;

public class MainClass {
    public static void main(String[]args){
        Locale.setDefault(Locale.US);
        Scanner tc = new Scanner(System.in);

        System.out.print("Quantos alunos serao digitados? ");
        int n = tc.nextInt();
        tc.nextLine();

        String nome;
        Double nota1, nota2;

        Aluno[] vetorAlunos = new Aluno[n];

        for (int i = 0; i < n; i++){
            System.out.println("Digite nome, primeira e segunda nota do " + (i + 1) + "º aluno");
            nome = tc.nextLine();
            nota1 = tc.nextDouble();
            nota2 = tc.nextDouble();
            tc.nextLine();

            Aluno alunos = new Aluno(nome, nota1, nota2);
            vetorAlunos[i] = alunos;
        }

        System.out.println("Alunos aprovados:");
        AlunosAprovados.mediaAlunos(vetorAlunos);
    }
}
