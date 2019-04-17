
package ejemplopooprofe;

import ejemplopoo.Geometria.Rectangulo;
import ejemplopoo.Geometria.Triangulo;
import ejemplopoo.Geometria.Cuadrado;
import ejemplopoo.Geometria.Circulo;


public class ObjetosSueltos {
    
    public static void calculosSueltos(){
        
        Rectangulo rec = new Rectangulo(10, 15, "Azul");
        System.out.println("Area rectangulo: " + rec.calcArea());
        System.out.println("Perimetro rectangulo: " + rec.calcPeri());
        
        
        float[] ladosTri = {2,3,5};
        Triangulo tri = new Triangulo(ladosTri, 12, 24);
        System.out.println("Area triangulo: " + tri.calcArea());
        System.out.println("Perimetro triangulo: " + tri.calcPeri());
        
        
        
        Circulo cir = new Circulo(10);
        System.out.println("Area circulo: " + cir.calcArea()); 
        System.out.println("Perimetro circulo: " + cir.calcPeri());
        
        
        
        Cuadrado cuad = new Cuadrado(12, "rojo");
        System.out.println("Area cuadrado: " + cuad.calcArea());
        System.out.println("Perímetro cuadrado: " + cuad.calcPeri());
}
    
}
