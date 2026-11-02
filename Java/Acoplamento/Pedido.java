package Java.Acoplamento; // Declara que esta classe pertence ao pacote Java.Acoplamento

public class Pedido { // Exemplo de alto acoplamento: cria as próprias dependências com new

    private Cliente cliente;                   // Dependência do cliente
    private Estoque estoque;                   // Dependência do estoque
    private NotificacaoService notificacaoService; // Dependência do serviço de notificação

    // Construtor: recebe apenas o cliente, mas cria Estoque e NotificacaoService internamente (alto acoplamento)
    public Pedido(Cliente cliente) {
        this.cliente = cliente;
        this.estoque = new Estoque();                     // Cria a dependência aqui dentro — alto acoplamento
        this.notificacaoService = new NotificacaoService(); // Cria a dependência aqui dentro — alto acoplamento
    }

    // Tenta adicionar um item ao pedido verificando disponibilidade no estoque
    public void adicionarItem(ItemPedido item) {
        if (estoque.verificarDisponibilidade(item.getProduto(), item.getQuantidade())) { // Se disponível
            estoque.atualizarEstoque(item.getProduto(), item.getQuantidade()); // Atualiza o estoque
            notificacaoService.enviarMensagem(cliente.getEmail(), "Item adicionado ao pedido."); // Notifica o cliente
        } else { // Se não disponível
            notificacaoService.enviarMensagem(cliente.getEmail(), "Item não disponível em estoque."); // Notifica o cliente
        }
    }
}
