Pontifícia Universidade Católica do Paraná -- Engenharia de Software --
Resolução de Problemas Estruturados em Computação -- Prof Marina de Lara --
PJBL2 -- Árvore Binária de Busca --
Diogo Negrelli, Gabriel Ribeiro, José Mussy.


1. Composto pelas classes Nó e Árvore, a qual possui apenas um atributo do tipo Nó, que é a raíz da árvore,
  sendo esta a chave para manipular os dados corretamente.

2. A classe Nó segue os princípios de encapsulamento, e a classe Árvore é do tipo public.
   
3. O projeto baseia-se em 3 funções principais: insertValue();, removeValue(): & searchValue();, sendo que o último
possui chamada para outra função recursiva de busca: searchRecursive():

4. Todos os métodos utilizam recursão, com exceção da inserção que implementa um loop While.

5. A remoção trata os seguinte casos para o nó a ser removido:
       1- Nó folha.
       2 - Nó com um filho.
       3 - Nó com 2 filhos.
       No caso de nó com 2 filhos, ele se utiliza do método min(); que serve para encontrar
       o menor valor a direita do nó que será removido para realizar a susbtituição. 
[PJBL 2](Images/img.png)


