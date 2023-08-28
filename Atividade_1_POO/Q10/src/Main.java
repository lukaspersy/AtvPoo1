public class Main {
    public static void main(String[] args) {
        Double saldo = 500.50;
        System.out.printf("Seu saldo é de R$ %.2f. \n", saldo);
        Double deposito = 300.25;
        Double saldoAtualizado = saldo + deposito;
        System.out.printf("Você realizou um depósito no valor de R$ %.2f. \n", deposito);
        System.out.printf("Seu novo saldo é R$ %.2f. \n", saldoAtualizado);
        Double saque = 150.75;
        Double novoSaldo = saldoAtualizado - saque;
        System.out.printf("Você realizou um saque no valor de R$ %.2f, seu novo saldo é de R$ %.2f.", saque, novoSaldo);
    }
}