package Java.Circulo; // Declara que esta classe pertence ao pacote Java.Circulo

public class Principal { // Ponto de entrada do programa, demonstra o uso da classe AreaCirculo
    public static void main(String[] args) {
        AreaCirculo c1 = new AreaCirculo(); // Cria o primeiro objeto da classe AreaCirculo
        c1.setRaio(3); // Define o raio como 3 e calcula a área automaticamente

        System.out.println("Área do círculo de c1 e: " + c1.getArea()); // Imprime a área de c1
        System.out.println("Valor de pi: " + c1.getPi()); // Imprime o valor de pi

        AreaCirculo c2 = new AreaCirculo(); // Cria o segundo objeto da classe AreaCirculo
        c2.setRaio(5); // Define o raio como 5 e calcula a área automaticamente

        System.out.println("Área do círculo de c2 e: " + c2.getArea()); // Imprime a área de c2
        System.out.println("Valor de pi: " + c2.getPi()); // Imprime o valor de pi
    }

}
