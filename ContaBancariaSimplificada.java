public class ContaBancariaSimplificada {
    private int saldo;
    String nome;
    String tipoConta;

    public void mostraDados () {
        if(saldo < 0 && !(tipoConta.equals("especial"))){
            System.out.println("Os dados nao podem ser mostrados, pois seu saldo eh negativo");
        } else {
            System.out.println("Os dados da conta sao:\nNome: " + this.nome + "Saldo: " + this.saldo);
        }
    }

}
