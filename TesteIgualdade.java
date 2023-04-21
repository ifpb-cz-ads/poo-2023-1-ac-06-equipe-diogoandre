public class TesteIgualdade{
    public static void main(String[] args) {
        String frase1;
        String frase2;
        frase1 = new String("Testando igualdade!");
        frase2 = new String("Testando igualdade!");
        System.out.println("Frase 1: "+frase1);
        System.out.println("Frase 2: "+frase2);
        System.out.println("Frase 1 e Frase 2 sao iguais? R: "+(frase1==frase2));
    }
}

//a comparação acaba retornado false por que ao chamar o construtor a String é criada sem uma referencia em igual