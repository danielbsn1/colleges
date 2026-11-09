package Java.Heranca; // Declara que esta classe pertence ao pacote Java.Heranca

import java.util.Date; // Importa a classe Date para representar datas

public class Professor extends Pessoa { // Professor herda de Pessoa, reaproveitando nome, cpf e data
    public double salario;    // Atributo público: salário do professor
    public String disciplina; // Atributo público: disciplina que o professor leciona

    // Construtor: repassa os dados recebidos para o construtor da superclasse Pessoa
    public Professor(String _nome, String _cpf, Date _data) {
        super(_nome, _cpf, _data); // Chama o construtor de Pessoa para inicializar nome, cpf e data
    }
}
