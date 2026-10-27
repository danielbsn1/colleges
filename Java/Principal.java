package Java; // Declara que esta classe pertence ao pacote Java

public class Principal {
    public static void main(String[] args) {
        media calculadora = new media(); // Cria um objeto da classe media

        calculadora.calculaMedia(8.0, 7.5); // Chama o método para calcular a média
        double resultado = calculadora.retornaMedia(); // Obtém a média calculada

        System.out.println("A média das notas é: " + resultado); // Imprime o resultado
    }

}
