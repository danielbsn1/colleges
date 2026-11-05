package Java.Encapsulamento; // Declara que esta classe pertence ao pacote Java.Encapsulamento

import javax.swing.JOptionPane; // Importa JOptionPane para exibir caixas de diálogo gráficas

public class Imprimir { // Representa uma classe que coleta e exibe nome via interface gráfica
    private String nome;      // Atributo privado: nome da pessoa
    private String sobrenome; // Atributo privado: sobrenome da pessoa

    // Método que coleta nome e sobrenome via caixas de diálogo e exibe o resultado
    public void imprimeTela(String nome, String sobrenome) {
        nome = JOptionPane.showInputDialog("Digite o nome: ");      // Abre uma caixa de diálogo e armazena o nome digitado
        sobrenome = JOptionPane.showInputDialog("Digite o sobrenome: "); // Abre uma caixa de diálogo e armazena o sobrenome digitado

        this.nome = nome;           // Atribui o valor recebido ao atributo da classe
        this.sobrenome = sobrenome; // Atribui o valor recebido ao atributo da classe

        JOptionPane.showMessageDialog(null, this.nome + " " + this.sobrenome); // Exibe o nome completo em uma caixa de mensagem
    }
}
