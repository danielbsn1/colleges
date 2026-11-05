#include <iostream> // Inclui a biblioteca padrão de entrada e saída
using namespace std; // Permite usar cout e endl sem o prefixo std::

int main() // Função principal: ponto de entrada do programa
{
    int idade = 20;      // Variável inteira: armazena a idade
    float altura = 1.80; // Variável de ponto flutuante: armazena a altura
    char sexo = 'M';     // Variável de caractere: armazena o sexo
    bool vivo = true;    // Variável booleana: armazena se está vivo (true/false)

    cout << idade << endl;  // Imprime a idade na tela
    cout << altura << endl; // Imprime a altura na tela
    cout << sexo << endl;   // Imprime o sexo na tela
    cout << vivo << endl;   // Imprime o valor booleano (1 para true)

    return 0; // Indica que o programa terminou com sucesso
}
