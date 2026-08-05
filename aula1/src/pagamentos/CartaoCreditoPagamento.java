package pagamentos;

/**
 * Exercicio 4 - Pagamento com cartao de credito.
 *
 * @author Eduardo Butzen
 */
public class CartaoCreditoPagamento extends MetodoPagamento {

    public CartaoCreditoPagamento(){
        super("Cartao de Credito");
    }

    @Override
    public void processaPagamento(double valor){

        System.out.println("Processando pagamento de R$ " +valor+ " no " +nomeMetodo);
    }

    @Override
    public void mostraDetalhesPagamento(){

        System.out.println("Metodo de pagamento: " +nomeMetodo);
        System.out.println("Id do pagamento: " +idPagamento);
    }

}
