
package ejemplopoo.Geometria;

import ejemplopoo.Geometria.Figura;


public class FiguraConLados extends Figura {
    protected float base, altura;

    
    public FiguraConLados(float base, float altura) {
        super("blanco");
        this.base = base;
        this.altura = altura;
    }
    
    public FiguraConLados(float base, float altura, String color) {
        super(color);
        this.base = base;
        this.altura = altura;
    }
    
    public float getBase() {
        return base;
    }

    public void setBase(float base) {
        this.base = base;
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }
}
