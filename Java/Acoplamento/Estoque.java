package Java.Acoplamento; // Declara que esta classe pertence ao pacote Java.Acoplamento

public class Estoque { // Gerencia a disponibilidade e atualização do estoque (alto acoplamento: usada diretamente em Pedido)

    // Verifica se um produto está disponível na quantidade solicitada; retorna true por padrão
    public boolean verificarDisponibilidade(String produto, int quantidade) {
        return true;
    }

    // Atualiza o estoque após a adição de um item ao pedido
    public void atualizarEstoque(String produto, int quantidade) {
        System.out.println("Estoque atualizado: " + produto + " - quantidade: " + quantidade);
    }
}
