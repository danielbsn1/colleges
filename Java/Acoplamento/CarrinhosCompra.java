package Java.Acoplamento; // Declara que esta classe pertence ao pacote Java.Acoplamento

import java.util.ArrayList; // Importa ArrayList para criar a lista de itens
import java.util.List;      // Importa a interface List

public class CarrinhosCompra { // Exemplo de baixo acoplamento: dependências injetadas pelo construtor

    private List<ItemPedido> itens;           // Lista de itens adicionados ao carrinho
    private ServicoEstoque servicoEstoque;    // Dependência do serviço de estoque
    private ServicoNotificacao servicoNotificacao; // Dependência do serviço de notificação

    // Construtor com injeção de dependência: recebe as dependências de fora em vez de criá-las aqui
    public CarrinhosCompra(ServicoEstoque servicoEstoque, ServicoNotificacao servicoNotificacao) {
        this.itens = new ArrayList<>();            // Inicializa a lista vazia
        this.servicoEstoque = servicoEstoque;      // Armazena a dependência recebida
        this.servicoNotificacao = servicoNotificacao; // Armazena a dependência recebida
    }

    // Tenta adicionar um item ao carrinho verificando disponibilidade no estoque
    public void adicionarItem(ItemPedido item) {
        if (servicoEstoque.verificarDisponibilidade(item.getProduto(), item.getQuantidade())) { // Se o produto estiver disponível
            itens.add(item); // Adiciona o item à lista
            servicoEstoque.atualizarEstoque(item.getProduto(), item.getQuantidade()); // Atualiza o estoque
            servicoNotificacao.enviarMensagem("Item adicionado ao carrinho."); // Notifica o sucesso
        } else { // Se o produto não estiver disponível
            servicoNotificacao.enviarMensagem("Item não disponível em estoque."); // Notifica a indisponibilidade
        }
    }

}
