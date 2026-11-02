package Java.Acoplamento; // Declara que esta classe pertence ao pacote Java.Acoplamento

public class ServicoEstoque { // Versão do serviço de estoque usada com baixo acoplamento em CarrinhosCompra

    // Verifica se um produto está disponível na quantidade solicitada; retorna true por padrão
    public boolean verificarDisponibilidade(String produto, int quantidade) {
        return true;
    }

    // Atualiza o estoque após a adição de um item ao carrinho
    public void atualizarEstoque(String produto, int quantidade) {
        System.out.println("Estoque atualizado: " + produto + " - quantidade: " + quantidade);
    }
}
