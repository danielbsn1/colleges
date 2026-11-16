package Java.Interfaces; // Declara que esta classe pertence ao pacote Java.Interfaces

public class OperaçaoMatematica { // Classe que agrupa a interface e as implementações das operações matemáticas

    // Interface interna: define o contrato para qualquer operação matemática entre dois números
    public interface IOperacao {
        double calcular(double a, double b); // Método abstrato: recebe dois valores e retorna o resultado da operação
    }

    // Classe estática interna: implementa IOperacao realizando a soma de dois valores
    public static class Soma implements IOperacao {
        @Override // Implementa o método calcular() da interface IOperacao
        public double calcular(double a, double b) {
            return a + b; // Retorna a soma de a e b
        }
    }

    // Classe estática interna: implementa IOperacao realizando a subtração de dois valores
    public static class Subtracao implements IOperacao {
        @Override // Implementa o método calcular() da interface IOperacao
        public double calcular(double a, double b) {
            return a - b; // Retorna a subtração de a por b
        }
    }

    // Classe estática interna: implementa IOperacao realizando a multiplicação de dois valores
    public static class Multiplicacao implements IOperacao {
        @Override // Implementa o método calcular() da interface IOperacao
        public double calcular(double a, double b) {
            return a * b; // Retorna a multiplicação de a por b
        }
    }

    // Classe estática interna: implementa IOperacao realizando a divisão de dois valores
    public static class Divisao implements IOperacao {
        @Override // Implementa o método calcular() da interface IOperacao
        public double calcular(double a, double b) {
            if (b == 0) {
                throw new IllegalArgumentException("Divisão por zero não é permitida."); // Lança exceção se o divisor for zero
            }
            return a / b; // Retorna a divisão de a por b
        }
    }

    // Classe estática interna: executa qualquer operação que implemente IOperacao
    public static class Executavel {
        private IOperacao operacao; // Atributo privado: referência para a operação a ser executada

        // Construtor: recebe a operação que será executada
        public Executavel(IOperacao operacao) {
            this.operacao = operacao; // Atribui a operação recebida ao atributo operacao
        }

        // Método: executa a operação com os valores recebidos e retorna o resultado
        public double executar(double a, double b) {
            return operacao.calcular(a, b); // Delega o cálculo para a operação armazenada
        }
    }
}
