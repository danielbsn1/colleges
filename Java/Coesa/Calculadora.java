package Java.Coesa; // Declara que esta classe pertence ao pacote Java.Coesa

public class Calculadora { // Exemplo de coesão: cada método tem uma única responsabilidade matemática

    // Retorna a soma de dois inteiros
    public int somar(int a, int b) {
        return a + b;
    }

    // Retorna a subtração de dois inteiros
    public int subtrair(int a, int b) {
        return a - b;
    }

    // Retorna a multiplicação de dois inteiros
    public int multiplicar(int a, int b) {
        return a * b;
    }

    // Retorna a divisão de dois inteiros como double; (double) converte o resultado para evitar divisão inteira
    public double dividir(int a, int b) {
        return (double) a / b;
    }
}
