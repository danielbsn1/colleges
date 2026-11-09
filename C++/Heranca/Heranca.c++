#include <iostream> // Inclui a biblioteca padrão de entrada e saída
using namespace std; // Permite usar cout e string sem o prefixo std::

// Classe base (superclasse): representa uma pessoa genérica
class Pessoa {
public:
    string nome; // Atributo: nome da pessoa
    int idade;   // Atributo: idade da pessoa

    // Construtor: inicializa nome e idade
    Pessoa(string nome, int idade) {
        this->nome = nome;   // Atribui o valor recebido ao atributo nome
        this->idade = idade; // Atribui o valor recebido ao atributo idade
    }
};

// Classe derivada: Aluno herda de Pessoa, reaproveitando nome e idade
class Aluno : public Pessoa {
public:
    string matricula; // Atributo próprio do Aluno

    // Construtor: repassa nome e idade para Pessoa e inicializa matricula
    Aluno(string nome, int idade, string matricula) : Pessoa(nome, idade) {
        this->matricula = matricula; // Atribui o valor recebido ao atributo matricula
    }
};

// Classe derivada: Professor herda de Pessoa, reaproveitando nome e idade
class Professor : public Pessoa {
public:
    string disciplina; // Atributo próprio do Professor
    double salario;    // Atributo próprio do Professor

    // Construtor: repassa nome e idade para Pessoa e inicializa disciplina e salario
    Professor(string nome, int idade, string disciplina, double salario) : Pessoa(nome, idade) {
        this->disciplina = disciplina; // Atribui o valor recebido ao atributo disciplina
        this->salario = salario;       // Atribui o valor recebido ao atributo salario
    }
};

int main() {
    Aluno a("Daniel", 20, "2024001");           // Cria um objeto Aluno
    Professor p("Carlos", 40, "Algoritmos", 5000.0); // Cria um objeto Professor

    // Exibe os dados do Aluno (nome e idade vêm de Pessoa via herança)
    cout << "Aluno: " << a.nome << ", Idade: " << a.idade << ", Matricula: " << a.matricula << endl;

    // Exibe os dados do Professor
    cout << "Professor: " << p.nome << ", Disciplina: " << p.disciplina << ", Salario: " << p.salario << endl;

    return 0; // Indica que o programa terminou com sucesso
}
