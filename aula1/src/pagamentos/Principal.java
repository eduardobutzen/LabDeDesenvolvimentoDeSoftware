package pagamentos;

/**
 * Exercicio 4 - Demonstra os tres metodos de pagamento da loja online.
 *
 * @author Eduardo Butzen
 */
public class Principal {

    public static void main(String[] args) {

        CartaoCreditoPagamento cartao = new CartaoCreditoPagamento();
        cartao.processaPagamento(250.90);
        cartao.mostraDetalhesPagamento();

        System.out.println("");

        PayPalPagamento paypal = new PayPalPagamento();
        paypal.processaPagamento(75.50);
        paypal.mostraDetalhesPagamento();

        System.out.println("");

        PIXPagamento pix = new PIXPagamento();
        pix.processaPagamento(120.00);
        pix.mostraDetalhesPagamento();
    }

}
