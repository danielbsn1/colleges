#include <iostream>  // Inclui a biblioteca padrão de entrada e saída
#include <cstdlib>   // Inclui a biblioteca para usar system("cls") e limpar a tela
using namespace std; // Permite usar cout e endl sem o prefixo std::

int main() // Função principal: ponto de entrada do programa
{
    int n1, n2, res; // Declara variáveis para as notas e o resultado
    char opc;        // Declara variável para armazenar a opção do usuário (S/N)

inicio: // Rótulo usado pelo goto para repetir o bloco

    system("cls"); // Limpa a tela (funciona no Windows)

    cout << "Digite o valor da Nota"; // Solicita a primeira nota
    cin >> n1;                        // Lê a primeira nota digitada pelo usuário
    cout << "Digite o valor da Nota"; // Solicita a segunda nota
    cin >> n2;                        // Lê a segunda nota digitada pelo usuário

    res = n1 + n2; // Soma as duas notas e armazena em res

    if (res >= 60) // Verifica se a soma é suficiente para aprovação
    {
        cout << "Aprovado"; // Imprime "Aprovado" se res >= 60
    }
    else if (res >= 40 && res < 60) // Verifica se está na faixa de recuperação
    {
        cout << "Recuperacao"; // Imprime "Recuperacao" se 40 <= res < 60
    }
    else // Caso nenhuma condição anterior seja verdadeira
    {
        cout << "Reprovado"; // Imprime "Reprovado" se res < 40
    }

    cout << "\nDeseja continuar? (S/N)"; // Pergunta se o usuário quer repetir
    cin >> opc;                          // Lê a opção digitada pelo usuário

    if (opc == 'S' || opc == 's') // Verifica se o usuário digitou S (maiúsculo ou minúsculo)
    {
        goto inicio; // Volta ao rótulo "inicio" para repetir o programa
    }
    else // Se o usuário não digitou S
    {
        cout << "Fim do Programa"; // Imprime mensagem de encerramento
    }

    return 0; // Indica que o programa terminou com sucesso
}
