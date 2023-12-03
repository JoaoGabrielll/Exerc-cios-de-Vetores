package entities;

public class MostrarDados {

    public static String dadosPessoas(Pessoa[] vetorPessoas){
        int maiorIdade = vetorPessoas[0].getIdade();
        String nomePessoa = null;

        for (int i = 0; i < vetorPessoas.length; i++){
            if (vetorPessoas[i].getIdade() > maiorIdade ){
                maiorIdade = vetorPessoas[i].getIdade();
                nomePessoa = vetorPessoas[i].getNome();
            }
        }
        return "PESSOA MAIS VELHA: " + nomePessoa;
    }
}
