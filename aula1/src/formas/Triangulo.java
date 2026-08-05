package formas;

/**
 * Exercicio 2 - Herda de FormaGeometrica e sobrescreve calcularArea().
 *
 * @author Eduardo Butzen
 */
public class Triangulo extends FormaGeometrica{

    private float base;
    private float altura;

    public float getBase() {
        return base;
    }

    public float getAltura() {
        return altura;
    }

    public void setBase(float base) {
        this.base = base;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }

    @Override
    public float calcularArea(){

        area = (base * altura) / 2;
        System.out.println("Area do triangulo: " +area);
        return area;
    }

}
