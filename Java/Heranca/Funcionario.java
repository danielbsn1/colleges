package Java.Heranca; // Declara que esta classe pertence ao pacote Java.Heranca

import java.util.Date; // Importa a classe Date para representar datas

public class Funcionario extends Pessoa { // Funcionario herda de Pessoa, reaproveitando nome, cpf e data
    public double salario;    // Atributo público: salário do funcionário
    public Date dataAdmissao; // Atributo público: data em que o funcionário foi admitido
    public String cargo;      // Atributo público: cargo ocupado pelo funcionário

    // Construtor: repassa os dados recebidos para o construtor da superclasse Pessoa
    public Funcionario(String _nome, String _cpf, Date _data) {
        super(_nome, _cpf, _data); // Chama o construtor de Pessoa para inicializar nome, cpf e data
    }
}
