
package ejemplopoo.Geometria;


public class Circulo extends Figura {
    
    private float radio;
    
    public Circulo(float radio){
        super("blanco");
        this.radio = radio;
    }

    public float getRadio() {
        return radio;
    }

    public void setRadio(float radio) {
        this.radio = radio;
    }
    
    public float calcArea(){
        return (float) (Math.PI * Math.pow(this.radio, 2));
    }
    
    public float calcPeri(){
        return 2 * (float) Math.PI * radio;
    }
    
 
    
}
