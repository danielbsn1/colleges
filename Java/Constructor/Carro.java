package Java.Constructor; // Declara que esta classe pertence ao pacote Java.Constructor

public class Carro { // Classe que representa um carro com modelo e marca
    private String modelo; // Atributo privado: modelo do carro
    private String marca;  // Atributo privado: marca do carro

    // Construtor padrão (sem parâmetros): inicializa com valores padrão
    public Carro() {
        marca = "Fiat"; // Define a marca padrão como Fiat
        modelo = "Uno"; // Define o modelo padrão como Uno
    }

    // Construtor parametrizado: inicializa com os valores recebidos
    public Carro(String marca, String modelo) {
        this.marca = marca;   // Atribui o valor recebido ao atributo marca
        this.modelo = modelo; // Atribui o valor recebido ao atributo modelo
    }

    Carro meuCarro = new Carro();                    // Cria um Carro usando o construtor padrão (Fiat Uno)
    Carro outroCarro = new Carro("Chevrolet", "Onix"); // Cria um Carro usando o construtor parametrizado
}
