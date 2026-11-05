#include <iostream> // Inclui a biblioteca padrão de entrada e saída
using namespace std; // Permite usar cout e endl sem o prefixo std::

int main() // Função principal: ponto de entrada do programa
{
    int num = 10; // Declara e inicializa a variável inteira num com 10

    cout << "Valor de num: " << num << endl; // Imprime o valor original de num

    num = -num; // Inverte o sinal de num (positivo vira negativo e vice-versa)

    cout << "Valor de num: " << num << endl; // Imprime o valor após a inversão

    return 0; // Indica que o programa terminou com sucesso
}
