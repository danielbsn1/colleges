package Java.Abstratas;

public class PacienteEmergencia extends Paciente { // Subclasse concreta que estende a classe abstrata Paciente

    private String sintoma;

    public PacienteEmergencia(String nome, int idade, String sexo, String cpf, String telefone, String sintoma) {
        super(nome, idade, sexo, cpf, telefone);
        this.sintoma = sintoma;
    }

    @Override
    public void realizarExame() {
        System.out.println("O paciente " + nome + " está sendo atendido na emergência com o sintoma: " + sintoma + ".");
    }

}
