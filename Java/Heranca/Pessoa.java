package Java.Heranca; // Declara que esta classe pertence ao pacote Java.Heranca

import java.util.Date; // Importa a classe Date para representar datas

public class Pessoa { // Classe base (superclasse) que representa uma pessoa genérica
    private String nome; // Atributo privado: nome da pessoa
    private String cpf;  // Atributo privado: CPF da pessoa
    private Date data;   // Atributo privado: data de nascimento da pessoa

    // Construtor: inicializa os três atributos da pessoa
    public Pessoa(String _nome, String _cpf, Date _data) {
        this.nome = _nome; // Atribui o valor recebido ao atributo nome
        this.cpf = _cpf;   // Atribui o valor recebido ao atributo cpf
        this.data = _data; // Atribui o valor recebido ao atributo data
    }
}
