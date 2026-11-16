package Java.Interfaces; // Declara que esta classe pertence ao pacote Java.Interfaces

import java.util.Scanner; // Importa a classe Scanner para leitura de dados (disponível para uso futuro)

public class Programa { // Classe principal que testa o reajuste salarial do funcionário
    public static void main(String[] args) { // Método main: ponto de entrada do programa

        Funcionario.ReajusteFuncionario funcionario = new Funcionario.ReajusteFuncionario("João", 2000.0); // Cria um funcionário com nome e salário inicial
        System.out.println("Nome: " + funcionario.getNome());                    // Exibe o nome do funcionário
        System.out.println("Salário atual: " + funcionario.getSalario());        // Exibe o salário antes do reajuste
        System.out.println("Salário após reajuste: " + funcionario.reajuste());  // Exibe o salário calculado com reajuste de 10%

        funcionario.reajuste(); // Calcula o reajuste (resultado não armazenado)

        System.out.println("\nDepois do reajuste:");                          // Imprime uma linha em branco e o título
        System.out.println("Nome: " + funcionario.getNome());                 // Exibe o nome do funcionário novamente
        System.out.println("Salário atual: " + funcionario.getSalario());     // Exibe o salário atual do funcionário
        funcionario.reajuste(); // Calcula o reajuste novamente (resultado não armazenado)
    }
}
