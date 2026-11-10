package Java.Constructor; // Declara que esta classe pertence ao pacote Java.Constructor

public class Retangulo { // Classe que representa um retângulo com altura e largura
    private double altura;  // Atributo privado: altura do retângulo
    private double largura; // Atributo privado: largura do retângulo

    // Construtor padrão (sem parâmetros): inicializa com valores padrão
    public Retangulo() {
        altura = 10; // Define a altura padrão como 10
        largura = 5; // Define a largura padrão como 5
    }

    // Construtor parametrizado: inicializa com os valores recebidos
    public Retangulo(double altura, double largura) {
        this.altura = altura;   // Atribui o valor recebido ao atributo altura
        this.largura = largura; // Atribui o valor recebido ao atributo largura
    }
}
