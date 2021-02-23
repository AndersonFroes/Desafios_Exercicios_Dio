<h1 align="center">Desafios em Java da Digital Innovation One</h1>

***Desafio Multiplicação Simples*** :computer::interrobang::heavy_check_mark:

Desafio: 

- Você receberá dois valores inteiros. 
- Faça a leitura e em seguida calcule o produto entre estes dois valores. 
- Atribua esta operação à variável PROD, mostrando esta de acordo com a mensagem de saída esperada.   

Entrada

- A entrada contém 2 valores inteiros.

Saída

- Exiba a variável PROD conforme exemplo abaixo, tendo obrigatoriamente um espaço em branco antes e depois da igualdade.

  

***Desafio Menor e Posição*** :computer::interrobang::heavy_check_mark:

Desafio

- Desenvolva um código que leia um valor E. 
- Este E será o tamanho de um vetor X[E]. 
- A seguir, leia cada um dos valores de X, encontre o menor elemento deste vetor e a sua posição dentro do vetor, mostrando esta informação.

Entrada

- A primeira linha de entrada contem um único inteiro E (1 < E < 1000), indicando o número de elementos que deverão ser lidos em seguida para o vetor X[E] de inteiros. 
- A segunda linha contém cada um dos E valores, separados por um espaço.

Saída

- A primeira linha apresenta a mensagem “Menor valor:” seguida de um espaço e do menor valor lido na entrada. 
- A segunda linha apresenta a mensagem “Posicao:” seguido de um espaço e da posição do vetor na qual se encontra o menor valor lido, lembrando que o vetor inicia na posição zero.



***Desafio Números Ímpares*** :computer::interrobang::heavy_check_mark:

Desafio

- Leia um valor inteiro X (1 <= X <= 1000). 
- Em seguida mostre os ímpares de 1 até X, um valor por linha, inclusive o X, se for o caso.

Entrada

- O arquivo de entrada contém 1 valor inteiro qualquer.

Saída

- Imprima todos os valores ímpares de 1 até X, inclusive X, se for o caso.



***Abreviando posts do blog*** :computer::interrobang::heavy_check_mark:

Desafio

- Leonardo é um nômade digital e viaja pelo mundo programando em diferentes cafés das cidades por onde passa. 
- Recentemente, resolveu criar um blog, para compartilhar suas experiências e aprendizados com seus amigos.
- Para criação do blog, ele optou por utilizar uma ferramenta pronta, que há um limite de caracteres que se pode escrever por dia, e Leonardo está preocupado que essa limitação, afinal, irá impedir de contar suas melhores experiências. 
- Para contornar esse problema, decidiu usar um sistema de abreviação de palavras em seus posts.
- O sistema de abreviações é simples e funciona da seguinte forma: para cada letra, é possível escolher uma palavra que inicia com tal letra e que aparece no post. 
- Uma vez escolhida a palavra, sempre que ela aparecer no post, ela será substituída por sua letra inicial e um ponto, diminuindo assim o número de caracteres impressos na tela.
- Por exemplo, na frase: “hoje eu programei em Python”, podemos escolher a palavra “programei” para representar a letra ‘p', e a frase ficará assim: “hoje eu p. em Python”, economizando assim sete caracteres. 
- Uma mesma palavra pode aparecer mais de uma vez no texto, e será abreviada todas as vezes. 
- Note que, se após uma abreviação o número de caracteres não diminuir, ela não deve ser usada, tal como no caso da palavra “eu” acima.
- Leonardo precisa que seu post tenha o menor número de caracteres possíveis, e por isso pediu a sua ajuda. 
- Para cada letra, escolha uma palavra, de modo que ao serem aplicadas todas as abreviações, o texto contenha o menor número de caracteres possíveis.

Entrada

- Haverá diversos casos de teste. Cada caso de teste é composto de uma linha, contendo uma frase de até 10⁴ caracteres. 
- A frase é composta de palavras e espaços em branco, e cada palavra é composta de letras minúsculas ('a'-'z'), e contém entre 1 e 30 caracteres cada.
- O último caso de teste é indicado quando a linha dada conter apenas um “.”, o qual não deverá ser processado.

Saída

