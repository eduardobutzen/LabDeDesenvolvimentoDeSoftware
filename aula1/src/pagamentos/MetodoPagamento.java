package pagamentos;

import java.util.Random;

/**
 * Exercicio 4 - Classe abstrata base de todos os metodos de pagamento.
 *
 * @author Eduardo Butzen
 */
public abstract class MetodoPagamento {

    protected String nomeMetodo;
    protected int idPagamento;

    public MetodoPagamento(String nomeMetodo){
        this.nomeMetodo = nomeMetodo;

        Random gerador = new Random();
        this.idPagamento = gerador.nextInt(10000);
    }

    public String getNomeMetodo() {
        return nomeMetodo;
    }

    public int getIdPagamento() {
        return idPagamento;
    }

    public abstract void processaPagamento(double valor);

    public abstract void mostraDetalhesPagamento();

}
