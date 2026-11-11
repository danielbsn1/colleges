package Java.Constructor; // Declara que esta classe pertence ao pacote Java.Constructor

public class Cachorro extends Animal { // Cachorro herda de Animal, reaproveitando o atributo nome e o método emitirSom
    @Override // Indica que este método substitui o método emitirSom() da superclasse Animal
    public void emitirSom() {
        System.out.println("Cachorro emite som: Au Au"); // Substitui o comportamento genérico pelo som específico do
                                                         // cachorro
    }
}
