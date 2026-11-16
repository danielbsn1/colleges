package Java.Abstratas; // Declara que esta classe pertence ao pacote Java.Abstratas

public class SistemaHospital { // Classe principal que testa o sistema hospitalar

    public static void main(String[] args) { // Método main: ponto de entrada do programa
        PacienteInternado paciente1 = new PacienteInternado("Maria Julia Souto", 27, "Feminino",
                "123456789", "999999999", "101", "Maria Santos"); // Cria um paciente internado

        PacienteEmergencia paciente2 = new PacienteEmergencia("Renato Bacelar Souza", 72, "Masculino",
                "987654321", "888888888", "dor de cabeça"); // Cria um paciente de emergência

        PacienteConsulta paciente3 = new PacienteConsulta("Reinaldo Sampaio", 60, "Masculino",
                "567891234", "777777777", "Cardiologia", "Janice Alves"); // Cria um paciente de consulta

        paciente1.realizarExame(); // Chama o método realizarExame() implementado em PacienteInternado
        paciente2.realizarExame(); // Chama o método realizarExame() implementado em PacienteEmergencia
        paciente3.realizarExame(); // Chama o método realizarExame() implementado em PacienteConsulta
    }
}
