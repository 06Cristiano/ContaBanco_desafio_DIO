import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    
        public static void main(String[] args) {
            try (//criando o objeto scanner
            Scanner scanner = new Scanner(System.in).useLocale(Locale.US)) {
                System.out.println("Digite seu nome(ex: Roberto)");
                String nome  = scanner.next();
                if (!"Mario".equals(nome)){
                    System.out.println("Usuário inválido, tente de novo! Reinicie o processo!");
                    return;
                }
                System.out.println("Digite seu sobrenome(ex: Barbosa)");
                String sobrenome  = scanner.next();
                if (!"Andrade".equals(sobrenome)){
                    System.out.println("Usuário inválido, tente de novo! Reinicie o processo!");
                    return;
                }
                
                System.out.println("Digite o número da Agência (ex:999-9)");
                String agencia = scanner.next();
                if (!"067-8".equals(agencia)){
                    System.out.println("Agência inválida, tente de novo! Reinicie o processo!");
                    return;
                }
                
                System.out.println("Digite seu usuário de 4 dígitos.");
                int numero = scanner.nextInt();
                if (numero != 1021){
                    System.out.println("Usuário inválido! Reinicie o processo!");
                    return;
                }
                
                System.out.println("Digite valor para saque!(ex: 222.10)");
                double saldo = scanner.nextDouble();
                if (saldo <= 237.48 ){
                    System.out.println("Saldo disponível de 237.48");
                } else if (saldo > 237.48){
                    System.out.println("Valor não disponivel para saque, seu saldo é de 237.48!");
                    return;
                }

                System.out.println("Olá "+nome +" "+ sobrenome +", obrigado por ter uma conta em nosso banco, sua agência é "+ agencia +", conta " + numero + ", e seu saldo é de R$ 237.48, valor para saque de R$ "+saldo+ " já está disponível.");
            }
            
        }
}