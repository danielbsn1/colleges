package Java.Interfaces; // Declara que esta classe pertence ao pacote Java.Interfaces

public class Animal { // Classe base que representa um animal com nome e idade
    private String nome; // Atributo privado: nome do animal
    private int idade;   // Atributo privado: idade do animal

    // Interface interna: define o contrato de alimentação para subclasses de Animal
    public interface Alimentacao {
        void alimentar(); // Método abstrato: toda classe que implementar esta interface deve definir alimentar()
    }

    // Construtor: inicializa nome e idade
    public Animal(String nome, int idade) {
        this.nome = nome;   // Atribui o valor recebido ao atributo nome
        this.idade = idade; // Atribui o valor recebido ao atributo idade
    }

    // Getter: retorna o nome do animal
    public String getNome() {
        return nome;
    }

    // Getter: retorna a idade do animal
    public int getIdade() {
        return idade;
    }
}
