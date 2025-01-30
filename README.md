
# Projeto Kotlin: Princípios da Linguagem

Este repositório explora os princípios básicos da linguagem Kotlin, abordando conceitos fundamentais como variáveis, tipos de dados, operadores, estruturas de controle e muito mais.

---

## Índice

- [Sobre o Projeto](#sobre-o-projeto)
- [Diferença entre `var` e `val`](#diferença-entre-var-e-val)
- [Tipos de Dados](#tipos-de-dados)
- [Concatenação de Strings](#concatenação-de-strings)
- [Operadores Aritméticos](#operadores-aritméticos)
- [Operadores Relacionais](#operadores-relacionais)
- [Estruturas Condicionais](#estruturas-condicionais)
- [Operadores Lógicos](#operadores-lógicos)
- [Arrays](#arrays)
- [Estruturas de Repetição](#estruturas-de-repetição)
- [Estrutura `when`](#estrutura-when)

---

## Sobre o Projeto

Este projeto foi criado para demonstrar os conceitos fundamentais do Kotlin, uma linguagem moderna, concisa e interoperável com Java. Ele é amplamente usado para desenvolvimento Android, mas também é aplicável a back-end e outras áreas.

---

## Diferença entre `var` e `val`

- **`var`**: Declara uma variável **mutável**, ou seja, seu valor pode ser alterado após a inicialização.

`var idade = 25`
`idade = 26` // Permitido


- **`val`**: Declara uma variável **imutável**, cujo valor não pode ser alterado após a inicialização.

`val nome = "Maria"`
`nome = "João"` // Erro: Val cannot be reassigned`

---

## Tipos de Dados

Kotlin suporta diversos tipos básicos:

| Categoria | Tipo        | Exemplo             |
|-----------|-------------|---------------------|
| Numérico  | `Int`, `Long`, `Float`, `Double` | `val idade: Int = 30` |
| Texto     | `String`, `Char`                 | `val letra: Char = 'A'` |
| Lógico    | `Boolean`                        | `val ativo: Boolean = true` |

---

## Concatenação de Strings

A concatenação em Kotlin pode ser feita usando:

1. **Operador `+`:**
   
`val saudacao = "Olá"`
`val nome = "Mundo"`
`println(saudacao + ", " + nome)` // Saída: Olá, Mundo

2. **Templates de String:**
`val nome = "João"`
`println("Bem-vindo, $nome!")` // Saída: Bem-vindo, João!

---

## Operadores Aritméticos

Os operadores aritméticos em Kotlin incluem:

| Operador | Descrição    | Exemplo            |
|----------|--------------|--------------------|
| `+`      | Soma         | `10 + 5 // 15`    |
| `-`      | Subtração    | `10 - 5 // 5`     |
| `*`      | Multiplicação| `10 * 5 // 50`    |
| `/`      | Divisão      | `10 / 5 // 2`     |
| `%`      | Módulo       | `10 % 3 // 1`     |

---

## Operadores Relacionais

Os operadores relacionais retornam valores booleanos (`true` ou `false`) com base na comparação:

| Operador | Descrição           | Exemplo            |
|----------|---------------------|--------------------|
| `<`      | Menor que           | `5 < 10 // true`   |
| `>`      | Maior que           | `5 > 10 // false`  |
| `<=`     | Menor ou igual      | `5 <= 5 // true`   |
| `>=`     | Maior ou igual      | `5 >= 10 // false` |
| `==`     | Igualdade           | `5 == 5 // true`   |
| `!=`     | Diferença           | `5 != 10 // true`  |

---

## Estruturas Condicionais

1. **If/Else:**
   
`val idade = 18`
`if (idade >= 18) {`
`println("Maior de idade")`
`} else {`
`println("Menor de idade")`
`}`

2. **If como expressão:**
   
`val permissao = if (idade >= 18) "Permitido" else "Negado"`
`println(permissao)` // Saída: Permitido

---

## Operadores Lógicos

Os operadores lógicos são usados para combinar condições:

| Operador | Descrição               | Exemplo                      |
|----------|-------------------------|------------------------------|
| `&&`     | E lógico                | `(a > b) && (b > c)`         |
| `||`     | OU lógico               | `(a > b) || (b > c)`         |
| `!`      | Negação lógica          | `!(a > b)`                   |

---

## Arrays

Arrays em Kotlin podem ser criados com a função `arrayOf()`:

`val numeros = arrayOf(1, 2, 3, 4)`
`println(numeros)` // Saída: 1
`numeros = 10`
`println(numeros)` // Saída: 10

---

## Estruturas de Repetição

1. **For Loop:**

`for (i in 1..5) {`
`println(i)` // Saída: 1, 2, 3, 4, 5
`}`

2. **While Loop:**

`var contador = 0`
`while (contador < 5) {`
`println(contador)`
`contador++`
`}`

3. **Do While Loop:**

`var contador = 0`
`do {`
`println(contador)`
`contador++`
`} while (contador < 5)`

---

## Estrutura When

A estrutura when é usada como uma alternativa ao switch:

`val dia = "Segunda"`
`val mensagem = when (dia) {`
`"Segunda" -> "Início da semana!"`
`"Sexta" -> "Quase fim de semana!"`
`else -> "Dia comum."`
`}`
`println(mensagem)` // Saída: Início da semana!
