package formas;

/**
 * Exercicio 2 - Demonstra a heranca entre FormaGeometrica e Triangulo.
 *
 * @author Eduardo Butzen
 */
public class Principal {

    public static void main(String[] args) {

        FormaGeometrica quadrado = new FormaGeometrica();
        quadrado.setLado(3.44f);

        float area;
        area = quadrado.calcularArea();
        System.out.println("Area do quadrado: " +area);

        Triangulo t = new Triangulo();
        t.setBase(4.33f);
        t.setAltura(4.5f);

        t.calcularArea();
    }

}
