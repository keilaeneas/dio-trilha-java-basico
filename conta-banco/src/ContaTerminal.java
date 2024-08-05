import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        //TODO:Conhecer e importar a classe Scanner
        //Exibir as mensagens para o usuário
        //Obter pelo scanner os valores digitados no terminal
        // Exibir a mensagem conta criada

        Scanner sc = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Digite seu nome e sobrenome ");
        String nomeCliente = sc.nextLine();

        System.out.println("Digite sua agência ");
        String agencia = sc.nextLine();

        System.out.println("Digite seu número ");
        int numero = sc.nextInt();

        System.out.println("Digite seu saldo ");
        double saldo = sc.nextDouble();

        System.out.println("Ola " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " +
        agencia + ", conta " + numero + " e seu saldo " + saldo + " já está disponivel para saque.");
    }
}
