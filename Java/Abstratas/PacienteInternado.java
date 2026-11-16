package Java.Abstratas;

public class PacienteInternado extends Paciente { // Subclasse concreta que estende a classe abstrata Paciente

    private String quarto;
    private String enfermeiroResponsavel;

    public PacienteInternado(String nome, int idade, String sexo, String cpf, String telefone, String quarto,
            String enfermeiroResponsavel) {
        super(nome, idade, sexo, cpf, telefone);
        this.quarto = quarto;
        this.enfermeiroResponsavel = enfermeiroResponsavel;
    }

    @Override // Indica que este método implementa o método abstrato realizarExame() de Paciente
    public void realizarExame() {
        System.out.println("O paciente " + nome + " está sendo monitorado no quarto " + quarto + "."); // Exibe informações do paciente internado
    }
}
