import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
  
        public static void main(String[] args) {
            //Aqui foi aproveitado o material da aula sobre scanner
            //E foram feitas as alterações confome pedido no projeto
            Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
            
            System.out.println("Digite o número da sua conta:");
            Integer conta = scanner.nextInt();
            
            System.out.println("Digite o número da sua Agência:");
            Integer agencia = scanner.nextInt();
    
            System.out.println("Digite seu nome");
            String nome = scanner.next();
            
            System.out.println("Digite seu saldo");
            double saldo = scanner.nextDouble();
    
            
            //imprimindo os dados obtidos pelo usuario
            System.out.println("Olá  " + nome + ", obrigado por criar uma conta em nosso banco!");
            System.out.println("Sua agência é:" + agencia);
            System.out.println("sua conta é :" + conta);
            System.out.println("e seu saldo de: " + "  " + saldo + "  já está disponível para saque");
    }
}
