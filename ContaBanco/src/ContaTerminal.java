import java.util.Locale;
import java.util.Scanner;

/**
 * ContaTerminal recebe as informações bancárias de um cliente e exibe essas informações na tela.
 * @author Jailson Marques
 * @version 1.0
 * @since 29/09/2023
 */

public class ContaTerminal {
    /**
     * Esta classe recebe os dados bancários e exibe as informações no terminal.
     * @param dados scanner que vai receber as informações
     * @param conta recebe o número da conta bancária
     * @param agencia recebe a agência
     * @param nome recebe o nome do cliente
     * @param saldo recebe o saldo da conta
     */
    public static void main(String[] args) throws Exception {
        Scanner dados = new Scanner(System.in).useLocale(Locale.US);

        System.out.print("Digite o número da sua conta: ");
        int conta = dados.nextInt();

        System.out.print("Digite o número da sua agência: ");
        String agencia = dados.next();

        System.out.print("Digite o seu nome: ");
        String nome = dados.next();

        System.out.print("Digite o seu saldo: ");
        double saldo = dados.nextDouble();

        System.out.println("Olá, " + nome + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta " + conta + " e seu saldo " + saldo + " já está disponível para saque.");
    }
}


