package Java; // Declara que esta classe pertence ao pacote Java

class Carro { // Representa um carro com marca e modelo
    private String marca;  // Atributo privado: marca do carro
    private String modelo; // Atributo privado: modelo do carro

    // Construtor: inicializa o carro com marca e modelo
    public Carro(String marca, String modelo) {
        this.marca = marca;
        this.modelo = modelo;
    }

    // Setter: altera a marca do carro
    public void setMarca(String marca) {
        this.marca = marca;
    }

    // Getter: retorna a marca do carro
    public String getMarca() {
        return marca;
    }

    // Setter: altera o modelo do carro
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    // Getter: retorna o modelo do carro
    public String getModelo() {
        return modelo;
    }

    // Simula o carro acelerando
    public void acelerar() {
        System.out.println("O carro está acelerando.");
    }

    // Simula o carro freando
    public void frear() {
        System.out.println("O carro está freando.");
    }

    // Ponto de entrada do programa
    public static void main(String[] args) {
        Carro carro1 = new Carro("Toyota", "Corolla"); // Cria um objeto Carro
        System.out.println("Marca: " + carro1.getMarca());   // Imprime a marca
        System.out.println("Modelo: " + carro1.getModelo()); // Imprime o modelo

        carro1.acelerar(); // Chama o método acelerar
        carro1.frear();    // Chama o método frear
    }
}
