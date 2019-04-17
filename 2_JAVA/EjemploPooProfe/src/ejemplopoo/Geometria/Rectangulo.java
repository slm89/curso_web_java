
package ejemplopoo.Geometria;


public class Rectangulo extends FiguraConLados {

    public Rectangulo(float base, float altura) {
        super(base, altura);
    }
    
    public Rectangulo ( float base, float altura, String color){
        super(base, altura, color);
    }
    
    public float calcArea(){
        return this.base * this.altura;
    }
    
   public float calcPeri (){
       return 2*base + 2* altura;
   }
 
}
