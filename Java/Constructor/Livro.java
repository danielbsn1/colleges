package Java.Constructor; // Declara que esta classe pertence ao pacote Java.Constructor

public class Livro extends Produto { // Livro herda de Produto, reaproveitando nome, preco e descricao
    private String autor; // Atributo privado: autor do livro

    // Construtor: repassa nome, preco e descricao para Produto e inicializa autor
    public Livro(String nome, double preco, String descricao, String autor) {
        super(nome, preco, descricao); // Chama o construtor de Produto para inicializar nome, preco e descricao
        this.autor = autor;            // Atribui o valor recebido ao atributo autor
    }

    @Override // Indica que este método substitui o exibirInformacoes() da superclasse Produto
    public void exibirInformacoes() {
        super.exibirInformacoes();             // Chama o método da superclasse para exibir nome, preco e descricao
        System.out.println("Autor: " + autor); // Exibe também o autor, que é exclusivo do Livro
    }
}
