import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Conta conta;
        double valorInicial;

        System.out.println("Digite o número da conta: ");
        int num = sc.nextInt();
        sc.nextLine();
        System.out.print("Nome do titular da conta: ");
        String nome = sc.nextLine();
        System.out.println("Tem dinheiro a depositar no momento da abertura da conta? (s/n)");
        String resposta = sc.nextLine();

        if(resposta.equals("s")){
            System.out.println("Digite o valor inicial do depósito: ");
            valorInicial = sc.nextDouble();
            conta = new Conta(num, nome, valorInicial);
            System.out.println(conta);
        } else {
            valorInicial = 0;
            conta = new Conta(num, nome, valorInicial);
            System.out.println(conta);
        }


        System.out.println("Informe o valor para o depósito: ");
        double quant = sc.nextDouble();
        conta.deposito(quant);
        System.out.println(conta);
        System.out.println("Informe o valor para o saque: ");
        double quant1 = sc.nextDouble();
        conta.saque(quant1);
        System.out.println(conta);

        sc.close();
    }
}
