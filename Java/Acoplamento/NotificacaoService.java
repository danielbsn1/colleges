package Java.Acoplamento; // Declara que esta classe pertence ao pacote Java.Acoplamento

public class NotificacaoService { // Serviço de notificação usado em Pedido (alto acoplamento)

    // Envia uma mensagem para o email informado
    public void enviarMensagem(String email, String mensagem) {
        System.out.println("Notificação enviada para " + email + ": " + mensagem);
    }
}
