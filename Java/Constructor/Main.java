package Java.Constructor; // Declara que esta classe pertence ao pacote Java.Constructor

public class Main { // Classe principal que executa o programa
    public static void main(String[] args) { // Método main: ponto de entrada do programa
        Livro livro = new Livro("O Senhor dos Anéis", 59.90, "Um romance de fantasia épico", "J.R.R. Tolkien"); // Cria um objeto Livro com nome, preco, descricao e autor
        Eletronico eletronico = new Eletronico("Smartphone", 1999.99, "Um smartphone de última geração", "Samsung"); // Cria um objeto Eletronico com nome, preco, descricao e marca

        livro.exibirInformacoes();      // Chama exibirInformacoes() de Livro, que exibe os dados do produto e o autor
        eletronico.exibirInformacoes(); // Chama exibirInformacoes() de Eletronico, que exibe os dados do produto e a marca
    }
}
