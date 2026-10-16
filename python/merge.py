# Intercala dois subvetores ordenados de "lista":
#   subvetor1 = lista[esq..meio] e subvetor2 = lista[meio+1..dir]
# Ao final, lista[esq..dir] fica ordenada.
def merge(lista, esq, meio, dir):
    # Vetor auxiliar (memória extra) com dir-esq+1 posições para guardar a intercalação
    v = [Nome] * (dir-esq + 1)
    i = esq        # índice atual do subvetor1
    j = meio + 1   # índice atual do subvetor2
    k = 0          # índice atual do vetor auxiliar
    # Enquanto os dois subvetores ainda têm elementos, copia o menor para v
    while i <= meio and j <= dir:
        if lista[i] <= lista[j]:
            # O elemento do subvetor1 é menor ou igual: copia e avança em i
            v[k] = lista[i]
            i += 1
        else:
            # O elemento do subvetor2 é menor: copia e avança em j
            v[k] = lista[j]
            j += 1
        k += 1
    # Sobrou elemento no subvetor1: copia o restante para v
    while(i <= meio):
        v[k] = lista[i]
        i += 1
        k += 1
    # Sobrou elemento no subvetor2: copia o restante para v
    # (só um dos dois laços acima/abaixo executa, pois o outro subvetor já acabou)
    while(j <= dir):
        v[k] = lista[j]
        j += 1
        k += 1
    # Copia o resultado ordenado de volta para a posição original em lista
    for i in range(0, k):
        lista[esq + i] = v[i]

# No pseudocódigo da função merge, temos, como entrada, um vetor A,
# o qual possui diversos subvetores ordenados, que precisam ser combinados
# com objetivo de possuir todo o vetor ordenado. Em uma chamada da função
# merge, o objetivo é combinar dois subvetores ordenados em um vetor ordenado.
# A variável esq indica a posição inicial do subvetor1 e a meio indica a
# posição final do subvetor1. Assim, meio + 1 é o início do subvetor2 e dir
# é a posição final desse vetor.
# Analisando a complexidade, na linha 1, podemos ver uma alocação de
# memória extra, a qual não tem relação com a entrada do algoritmo. Esse vetor
# alocado possui (dir – esq + 1) posições, alocadas para armazenar o
# vetor ordenado após a intercalação. Esse vetor, na última chamada da função
# merge, tem tamanho de N posições. Isso resulta em uma complexidade de
# espaço de N para a função merge.
# No que diz respeito à complexidade de tempo, primeiramente temos que
# identificar os laços da função. Eles podem ser encontrados nas linhas 5, 13,
# 17 e 21. Nenhum dos laços encontra-se alinhado; logo, o desempenho do
# algoritmo será indicado pelo laço mais custoso. O laço da linha 5 possui
# complexidade N, pois, no pior caso, esse é o valor máximo que as variáveis
# meio + dir podem alcançar. O mesmo pode ocorrer nas linhas 13 e 17;
# porém, devido à característica do algoritmo, quando um dos laços executa,
# o outro não executará, de forma que teremos uma complexidade N apenas
# uma vez para esses dois laços. Por fim, o laço da linha 21 também executa N
# vezes; ou seja, a complexidade de tempo desse algoritmo é linear, isto é, N.
