public class TesteIgualdade2{
    public static void main(String[] args) {
        String frase3;
        String frase4;
        frase3 = new String("Testando igualdade!");
        frase4 = frase3;
        System.out.println("Frase 1: "+frase3);
        System.out.println("Frase 2: "+frase4);
        System.out.println("Frase 1 e Frase 2 possuem a mesma referenecia? R: "+(frase3==frase4));
    }
}

//aqui a comapração retorna true por que voce está atribuindo uma variavel á outra diretamente