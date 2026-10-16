#include <stdio.h>
#include <stdlib.h>

// Definição da estrutura de um nó da árvore binária
struct no{
    int info;
    struct no *esq, *dir;
};

typedef struct no* arvBin;

int main(){
    arvBin* raiz; // Ponteiro para arvBin que ja e um ponteiro, ou seja, ponteiro de ponteiro
    return 0;
}

arvBin* criaArvore(){
    arvBin* raiz = (arvBin*) malloc(sizeof(arvBin));
    if(raiz != NULL)
        *raiz = NULL;
    return raiz;
// é criado o ponteiro para arvBin, raiz (que irá apontar para
// a raiz da árvore); na mesma linha, alocamos dinamicamente, utilizando malloc, um espaço
// de memória formatado, ou seja, do tamanho e com os campos de arvBin;
//  se tudo deu certo e como estamos criando a árvore, ou seja, não temos
// nenhum filho por enquanto, o ponteiro raiz aponta para NULL;
//  e retornamos esse endereço para quem invocou essa função.
}

void liberaNo(struct no* no){
    if(no != NULL){
        liberaNo(no->esq);
        liberaNo(no->dir);
        free(no);
        no = NULL;
    }
}

void liberaArvBin(arvBin* raiz){
    if(raiz == NULL)
        return;
    liberaNo(*raiz);
    free(raiz);
    //A representação de árvore binária, bem como as implementações das funções utilizadas
    //aqui, são exemplos de como podemos implementar uma árvore binária computacionalmente, não sendo essa a única forma existente.
}

int alturaArvBin(arvBin* raiz){
    if(raiz == NULL || *raiz == NULL)
        return 0;
    int altEsq = alturaArvBin(&((*raiz)->esq));
    int altDir = alturaArvBin(&((*raiz)->dir));
    if(altEsq > altDir)
        return (altEsq + 1);
    else
        return (altDir + 1);

//  ele é executado até encontrar um nó-folha, começando pelo lado
// esquerdo.
//  a altura de um nó-folha será 1, pois altesq é igual à altdir, que é igual
// a 0, assim, um nó folha terá altura 1.
//  feito isso, ele vai voltando recursivamente e calculando a altura da
// subárvore da direita e da esquerda.
//  de posse desses dois valores, ele compara. O valor da altura do nó pai
// será o maior entre os filhos mais 1.
}


int insereArvBin(arvBin* raiz, int valor){
    if(raiz == NULL)
        return 0;
    struct no* novo;
    novo = (struct no*) malloc(sizeof(struct no));
    if(novo == NULL)
        return 0;
    novo->info = valor;
    novo->dir = NULL;
    novo->esq = NULL;
    if(*raiz == NULL) // árvore vazia
        *raiz = novo; // o ponteiro raiz aponta para o nó criado
    else{
        struct no* atual = *raiz;
        struct no* ant = NULL;
        while(atual != NULL){
            ant = atual;
            if(valor == atual->info){
                free(novo);
                return 0; // valor já existe
            }
            if(valor > atual->info)
                atual = atual->dir;
            else
                atual = atual->esq;
        }
        if(valor > ant->info)
            ant->dir = novo;
        else
            ant->esq = novo;
    }
    return 1; // inserção bem sucedida
}

int insereArvBinRec(arvBin* raiz, int valor){
   if(raiz == NULL)
        return 0;
    struct no* novo;
    novo = (struct no*) malloc(sizeof(struct no));
    if(novo == NULL)
        return 0;
    novo->info = valor;
    novo->dir = NULL;
    novo->esq = NULL;
    if(*raiz == NULL) // árvore vazia
        *raiz = novo; // o ponteiro raiz aponta para o nó criado
    else{
        struct no* atual = *raiz;
        struct no* ant = NULL;
    while(atual != NULL){
            ant = atual;
            if(valor == atual->info){
                free(novo);
                return 0; // valor já existe
            }
            if(valor > atual->info)
                atual = atual->dir;
            else
                atual = atual->esq;
        }
        if(valor > ant->info)
            ant->dir = novo;
        else
            ant->esq = novo;
    }
    return 1; // inserção bem sucedida
}