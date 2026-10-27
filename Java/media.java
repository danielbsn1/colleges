package Java;

public class media {
    private double nota1; // Atributo privado: primeira nota
    private double nota2; // Atributo privado: segunda nota
    private double media; // Atributo privado: média das notas

    public void calculaMedia(double nota1, double nota2) { // Método público para calcular a média
        this.nota1 = nota1; // Atribui o valor da primeira nota ao atributo nota1
        this.nota2 = nota2; // Atribui o valor da segunda nota ao atributo nota2
        this.media = (nota1 + nota2) / 2; // Calcula a média e armazena no atributo media
    }

    public double retornaMedia() { // Método público para retornar a média calculada
        return media; // Retorna o valor do atributo media
    }

}
