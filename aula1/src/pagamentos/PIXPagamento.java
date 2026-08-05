package pagamentos;

/**
 * Exercicio 4 - Pagamento via PIX.
 *
 * @author Eduardo Butzen
 */
public class PIXPagamento extends MetodoPagamento {

    public PIXPagamento(){
        super("PIX");
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
