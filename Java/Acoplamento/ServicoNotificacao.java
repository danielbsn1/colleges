package Java.Acoplamento; // Declara que esta classe pertence ao pacote Java.Acoplamento

public class ServicoNotificacao { // Versão do serviço de notificação usada com baixo acoplamento em CarrinhosCompra

    // Envia uma mensagem de notificação (sem precisar de email, diferente de NotificacaoService)
    public void enviarMensagem(String mensagem) {
        System.out.println("Notificação: " + mensagem);
    }
}
