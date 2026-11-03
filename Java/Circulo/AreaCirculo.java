package Java.Circulo; // Declara que esta classe pertence ao pacote Java.Circulo

public class AreaCirculo { // Representa um círculo e calcula sua área
    static private double pi = 3.14159; // Atributo estático: compartilhado entre todos os objetos, não muda
    private double raio; // Atributo privado: raio do círculo
    private double area; // Atributo privado: área calculada do círculo

    // Setter: define o raio e já calcula a área automaticamente (pi * r²)
    public void setRaio(double raio) {
        this.raio = raio;
        area = pi * (raio * raio); // Fórmula da área do círculo: π * r²
    }

    // Getter: retorna a área calculada
    public double getArea() {
        return area;
    }

    // Getter: retorna o valor de pi
    public double getPi() {
        return pi;
    }
}
