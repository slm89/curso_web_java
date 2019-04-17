
package ejemplopoo.Geometria;


public class Cuadrado extends Rectangulo {

    public Cuadrado(float lado) {
        super(lado, lado);
    }
    
    public Cuadrado ( float lado, String color){
        super(lado, lado, color);
    }
    
}
