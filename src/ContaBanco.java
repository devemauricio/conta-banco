import java.util.Scanner;

public class ContaBanco {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        
        double saldo = 2500;
        System.out.println("Saldo atual: R$ " + saldo);
        
        System.out.print("Digite o valor a ser sacado: ");
        double saque = scanner.nextDouble();

        if (saque <= saldo)
        {
            saldo = saldo - saque;
            System.out.println("Valor sacado: R$" + saque + ". Novo saldo: R$ " + saldo);
        }

        else
        {
            System.out.println("Você não possui saldo o suficiente");
        }
    }
}
