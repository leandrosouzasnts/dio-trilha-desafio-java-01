package git.leandrosouzasnts;

import java.util.Arrays;
import java.util.Scanner;

public class ContaTerminal {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Bem-vindo ao sistema ContaTerminal");

        Conta conta = new Conta();
        System.out.print("Por favor, digite o número da Conta: ");
        conta.setNumero(scanner.nextInt());

        System.out.print("Informe o número da Agência: ");
        conta.setAgencia(scanner.next());

        scanner.nextLine();

        System.out.print("Nome: ");
        conta.setNomeCliente(scanner.nextLine());

        System.out.print("Saldo inícial: ");
        conta.setSaldo(scanner.nextBigDecimal());

        scanner.close();

        System.out.printf("\nOlá, %s. Obrigado por criar uma conta em nosso banco. Sua agência: %s, conta: %d e seu saldo %.2f estão disponíveis para saque.",
                conta.getNomeCliente(), conta.getAgencia(), conta.getNumero(), conta.getSaldo());


    }

}