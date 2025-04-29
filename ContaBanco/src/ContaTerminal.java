import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Por favor, digite o seu nome: ");
        String nomeCliente = entrada.next();
        System.out.println("Por favor, digite o número da sua Conta: ");
        int numeroConta = entrada.nextInt();
        System.out.println("Por favor, digite o número da sua Agência:");
        String agencia = entrada.next();
        System.out.println("O seu saldo é: ");
        double saldo = entrada.nextDouble();

        String mensagem = "Olá ".concat(nomeCliente)
                                .concat(", obrigado por criar uma conta em nosso banco, sua agência é "
                                .concat(agencia).concat(", conta ").concat(String.valueOf(numeroConta).concat(" e seu saldo de R$")
                                .concat(String.valueOf(saldo).concat(", já está disponível para saque"))));

        System.out.println(mensagem);
    }
}