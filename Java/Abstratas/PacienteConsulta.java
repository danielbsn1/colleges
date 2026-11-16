package Java.Abstratas;

public class PacienteConsulta extends Paciente { // Subclasse concreta que estende a classe abstrata Paciente

    private String especialidade;
    private String medicoResponsavel;

    public PacienteConsulta(String nome, int idade, String sexo, String cpf, String telefone, String especialidade,
            String medicoResponsavel) {
        super(nome, idade, sexo, cpf, telefone);
        this.especialidade = especialidade;
        this.medicoResponsavel = medicoResponsavel;
    }

    @Override
    public void realizarExame() {
        System.out.println("O paciente " + nome + " está sendo atendido na consulta com a especialidade: "
                + especialidade + " e o médico responsável é: " + medicoResponsavel + ".");
    }

}
