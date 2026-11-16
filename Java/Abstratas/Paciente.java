package Java.Abstratas;

public abstract class Paciente { // Classe abstrata: não pode ser instanciada diretamente, serve como base para subclasses

    protected String nome;
    protected int idade;
    protected String sexo;
    protected String cpf;
    protected String telefone;

    public Paciente(String nome, int idade, String sexo,
            String cpf, String telefone) {
        this.nome = nome;
        this.idade = idade;
        this.sexo = sexo;
        this.cpf = cpf;
        this.telefone = telefone;
    }

    public abstract void realizarExame();
}
