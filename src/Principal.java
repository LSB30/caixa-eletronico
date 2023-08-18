import java.util.Random;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        Random random = new Random();
        Double saldo = random.nextDouble(1001);
        System.out.println("Bem-Vindo");
        System.out.println("Informe seu Nome: ");
        String nome = leitura.nextLine();
        System.out.println("Informe a quantidade que deseja sacar: ");
        Double saque = leitura.nextDouble();

        if(saldo < saque) {
            System.out.println("Saldo insuficiente !\n Saldo Atual: " + saldo + "\n Valor do Saque: " + saque);
        } else if (saque < 10) {
            System.out.println("Valor mínimo para Saque: R$10");
        } else if (saque > 1000) {
            System.out.println("Valor máximo para Saque: R$1000");
        } else if(saque % 2 != 0) {
            System.out.println("Caixa eletrônico somente possui cédulas de R$10, R$20, R$50 e R$100");
        }
        else {
            saldo -= saque;
            System.out.println("Saque Realizado com Sucesso!");
            System.out.println("Nome do Cliente: " + nome + "\nValor do saque: R$ " + saque);
            System.out.println("Salto Atual: R$ " + saldo);
        }

    }
}
