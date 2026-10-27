package Java; // Declara que esta classe pertence ao pacote Java

public class Hospital1 { // Define a classe pública Hospital1
    private String nome;        // Atributo privado: nome do hospital
    private int capacidade;     // Atributo privado: quantidade de leitos
    private boolean possuiUTI;  // Atributo privado: true se tiver UTI, false se não tiver

    // Construtor: inicializa os três atributos ao criar um objeto Hospital1
    public Hospital1(String nome, int capacidade, boolean possuiUTI) {
        this.nome = nome;
        this.capacidade = capacidade;
        this.possuiUTI = possuiUTI;
    }

    // Recebe o nome de um paciente e imprime uma mensagem de atendimento
    public void realizaratendimento(String paciente) {
        System.out.println("Atendendo o paciente: " + paciente + " no hospital " + nome);
    }

    // Incrementa a capacidade em 1 e informa que um leito foi adicionado
    public void adicionarLeito() {
        capacidade++;
        System.out.println("Foi adicionado mais um leito no Hospital " + nome);
    }

    // Verifica se o hospital possui UTI e imprime a mensagem correspondente
    public void verificarDisponibilidadeUTI() {
        if (possuiUTI) { // se possuiUTI for true
            System.out.println("O hospital " + nome + " possui UTI");
        } else { // se possuiUTI for false
            System.out.println("O hospital " + nome + " não possui UTI");
        }
    }

    // Getter: retorna o nome do hospital
    public String getNome() {
        return nome;
    }

    // Setter: altera o nome do hospital
    public void setNome(String nome) {
        this.nome = nome;
    }

    // Getter: retorna a capacidade de leitos
    public int getCapacidade() {
        return capacidade;
    }

    // Setter: altera a capacidade de leitos
    public void setCapacidade(int capacidade) {
        this.capacidade = capacidade;
    }

    // Getter para boolean usa "is" por convenção em vez de "get"
    public boolean isPossuiUTI() {
        return possuiUTI;
    }

    // Setter: altera se o hospital possui UTI
    public void setPossuiUTI(boolean possuiUTI) {
        this.possuiUTI = possuiUTI;
    }
}
