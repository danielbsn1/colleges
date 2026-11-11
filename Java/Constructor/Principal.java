package Java.Constructor; // Declara que esta classe pertence ao pacote Java.Constructor

public class Principal { // Classe principal que testa o polimorfismo com herança

    public static void main(String[] args) { // Método main: ponto de entrada do programa
        Animal a1 = new Animal();   // Cria um objeto Animal usando o tipo da superclasse
        Animal a2 = new Cachorro(); // Cria um Cachorro referenciado como Animal (polimorfismo)
        Animal a3 = new Gato();     // Cria um Gato referenciado como Animal (polimorfismo)

        a1.emitirSom(); // Chama o método emitirSom() da classe Animal
        a2.emitirSom(); // Chama o método emitirSom() sobrescrito na classe Cachorro
        a3.emitirSom(); // Chama o método emitirSom() sobrescrito na classe Gato
    }
}
