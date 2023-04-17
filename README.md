# Resolução

**1) Escreva um modelo para representar uma lâmpada que está à venda em um supermercado. Que dados devem ser representados por esse modelo?**

R: Modelo Lâmpada deve possuir algumas características como o o tipo da lâmpada, se é led, flourescente ou incadescente, por exemplo. Além disso, é necessário haver informações como a cor que libera e consumo de Watts. E deve execer a função de ligar e desligar.

**2) Crie um modelo para representar um time de um esporte qualquer em um campeonato desse esporte. Que dados e operações esse modelo deve ter?**

R: Em um modelo paraum time é necessário informações como quantidade de jogadores, técnico, estádio, mascote, jogadores e cor da camisa.

**8) Identifique e explique o(s) erro(s) na classe abaixo:**
```Java
 class Teste2
2   {
3   /**
4  * Declaração dos campos desta classe
5   */
6   int num1,num2;
7   /**
8   * Declaração dos métodos desta classe
9   */
10  int maior() { 
11  
12    if (num1 > num2)
13         return true;
14    else return false;
15  }
16  void menor() { 
17 
18  if (num1 < num2) {
19      return num1;}
20  else return num2;
21  }
22 } // fim da classe
```
R: Os erros presentes dos blocos de código são primeiramente o método maior() que deve retornar um inteiro, porém no código está retornando um valor booleano. Além disso, no método menor que é um procedimento tenta retorna um inteiro, e para o método não foi indicado nenhum tipo de retorno.

**9) Identifique e explique o(s) erro(s) na classe abaixo.**

```Java
1 class TesteImpressao
2 {
3 main(String[] args)
4 {
5 System.out.println(“7+2=”+(7+2));
6 System.out.println(“7-2=”+(7-2));
7 System.out.println(“7*2=”+(7*2));
8 System.out.println(“7/2=”+(7/2));
9 return true;
10 }
11 } // fim da classe
```
R: O erro do bloco de código está no retorno do método que não foi especificado, ou seja, o problema do código é que se espera que um método main retorne um valor bolleano. Dessa forma, retirar o retorno e inserir o **public static void** vai ajudar a compilar o código.


