package banco;

/**
 * Exercicio 1 - Conta corrente com saldo, deposito e saque.
 *
 * @author Eduardo Butzen
 */
public class ContaCorrente {

    private float saldo;

    public void definirSaldoInicial(float valor){
        saldo = valor;
    }

    public float getSaldo() {
        return saldo;
    }

    public void depositar(float valor){
        saldo = saldo + valor;
    }

    public boolean sacar (float valor){
        if (valor > saldo){
            return false;
        }
        else{
            saldo = saldo - valor;
            return true;
        }
    }
}
