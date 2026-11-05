package Java.Encapsulamento; // Declara que esta classe pertence ao pacote Java.Encapsulamento

public class Conta { // Representa uma conta bancária com número, saldo e juros encapsulados
    private int numero;      // Atributo privado: número da conta
    private double saldo;    // Atributo privado: saldo atual da conta
    private double juros;    // Atributo privado: taxa de juros da conta

    // Getter: retorna a taxa de juros
    public double getJuros() {
        return juros;
    }

    // Getter: retorna o número da conta
    public int getNumero() {
        return numero;
    }

    // Getter: retorna o saldo atual
    public double getSaldo() {
        return saldo;
    }

    // Setter: define a taxa de juros
    public void setJuros(double juros) {
        this.juros = juros;
    }

    // Setter: define o número da conta
    public void setNumero(int numero) {
        this.numero = numero;
    }

    // Subtrai o valor do saldo (operação de débito); -= equivale a saldo = saldo - valor
    public void debito(double valor) {
        this.saldo -= valor;
    }

    // Adiciona o valor ao saldo (operação de crédito); += equivale a saldo = saldo + valor
    public void credito(double valor) {
        this.saldo += valor;
    }
}
