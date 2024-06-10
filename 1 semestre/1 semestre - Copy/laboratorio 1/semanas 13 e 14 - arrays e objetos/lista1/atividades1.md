# Exercícios Banca de Churros

## Questão 1
Crie uma classe chamada **Churro**, com os atributos sabor e preço. Crie 3 construtores (como preferir), métodos de acesso e o método toString.

## Questão 2
Crie uma classe chamada **BancaDeChurros**. Esta classe possui um array de Churro. Crie 2 construtores para a classe: 1 que recebe o array de churros preenchido e outro que apenas recebe a quantidade máxima de churros, instanciando o array com este tamanho no construtor. Nesta classe, crie os métodos solicitados abaixo:
- **estoqueChurros:** este método recebe uma String sabor e retorna a quantidade de churros daquele sabor estão presentes no array.
- **insereChurro:** este método recebe um objeto do tipo Churro por parâmetro e insere este objeto na primeira posição livre do array (ou seja, com null). O método retorna verdadeiro caso insira o churro ou falso caso contrário.
- **valorTotal:** este método retorna o preço total dos churros no array.
- **vendeChurros:** este método recebe uma String sabor e vende um churro daquele sabor, retirando-o do array. O método imprimir o valor da compra e retornar verdadeiro caso o churro tenha sido vendido. Caso não exista churros daquele sabor, imprima uma mensagem informativa e retorne falso.
- **imprimeChurros:** este método imprime as informações de todos os churros do array (um churro em cada linha).
- **lePedidos:** este método recebe uma String nome (que apenas representa o nome da pessoa que está comprando os churros), uma String sabor e um inteiro quantidade. Este método deve tentar vender a quantidade de churros solicitada do sabor informado, informando sucesso ou insucesso a cada venda. 

## Questão 3
Crie a classe Principal e nela coloque o método main. No main, chame todos os métodos criados na Questão 2. 