package Java.Constructor; // Declara que esta classe pertence ao pacote Java.Constructor

public class Gato extends Animal { // Gato herda de Animal, reaproveitando o atributo nome e o método emitirSom

    @Override // Indica que este método substitui o método emitirSom() da superclasse Animal
    public void emitirSom() {
        System.out.println("Gato emite som: Miau"); // Substitui o comportamento genérico pelo som específico do gato
    }
}
