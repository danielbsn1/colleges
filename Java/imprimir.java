package Java; // Declara que esta classe pertence ao pacote Java

public class imprimir { // Representa um veículo com operações de impressão e venda
    String codVeiculo; // Código identificador do veículo
    String nome;       // Nome do veículo
    int ano;           // Ano do veículo

    // Imprime o nome do veículo no console
    public void imprimir() {
        System.out.print("Nome: " + nome);
    }

    // Simula a venda do veículo
    public void vender() {
        System.out.print("Veículo vendido");
    }
}
