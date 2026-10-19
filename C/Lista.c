#include <stdio.h>
#include <stdlib.h>   // biblioteca com malloc e free (alocacao dinamica de memoria)
#include <string.h>   // biblioteca com strcpy

// ---------- REGISTRO DO ALUNO ----------
// typedef cria um apelido: depois de pronto, usamos "Aluno" em vez de "struct ..."
typedef struct
{
    char nome[20];    // nome do aluno: ate 19 caracteres + 1 posicao para o '\0'
    float nota;       // nota do aluno
    int turma;        // numero da turma
} Aluno;

// ---------- NODO DA LISTA ENCADEADA ----------
// cada nodo guarda um aluno (o dado) e o endereco do proximo nodo (o apontador)
// "struct Nodo" precisa aparecer aqui porque o apelido "Nodo" ainda nao existe dentro da propria struct
typedef struct Nodo
{
    Aluno dado;           // informacao armazenada no nodo
    struct Nodo *prox;    // aponta para o proximo nodo; NULL quando for o ultimo
} Nodo;

int main(void)
{
    // ---------- CRIACAO DA LISTA ----------
    // malloc reserva na memoria o espaco de um Nodo e devolve o endereco dele
    Nodo *L = malloc(sizeof(Nodo)); // cabeça (sentinela): nodo fixo que NAO guarda aluno, so marca o inicio
    L->prox = NULL;                 // lista vazia: a cabeca nao aponta para ninguem ainda

    // ---------- INSERIR NO INICIO ----------
    Nodo *novo = malloc(sizeof(Nodo));   // cria o nodo que vai entrar na lista
    strcpy(novo->dado.nome, "Joao");     // copia o texto para o vetor (nao da para fazer nome = "Joao" em C)
    novo->prox = L->prox;                // o novo passa a apontar para quem era o primeiro (aqui, NULL)
    L->prox = novo;                      // a cabeca passa a apontar para o novo: ele eh o primeiro agora
    // a ORDEM importa: se fizesse L->prox = novo antes, perderia o endereco do antigo primeiro

    // ---------- INSERIR NO FIM ----------
    Nodo *fim = malloc(sizeof(Nodo));    // cria o nodo que vai para o final
    strcpy(fim->dado.nome, "Maria");     // copia o nome para o novo nodo
    fim->prox = NULL;                    // sera o ultimo, entao nao aponta para ninguem
    Nodo *no = L;                        // ponteiro auxiliar para percorrer, comeca na cabeca
    while (no->prox != NULL)             // enquanto nao chegou no ultimo nodo (o ultimo tem prox == NULL)
        no = no->prox;                   // avanca para o proximo nodo
    no->prox = fim;                      // o antigo ultimo passa a apontar para o novo: ele fecha a lista
    // custo: precisa percorrer a lista toda para achar o fim (por isso eh mais lento que no array)

    // ---------- IMPRIMIR ----------
    no = L->prox;                        // reaproveita o auxiliar, comecando no primeiro aluno (pula a cabeca)
    while (no != NULL)                   // repete ate passar do ultimo nodo
    {
        printf("%s\n", no->dado.nome);   // %s escreve o nome ate o '\0' (saida: Joao e depois Maria)
        no = no->prox;                   // anda para o proximo nodo
    }

    // ---------- LIBERAR A MEMORIA ----------
    // tudo que foi criado com malloc precisa de um free, senao ocorre vazamento de memoria
    Nodo *atual = L, *proxNodo;          // atual percorre a lista; proxNodo guarda o proximo antes do free
    while (atual != NULL)                // repete ate acabar a lista (inclui a cabeca)
    {
        proxNodo = atual->prox;          // guarda o endereco do proximo ANTES de apagar o atual
        free(atual);                     // devolve a memoria do nodo atual
        atual = proxNodo;                // segue para o proximo (usar atual->prox apos o free seria erro)
    }
    return 0;                            // 0 = programa terminou sem erro
}
