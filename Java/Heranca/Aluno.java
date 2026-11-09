package Java.Heranca; // Declara que esta classe pertence ao pacote Java.Heranca

import java.util.Date; // Importa a classe Date para representar datas

public class Aluno extends Pessoa { // Aluno herda de Pessoa, reaproveitando nome, cpf e data
    public String matricula; // Atributo público: número de matrícula do aluno

    // Construtor: repassa os dados recebidos para o construtor da superclasse Pessoa
    public Aluno(String _nome, String _cpf, Date _data) {
        super(_nome, _cpf, _data); // Chama o construtor de Pessoa para inicializar nome, cpf e data
    }
}
