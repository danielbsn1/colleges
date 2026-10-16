def busca_sequencial(l, v, n):
    """Busca sequencial (linear) pelo valor v na lista l.

    Parâmetros:
        l: lista onde a busca será feita.
        v: valor procurado.
        n: quantidade de elementos de l que serão verificados.

    Retorna:
        O índice da primeira ocorrência de v em l, ou None se não for encontrado.

    Complexidade de tempo: O(1) no melhor caso e O(N) no pior caso.
    Complexidade de espaço: O(1).
    """
    # Percorre as posições da lista, da primeira até a n-1
    for i in range(0, n):
        # Se o elemento da posição atual é o valor buscado, devolve o índice
        if l[i] == v:
            return i
    # Percorreu tudo e não encontrou o valor
    return None

# O melhor caso de execução ocorre quando o elemento buscado é o primeiro
# da lista, ou seja, o primeiro a ser verificado. Nesse caso, independentemente de
# se o tamanho da lista é N = 8 ou N = 1 bilhão, apenas uma iteração do algoritmo
# é executada. Assim, dizemos que a complexidade de tempo de melhor caso da
# busca sequencial é de ordem constante 1. Por outro lado, o pior caso de execução
# ocorre quando o elemento buscado não está contido na lista ou é o último da lista,
# pois, nesse caso, toda a lista é percorrida e o elemento não é encontrado. Dessa
# maneira, independentemente do tamanho da lista, o número de iterações do laço
# será N, resultando em uma complexidade de tempo de pior caso de ordem linear N.
# Portanto, podemos dizer que a busca sequencial possui complexidade de
# tempo constante no melhor caso e linear no pior caso. No que diz respeito
# à complexidade de espaço, precisamos analisar quanto de espaço extra, que
# não as entradas e saídas, que as chamadas da função utilizam. No caso da
# implementação da busca sequencial, o espaço extra utilizado é apenas o da
# variável de controle do laço, a variável i; sendo essa apenas uma variável
# e seu tamanho não aumentando com o incremento do tamanho da entrada,
# dizemos que a complexidade de espaço desse algoritmo é constante também

# Ordenaçao 2

def pg_iterativo(a, r, n):
    """Calcula o n-ésimo termo de uma progressão geométrica (PG).

    Parâmetros:
        a: primeiro termo da PG.
        r: razão da PG.
        n: posição do termo desejado (n = 1 devolve o próprio a).

    Retorna:
        O n-ésimo termo, dado pela fórmula a * r^(n-1).

    Complexidade de tempo: O(1) para operandos de tamanho fixo (uma única expressão, sem laço).
    Complexidade de espaço: O(1).
    """
    # Aplica a fórmula do termo geral da PG: an = a1 * r^(n-1)
    # (apesar do nome "soma", o valor calculado é um termo, não a soma dos termos)
    soma = a * r ** (n - 1)
    # Devolve o termo calculado
    return soma