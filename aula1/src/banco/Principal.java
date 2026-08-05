package banco;

/**
 * Exercicio 1 - Demonstra o uso da classe ContaCorrente.
 *
 * @author Eduardo Butzen
 */
public class Principal {

    public static void main(String[] args) {

        ContaCorrente novaConta = new ContaCorrente();

        novaConta.definirSaldoInicial(1000);

        System.out.println("Saldo: " +novaConta.getSaldo());

        if(novaConta.sacar(500)){

            System.out.println("Saque de 500 realizado");
        }
        else{

            System.out.println("Saque de 500 nao realizado: saldo insuficiente");
        }

        novaConta.depositar(50);

        System.out.println("Novo saldo: " +novaConta.getSaldo());

        if(novaConta.sacar(600)){

            System.out.println("Saque de 600 realizado");
        }
        else{

            System.out.println("Saque de 600 nao realizado: saldo insuficiente");
        }

        System.out.println("Novo saldo: " +novaConta.getSaldo());
    }
}