- Para cada caso de teste, imprima uma linha contendo a frase já com as abreviações escolhidas e aplicadas.
- Em seguida, imprima um inteiro N, indicando o número de palavras em que foram escolhidas uma letra para a abreviação no texto. 
- Nas próximas N linhas, imprima o seguinte padrão “C. = P”, onde C é a letra inicial e P é a palavra escolhida para tal letra. 
- As linhas devem ser impressas em ordem crescente da letra inicial.



***Conjuntos bons ou ruins?*** :computer::interrobang::heavy_check_mark:

Desafio

- Nesse algoritmo você deverá descobrir se um conjunto de palavras é bom ou ruim. 
- Por definição, um conjunto é bom quando nenhuma palavra desse conjunto é um prefixo de outra palavra. 
- Caso contrário, é considerado um conjunto ruim.
- Por exemplo, {**dbc**, **dae**, **dbcde**} é um conjunto ruim, pois dbc é um prefixo de dbcde. 
- Quando duas palavras são idênticas, definimos como uma sendo prefixo da outra.

Entrada

- A entrada contém vários casos de teste. 
- A primeira linha de cada caso de teste terá um inteiro N (1 ≤ N ≤ 10⁵), que representa a quantidade de palavras no conjunto. 
- Segue então N linhas, cada uma tendo uma palavra de no máximo 100 letras minúsculas. 
- A entrada termina quando N = 0 e não deve ser processada.

Saída

- Para cada caso de teste, você deverá imprimir "Conjunto Bom", ou "Conjunto Ruim", conforme explicado acima.



***Encontre a maior substring*** :computer::interrobang::heavy_check_mark:

Desafio

- Encontre a maior substring comum entre as duas strings informadas. 
- A substring pode ser qualquer parte da string, inclusive ela toda. 
- Se não houver subseqüência comum, a saída deve ser “0”. A comparação é case sensitive ('x' != 'X').

Entrada

- Encontre a maior substring comum entre as duas strings informadas. 
- A substring pode ser qualquer parte da string, inclusive ela toda. 
- Se não houver subseqüência comum, a saída deve ser “0”. 
- A comparação é case sensitive ('x' != 'X').

Saída

- O tamanho da maior subsequência comum entre as duas Strings.



***Entrevista embaraçosa*** :computer::interrobang::heavy_check_mark:

Desafio

- A nutricionista Juliana Alcantra é uma excelente profissional de sua área. 
- Em determinado dia, ela foi entrevistada ao vivo para um jornal da cidade. 
- No entanto, ficou um pouco nervosa na hora, e diante da situação, sua fala ficou um pouco distorcida, repetindo o final de cada palavra após dizer a mesma. 
- Para que isso não aconteça novamente, ela precisa da sua ajuda para escrever um programa que omita a parte repetida, de modo que as palavras sejam pronunciadas como deveriam ser.
- Escreva um programa que, dada uma palavra errada, a mesma seja corrigida.').

Entrada

- Haverá diversos casos de teste. 
- Cada caso de teste é formado por uma palavra, de, no máximo, 30 caracteres, dita da forma errada. 
- A entrada termina com fim de arquivo.

Saída

- Para cada caso de teste, escreva a palavra devidamente corrigida. 
- Analise os exemplos para verificar o padrão, de modo a consertar todos os casos.



***Validador de senhas com requisitos*** :computer::interrobang::heavy_check_mark:

Desafio

- Pedro e Fernando são os desenvolvedores em uma stratup e vão desenvolver o novo sistema de cadastro, e pediram a sua ajuda. 
- Sua task é fazer o código que valide as senhas que são cadastradas, para isso você deve atentar aos requisitos a seguir:
- A senha deve conter, no mínimo, uma letra maiúscula, uma letra minúscula e um número;
- A mesma não pode ter nenhum caractere de pontuação, acentuação ou espaço;
- Além disso, a senha pode ter de 6 a 32 caracteres.

Entrada

- A entrada contém vários casos de teste e termina com final de arquivo. 
- Cada linha tem uma string S, correspondente a senha que é inserida pelo usuário no momento do cadastro.

Saída

- A saída contém uma linha, que pode ser “Senha valida.”, caso a senha tenha cada item dos requisitos solicitados anteriormente, ou “Senha invalida.”, se um ou mais requisitos não forem atendidos.

<br><h4 align=center>Produzido por: Anderson Froes (SkullD)</h4>