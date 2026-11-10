package Java.Constructor; // Declara que esta classe pertence ao pacote Java.Constructor

public class Produto { // Classe base (superclasse) que representa um produto genérico
    protected String nome;      // Atributo protegido: nome do produto, acessível pelas subclasses
    protected double preco;     // Atributo protegido: preço do produto
    protected String descricao; // Atributo protegido: descrição do produto

    // Construtor: inicializa os três atributos do produto
    public Produto(String nome, double preco, String descricao) {
        this.nome = nome;           // Atribui o valor recebido ao atributo nome
        this.preco = preco;         // Atribui o valor recebido ao atributo preco
        this.descricao = descricao; // Atribui o valor recebido ao atributo descricao
    }

    // Método: exibe as informações do produto no console
    public void exibirInformacoes() {
        System.out.println("Nome: " + nome);           // Imprime o nome do produto
        System.out.println("Preço: " + preco);         // Imprime o preço do produto
        System.out.println("Descrição: " + descricao); // Imprime a descrição do produto
    }
}
