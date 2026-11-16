package Java.Interfaces; // Declara que esta classe pertence ao pacote Java.Interfaces

public class Funcionario { // Classe que agrupa a interface e a implementação de reajuste salarial

    // Interface interna: define o contrato de reajuste salarial
    public interface IReajuste {
        double reajuste(); // Método abstrato: toda classe que implementar esta interface deve calcular o reajuste
    }

    // Classe estática interna: implementa a interface IReajuste para funcionários
    public static class ReajusteFuncionario implements IReajuste {
        private String nome;    // Atributo privado: nome do funcionário
        private double salario; // Atributo privado: salário atual do funcionário

        // Construtor: inicializa nome e salario
        public ReajusteFuncionario(String nome, double salario) {
            this.nome = nome;       // Atribui o valor recebido ao atributo nome
            this.salario = salario; // Atribui o valor recebido ao atributo salario
        }

        // Getter: retorna o nome do funcionário
        public String getNome() {
            return nome;
        }

        // Setter: define o nome do funcionário
        public void setNome(String nome) {
            this.nome = nome;
        }

        // Getter: retorna o salário atual do funcionário
        public double getSalario() {
            return salario;
        }

        // Setter: define o salário do funcionário
        public void setSalario(double salario) {
            this.salario = salario;
        }

        @Override // Implementa o método reajuste() da interface IReajuste
        public double reajuste() {
            return salario * 1.1; // Calcula e retorna o salário com reajuste de 10%
        }
    }
}
