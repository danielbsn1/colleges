package Java; // Declara que esta classe pertence ao pacote Java

public class funcionario { // Define a classe pública funcionario

    private String nome;  // Atributo privado: só acessível dentro da classe
    private int idade;    // Atributo privado: só acessível dentro da classe

    // Construtor: chamado ao criar um objeto com new funcionario(...)
    public funcionario(String nome, int idade) {
        this.nome = nome;   // this.nome = atributo da classe; nome = parâmetro recebido
        this.idade = idade;
    }

    // Setter: permite alterar o nome de fora da classe
    public void setNome(String nome) {
        this.nome = nome;
    }

    // Getter: permite ler o nome de fora da classe
    public String getNome() {
        return nome;
    }

    // Setter: permite alterar a idade de fora da classe
    public void setIdade(int idade) {
        this.idade = idade;
    }

    // Getter: permite ler a idade de fora da classe
    public int getIdade() {
        return idade;
    }

    // Incrementa a idade em 1 (idade++ equivale a idade = idade + 1)
    public void fazerAniversario() {
        idade++;
    }

    // Ponto de entrada do programa; static = não precisa de objeto para ser chamado
    public static void main(String[] args){

        // Cria um objeto funcionario com nome "João" e idade 30
        funcionario funcionario1 = new funcionario("João", 30);

        System.out.println("Nome: " + funcionario1.getNome());   // Imprime o nome
        System.out.println("Idade: " + funcionario1.getIdade()); // Imprime a idade

        funcionario1.fazerAniversario(); // Incrementa a idade em 1
        System.out.println("Idade após aniversário: " + funcionario1.getIdade()); // Imprime nova idade
    }
}
