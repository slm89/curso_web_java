
package ejemplopoo.Geometria;

public class Triangulo extends FiguraConLados {
    
    private float[] lados;
    
    public Triangulo (float[] lados, float base, float altura){
        super(base, altura);
        this.lados = lados;
    }
    
     public Triangulo(float base, float altura, float[] lados, String color) {
        super(base, altura, color);
        this.lados = lados;
    }
    
    public void setLados(float[] lados) {
        this.lados = lados;
    }

    public float[] getLados() {
        return lados;
    }
    
    public float calcArea(){
        return this.base * this.altura/2;
    }
    
    public float calcPeri (){
       return lados[0] + lados[1] + lados[2];
   }
 
}
