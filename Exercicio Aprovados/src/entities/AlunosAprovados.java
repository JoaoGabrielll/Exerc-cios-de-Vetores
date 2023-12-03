package entities;

public class AlunosAprovados {

    public static void mediaAlunos(Aluno[] vetorAlunos){
        for (int i = 0; i < vetorAlunos.length; i++) {
            double mediaNotas = (vetorAlunos[i].getNota1() + vetorAlunos[i].getNota2()) / 2;
            if (mediaNotas >= 6.0) {
                System.out.println(vetorAlunos[i].getNome());
            }
        }
    }
}