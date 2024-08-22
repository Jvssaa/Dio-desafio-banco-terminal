import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Por favor, digite o número da Conta!");
        int numero = teclado.nextInt();

        System.out.println("Por favor, digite o número da Agência !");
        int agencia = teclado.nextInt();

        System.out.println("Por favor, digite o nome do Cliente !");
        String nomeCliente = teclado.next();

        System.out.println("Por favor, digite o valor do Saldo !");
        double saldo = teclado.nextDouble();

        System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é "
                + agencia + ", conta " + numero + " e seu saldo " + saldo + " já está disponível para saque");
        teclado.close();
    }
}
