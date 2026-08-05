package formas;

/**
 * Exercicio 2 - Classe base das formas geometricas.
 *
 * @author Eduardo Butzen
 */
public class FormaGeometrica {

    private float lado;
    protected float area;

    public float getLado() {
        return lado;
    }

    public float getArea() {
        return area;
    }

    public void setLado(float lado) {
        this.lado = lado;
    }

    public float calcularArea(){

        area = lado * lado;
        return area;
    }

}
