package Java.Interfaces; // Declara que esta classe pertence ao pacote Java.Interfaces

public class Tigre extends Animal implements Animal.Alimentacao { // Tigre herda de Animal e implementa a interface Alimentacao
    private int numeroDeListras; // Atributo privado: número de listras do tigre

    // Construtor: repassa nome e idade para Animal e inicializa numeroDeListras
    public Tigre(String nome, int idade, int numeroDeListras) {
        super(nome, idade);                    // Chama o construtor de Animal para inicializar nome e idade
        this.numeroDeListras = numeroDeListras; // Atribui o valor recebido ao atributo numeroDeListras
    }

    // Getter: retorna o número de listras do tigre
    public int getNumeroDeListras() {
        return numeroDeListras;
    }

    @Override // Implementa o método alimentar() da interface Animal.Alimentacao
    public void alimentar() {
        System.out.println("O tigre está sendo alimentado."); // Exibe a mensagem de alimentação do tigre
    }
}
