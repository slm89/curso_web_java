
package ejemplopoo;

import java.util.Scanner;


public class ejemplospoo {
    private int lados;
    
    
    
    public int getLados(){
        return this.lados;
    }
    
    public void setLados(int l){
        this.lados = l;
    }
    
 
    public static void main(String[] args) {
        Rectangulo miRectangulo = new Rectangulo();
        System.out.println ("El área del rectángulo es: " + miRectangulo.area);
        Cuadrado miCuadrado = new Cuadrado();
        System.out.println ("El área del cuadrado es: " + miCuadrado.area);
        Circulo miCirculo = new Circulo();
        System.out.println ("El área del circulo es: " + miCirculo.area);
        
    }

    private static class Rectangulo extends Figura {
           
        int base, altura;
        double area;
        
        public Rectangulo() {
            Scanner teclado = new Scanner(System.in);
            System.out.println ("Base del rectángulo: ");
            base = teclado.nextInt();
            System.out.println ("Altura del rectángulo: ");
            altura = teclado.nextInt();

            area = base * altura;
        }
    }
    
    private static class Cuadrado  {
           
        double area;
        int lado;
        
        
        public Cuadrado() {
            Scanner teclado = new Scanner(System.in);
            System.out.println ("Lado del cuadrado: ");
            lado = teclado.nextInt();
            area = lado * lado;     
        }
    }
    
    private static class Circulo  {
           
       int radio;
       double area;
        
        
        public Circulo() {
            Scanner teclado = new Scanner(System.in);
            System.out.println ("Radio: ");
            radio = teclado.nextInt();
            area = Math.PI*Math.pow(radio, 2)/4;     
        }
    }
    
}
