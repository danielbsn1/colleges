package Java.Acoplamento; // Declara que esta classe pertence ao pacote Java.Acoplamento

public class Cliente { // Representa um cliente do sistema

    private String nome;  // Atributo privado: nome do cliente
    private String email; // Atributo privado: email do cliente

    // Construtor: inicializa o cliente com nome e email
    public Cliente(String nome, String email) {
        this.nome = nome;
        this.email = email;
    }

    // Getter: retorna o nome do cliente
    public String getNome() {
        return nome;
    }

    // Getter: retorna o email do cliente
    public String getEmail() {
        return email;
    }
}
