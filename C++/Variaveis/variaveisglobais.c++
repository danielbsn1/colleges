#include <iostream> // Inclui a biblioteca padrão de entrada e saída
using namespace std; // Permite usar cout e endl sem o prefixo std::

int n1, n2; // Variáveis globais: acessíveis em qualquer função do programa

int main() // Função principal: ponto de entrada do programa
{
    int n3, n4; // Variáveis locais: existem apenas dentro do main
    int res;    // Variável local: armazena o resultado da soma

    n1 = 11; // Atribui 11 à variável global n1
    n2 = 3;  // Atribui 3 à variável global n2
    n3 = 5;  // Atribui 5 à variável local n3
    n4 = 2;  // Atribui 2 à variável local n4
    res = n1 + n2 + n3 + n4; // Soma todas as variáveis e armazena em res

    cout << "Soma de todas as variaveis: " << res << endl; // Imprime o resultado na tela

    return 0; // Indica que o programa terminou com sucesso
}
