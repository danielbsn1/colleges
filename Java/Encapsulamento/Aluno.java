package Java.Encapsulamento; // Declara que esta classe pertence ao pacote Java.Encapsulamento

public class Aluno { // Representa um aluno com matrícula, nome e CPF encapsulados
    private String codMatricula; // Atributo privado: código de matrícula do aluno
    private String nome;         // Atributo privado: nome do aluno
    private String cpf;          // Atributo privado: CPF do aluno

    // Construtor sem modificador de acesso (visível apenas dentro do pacote): inicializa os atributos
    Aluno(String tMat, String tNome, String tCpf) {
        codMatricula = tMat;  // Atribui o valor recebido ao atributo codMatricula
        nome = tNome;         // Atribui o valor recebido ao atributo nome
        cpf = tCpf;           // Atribui o valor recebido ao atributo cpf
    }

    // Getter: retorna o código de matrícula do aluno
    public String codMatricula() {
        return codMatricula;
    }

    // Getter: retorna o nome do aluno
    public String nome() {
        return nome;
    }

    // Getter: retorna o CPF do aluno
    public String cpf() {
        return cpf;
    }

}
