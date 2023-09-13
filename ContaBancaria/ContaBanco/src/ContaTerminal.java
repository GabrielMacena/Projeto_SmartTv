import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args){
        
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Por favor digite o número da sua conta.");
        int conta = scanner.nextInt();

        System.out.println("Por favor digite o número da sua agência.");
        String agencia = scanner.next();

        System.out.println("Por favor digite o seu nome");
        String nome = scanner.next();

        System.out.println("Por favor digite o seu sobrenome.");
        String sobrenome = scanner.next();

        System.out.println("Digite o saldo da sua conta.");
        Double saldo = scanner.nextDouble();

        //Imprimindo os dados obtidos para o user.

    System.out.println("Olá "+ nome+ " "+ sobrenome+", obrigado por criar conta em nosso banco, sua agência é " + agencia+"," + " sua conta " + conta + ", e seu saldo é de R$ " + saldo + " onde, já está disponível para saque.");
        
    }
}
