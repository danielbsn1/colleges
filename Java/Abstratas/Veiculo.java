package Java.Abstratas;

public class Veiculo {
    private String cor = "Preto";
    private int qtdPessoas = 5;

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public int getQtdPessoas() {
        return qtdPessoas;
    }

    public void setQtdPessoas(int qtdPessoas) {
        this.qtdPessoas = qtdPessoas;
    }

    public void setWtdPessoas(int qtdPessoas) {
        this.qtdPessoas = qtdPessoas;
    }

    public void ligar() {
        System.out.println("Ligando o veículo");
    }

    public void transportar() {
        System.out.println("Transportando pessoas");
    }

    public void desligar() {
        System.out.println("Desligando o veículo");
    }
}
