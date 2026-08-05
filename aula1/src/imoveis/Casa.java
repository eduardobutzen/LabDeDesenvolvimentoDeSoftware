package imoveis;

/**
 * Exercicio 3 - Sobrecarga do metodo calcularPreco().
 *
 * @author Eduardo Butzen
 */
public class Casa {

    public float valor;

    public float calcularPreco(int tamanho){

        valor = 4300 * tamanho;
        return valor;
    }

    public float calcularPreco(int tamanho, int quantidadeQuartos){

        valor = (4300 * tamanho) + (2500 * quantidadeQuartos);
        return valor;
    }

}
