# Soma dois vetores A e B, ambos de tamanho N, elemento a elemento.
def soma_vetores(A, B, N):
    # Laço que percorre os N elementos dos vetores (índices 0 até N-1)
    for i in range (o, N):
        # Soma os elementos de mesma posição e guarda no vetor resultado
        c[i] = A[i] + B[i]
        # Devolve o vetor resultado
        return C

# Nesse algoritmo, temos, na linha 1, um laço de repetição que percorre
# os N elementos do vetor. Na complexidade de tempo, dizemos que esse laço
# tem custo linear, ou seja, custo N. As operações na linha 2 são alinhadas
# ao laço para da linha 1; ou seja, em cada iteração, elas serão executadas
# uma vez. Visto que o número de operações da linha 2, em cada iteração,
# não cresce com o aumento do valor N e que o custo dessas operações é
# menor que o custo das N iterações, dizemos que a linha 2 tem um custo
# constante. Dessa maneira, esse algoritmo tem uma complexidade de tempo
# N. Já a complexidade de espaço desse algoritmo se refere à quantidade
# de memória extra que não diz respeito à entrada e à saída do algoritmo.
# Nesse caso, não existe uso de memória extra, então a complexidade de
# espaço é constante, ou seja, 1.
