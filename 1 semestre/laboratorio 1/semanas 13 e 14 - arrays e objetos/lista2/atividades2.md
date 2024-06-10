# Exercícios Biblioteca

## Questão 1
Crie a classe **Livro**, com titulo, autor, preço e ano de criação, com os construtores e métodos necessários. Crie o método toString.

## Questão 2
Crie a classe **Antigo**, que é um tipo de livro e possui um número de edição. Crie os construtores e métodos necessários. Crie o método toString.

## Questão 3
Crie a classe **Novo**, que é um tipo de livro e possui um valor de desconto. Crie os construtores e métodos necessários. Crie o método toString.

## Questão 4
Crie uma classe **Biblioteca**, que possui um array de Livro. Crie os métodos de acesso e o toString para esta classe. Nesta classe, ainda, faça o que se pede:
- no construtor, receba **apenas o tamanho** do array de Livro por parâmetro e inicialize o array com este tamanho. Não inclua livros no array, ele deve permanecer vazio no momento da criação da biblioteca
- crie o método _insereLivro_, que recebe um livro e insere na primeira posição disponível do array. Caso não seja possível inserir o livro no array, retorne false. Se o livro for inserido, retorne true.
- crie o método _procuraLivroPorTitulo_, que recebe uma String titulo e retorna um objeto do tipo livro, que é o livro com aquele título. O método retorna null caso não haja o livro solicitado na biblioteca.
- crie o método _verificaDesconto_, que recebe uma String titulo e retorna o valor do desconto do livro com o título solicitado caso o livro esteja na biblioteca ou retorna -1, caso contrário. Cuidado, nem todos os tipos de livro possuem desconto.
- crie o método _imprimeEdicoes_, que imprime as edições de todos os livros que possuem esta informação.
- crie o método _imprimeLivroPorAno_, que simplesmente imprime as informações dos livros em ordem decrescente de ano de criação.
- crie o método _calculaMediaPreco_, que retorna a média dos preços dos livros presentes no array.
- crie o método _livroComMaiorTitulo_, que retorna o livro com o maior título do array. Utilize o método length() da classe String, que retorna o tamanho do texto. Por exemplo: variavelString.length() retorna o tamanho (ou seja, a quantidade de caracteres) da variável variavelString.

## Questão 5
Crie a classe **Principal**, que possui o método main. No main, faça o que se pede:
- Crie uma biblioteca com capacidade de livros entre 1 e 200, utilizando Math.random() para o sorteio. Lembrando: **(int)(Math.random() * X + 1)** sorteia um valor entre 1 e X.
- Sorteie um valor entre 1 e 300 e armazene em uma variável chamada quant
- Tente inserir quant livros na biblioteca. Para isto, realize um sorteio entre 1 e 2. Caso o valor sorteado seja 1, insira um livro Novo. Caso o valor sorteado seja 2, insira um livro Antigo. A cada inserção, informe uma mensagem de sucesso ou insucesso. As informações necessárias para criação dos objetos devem ser obtidas de alguma forma aleatória.
- Solicite ao usuário (pelo teclado) que informe o título de um livro para procurar na biblioteca. Caso o livro exista, imprima as informações do livro. Caso contrário, imprima uma mensagem de erro.
- Solicite ao usuário (pelo teclado) que informe o título de um livro para verificar o desconto. Caso o livro exista e possua desconto, imprima as informações do livro. Caso contrário, imprima uma mensagem de erro.
- Imprima a edição dos livros do tipo Antigo da biblioteca.
- Imprima as informações dos livros em ordem decrescente de ano de criação.
- Imprima a média dos preços dos livros presentes na biblioteca.
- Imprima as informações do livro com o maior título na biblioteca. 