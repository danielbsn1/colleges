package Java.Encapsulamento; // Declara que esta classe pertence ao pacote Java.Encapsulamento

public class Controle { // Ponto de entrada do programa, demonstra o uso da classe Imprimir

    public static void main(String[] args) {
        Imprimir i = new Imprimir(); // Cria um objeto da classe Imprimir

        i.imprimeTela(null, null); // Chama o método que abre as caixas de diálogo para coletar e exibir o nome
    }

}
