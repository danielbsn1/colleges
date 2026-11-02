package Java.Acoplamento; // Declara que esta classe pertence ao pacote Java.Acoplamento

public class ItemPedido { // Representa um item dentro de um pedido ou carrinho

    private String produto;  // Atributo privado: nome do produto
    private int quantidade;  // Atributo privado: quantidade do produto

    // Construtor: inicializa o item com produto e quantidade
    public ItemPedido(String produto, int quantidade) {
        this.produto = produto;
        this.quantidade = quantidade;
    }

    // Getter: retorna o nome do produto
    public String getProduto() {
        return produto;
    }

    // Getter: retorna a quantidade do produto
    public int getQuantidade() {
        return quantidade;
    }
}
