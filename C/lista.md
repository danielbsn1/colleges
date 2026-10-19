# Lista sequencial (array) x Lista encadeada

| Aspecto | Lista sequencial (array) | Lista encadeada |
|---------|--------------------------|-----------------|
| **Pesquisa pela posição** | Rápida, com acesso direto ao item por meio do índice do array. O tempo de busca é constante, independentemente do tamanho da lista. | Mais lenta porque é sequencial, sempre partindo do primeiro elemento da lista. O tempo de busca considera a posição do elemento a ser buscado e o tamanho da lista. |
| **Pesquisa por conteúdo** | Não usa o índice do array. Precisa percorrer a lista sequencialmente até encontrar o item cujo conteúdo é igual ao pesquisado. | Desempenho semelhante, porque também precisa percorrer a lista sequencialmente, desde a primeira posição até encontrar o item pesquisado. |
| **Inserção no meio da lista** | Mais lenta, porque precisa reposicionar os itens à direita do elemento inserido. | Mais rápida, porque modifica os apontadores de apenas dois itens: o anterior e o posterior ao item inserido. |
| **Inserção no final da lista** | Mais rápida, porque acessa diretamente a próxima posição livre por meio do índice do array. | Um pouco mais custosa, porque precisa percorrer toda a lista até chegar à última posição antes de inserir. |
| **Exclusão no meio da lista** | Mais lenta, porque precisa reposicionar os itens à direita do elemento excluído. | Mais rápida, porque modifica os apontadores de apenas dois itens: o anterior e o posterior ao item excluído. |
| **Exclusão no final da lista** | Rápida, porque acessa diretamente a última posição por meio do índice do array. | Um pouco mais lenta, porque precisa percorrer toda a lista até chegar à última posição antes de excluir. |
| **Tamanho da lista** | Limitado e definido no momento da declaração. Pode não ocupar todas as posições reservadas e consumir memória sem necessidade. | O limite é o tamanho da memória livre no equipamento. Consome apenas o necessário para acomodar os itens e aloca ou libera conforme a lista cresce ou diminui. |
| **Indicação de uso** | Listas pequenas, com quantidade limitada de itens, cujas inserções/exclusões são raras e ocorrem normalmente no final da lista. | Listas grandes, sem limite definido de itens, que tendem a receber mais inserções/exclusões de elementos. |
