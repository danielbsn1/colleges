#include <stdio.h>
#include <string.h>   // biblioteca com strcpy, strcat, strlen, strcmp

#define TAMAX 31      // 30 caracteres uteis + 1 posicao para o terminador '\0'
#define MAXIMO 20     // tamanho maximo do texto usado no exemplo de duplicacao

int main(){
    // ---------- 10.5.1 DECLARACAO ----------
    // em C string NAO eh tipo basico: eh um vetor de char terminado por '\0' (valor zero)
    char nome_do_atleta[TAMAX];           // cabe nome de ate 30 caracteres (+ o '\0')

    // ---------- 10.5.3 DECLARACAO COM INICIALIZACAO ----------
    char estado[20] = "Rio Grande do Sul";          // (a) tamanho explicito + texto; o '\0' eh colocado no fim
    char piaui[20] = {'P', 'i', 'a', 'u', 'i'};      // (b) tamanho explicito + caracteres; o resto vira '\0'
    char parana[] = "Parana";                        // (c) tamanho implicito: 6 letras + '\0' = 7 posicoes

    // ---------- 10.5.2 TAMANHO REAL DE UMA STRING ----------
    char ch2[] = "Teste";
    int i, cont;
    // o for roda enquanto ch2[i] for diferente de '\0' (zero = falso); o corpo eh vazio (;)
    // i avanca pelo vetor e cont conta quantos caracteres foram percorridos
    for (i = 0, cont = 0; ch2[i]; i++, cont++);
    printf("Tamanho de ch2: %d\n", cont);            // 5

    // ---------- 10.5.4 LEITURA COM scanf ----------
    // sem '&' na frente: o nome do vetor ja eh um endereco
    scanf("%s", estado);                             // %s para de ler no primeiro espaco em branco
    getchar();                                       // consome o '\n' que sobrou no buffer
    scanf("%[^\n]", estado);                         // %[^\n] le tudo ate o fim da linha (aceita espacos)
    getchar();                                       // consome o '\n' novamente
    scanf("%20[^\n]", estado);                       // le no maximo 20 caracteres ate o fim da linha
    getchar();

    // ---------- 10.5.5 ESCRITA ----------
    printf("\nNome do estado: %s\n", estado);        // %s escreve a string inteira ate o '\0'
    puts(estado);                                    // escreve a string e pula linha; igual a printf("%s\n", estado)

    // ---------- 10.5.6 PERCORRER COM PONTEIRO (string invertida) ----------
    char linha[100] = "abcdef";
    int comprimento;
    char *ptr;
    comprimento = strlen(linha) - 1;                 // indice da ultima letra (strlen nao conta o '\0')
    ptr = &linha[comprimento];                       // ptr aponta para a ultima letra
    while (ptr >= linha)                             // enquanto nao passar do endereco inicial do vetor
        putchar(*ptr--);                             // escreve o char apontado e depois recua o ponteiro
    putchar('\n');

    // ---------- strcpy ----------
    char origem[10] = "Ola", destino[10];
    // strcpy(destino, origem): copia origem (com '\0') para destino
    // destino precisa ter tamanho suficiente, senao invade outras areas de memoria
    strcpy(destino, origem);

    // ---------- strcat ----------
    char orig2[20] = " mundo", dest2[40] = "Ola";
    // strcat(destino, origem): anexa origem ao FINAL de destino, sem alterar origem
    strcat(dest2, orig2);                            // dest2 = "Ola mundo"

    // ---------- strlen ----------
    char primeiro[40];
    // strlen devolve o numero de caracteres sem contar o '\0'
    printf("\n%s tem comprimento %d\n", destino, (int) strlen(destino));

    // ---------- strcmp ----------
    char segundo[40] = "Maria";                      // inicializada na declaracao
    fgets(primeiro, sizeof(primeiro), stdin);        // le a linha (fgets nao ultrapassa o tamanho do vetor)
    // fgets guarda o '\n' no fim; se ele estiver la, troca por '\0' para nao atrapalhar a comparacao
    if (primeiro[strlen(primeiro) - 1] == '\n')
        primeiro[strlen(primeiro) - 1] = '\0';
    // strcmp: 0 se iguais; >0 se primeiro > segundo; <0 se primeiro < segundo (tabela ASCII)
    // "Maria" -> 0 | "maria" -> positivo (minuscula vem depois) | "Aaria" -> negativo
    printf("Resultado da comparacao de %s com %s: %d\n\n",
           primeiro, segundo, strcmp(primeiro, segundo));

    // ---------- FINALIZACAO MANUAL DE STRINGS ----------
    // quando nao se usa funcao que coloque o '\0', o programador deve colocar
    char entrada[MAXIMO + 1] = "Casa 10";            // texto original
    char dup[MAXIMO * 2 + 1];                        // pode dobrar de tamanho (+1 para o '\0')
    int j;
    for (i = 0, j = -1; entrada[i]; i++)             // percorre entrada ate o '\0'; j comeca em -1
    {
        j++;                                         // avanca uma posicao em dup
        dup[j] = entrada[i];                         // copia o caractere
        if ((entrada[i] >= 'a' && entrada[i] <= 'z') ||
            (entrada[i] >= 'A' && entrada[i] <= 'Z')) // se for letra...
        {
            j++;                                     // abre mais uma posicao
            dup[j] = entrada[i];                     // ...e copia de novo (letra duplicada)
        }
    }
    j++;                                             // posicao logo apos o ultimo caractere copiado
    dup[j] = '\0';                                   // marca de fim da string, colocada manualmente
    puts(dup);                                       // "CCaassaa 10"

    return 0;
}
