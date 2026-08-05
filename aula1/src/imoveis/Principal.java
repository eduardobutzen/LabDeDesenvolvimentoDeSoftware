package imoveis;

/**
 * Exercicio 3 - Demonstra as duas versoes sobrecarregadas de calcularPreco().
 *
 * @author Eduardo Butzen
 */
public class Principal {

    public static void main(String[] args) {

        Casa casa = new Casa();

        float preco;

        preco = casa.calcularPreco(80);
        System.out.println("Preco da casa de 80m2: " +preco);

        preco = casa.calcularPreco(80, 3);
        System.out.println("Preco da casa de 80m2 com 3 quartos: " +preco);
    }

}
