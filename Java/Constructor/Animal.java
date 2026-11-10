package Java.Constructor; // Declara que esta classe pertence ao pacote Java.Constructor

public class Animal { // Classe base (superclasse) que representa um animal genérico
    protected String nome; // Atributo protegido: nome do animal, acessível pelas subclasses

    // Método: exibe uma mensagem genérica de som do animal
    public void emitirSom() {
        System.out.println("Animal emite som"); // Imprime a mensagem no console
    }
}
