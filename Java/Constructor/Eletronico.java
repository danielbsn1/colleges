package Java.Constructor; // Declara que esta classe pertence ao pacote Java.Constructor

public class Eletronico extends Produto { // Eletronico herda de Produto, reaproveitando nome, preco e descricao
    private String marca; // Atributo privado: marca do eletrônico

    // Construtor: repassa nome, preco e descricao para Produto e inicializa marca
    public Eletronico(String nome, double preco, String descricao, String marca) {
        super(nome, preco, descricao); // Chama o construtor de Produto para inicializar nome, preco e descricao
        this.marca = marca;            // Atribui o valor recebido ao atributo marca
    }

    @Override // Indica que este método substitui o exibirInformacoes() da superclasse Produto
    public void exibirInformacoes() {
        super.exibirInformacoes();             // Chama o método da superclasse para exibir nome, preco e descricao
        System.out.println("Marca: " + marca); // Exibe também a marca, que é exclusiva do Eletronico
    }
}
