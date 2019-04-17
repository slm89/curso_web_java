package ejemplopooprofe;

import ejemplopoo.Geometria.Rectangulo;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;

public class DesdeFicheros {

    public static void guardarRectangulos() {

        Rectangulo rec = new Rectangulo(10, 5);
        FileWriter fichero = null;
        PrintWriter pw = null;

        try { //Intentar hacer cosas con ficheros

            fichero = new FileWriter("C:/figuras/rectangulo.txt");
            pw = new PrintWriter(fichero);
            pw.print("Rectangulo: base = " + rec.getBase()
                    + ", altura = " + rec.getAltura()
                    + ", color = " + rec.getColor());

        } catch (Exception ex) { // Si ocurre algún error,
            // catch() captura la excepción, con la info en ex

            ex.printStackTrace();
        } finally { // Lo ejecuta siempre, tanto si ha habido error como si no.
            try { // Anidamos try-catch dentro del finally
                if (fichero != null) {
                    fichero.close();
                }
            } catch (Exception e2) {
                e2.printStackTrace();
            }

        }
    }

    public static void leerRectangulo() {
        File fichero = null;
        FileReader fr = null;
        BufferedReader br = null;

        try {
            fichero = new File("C:/figuras/rectangulo.txt");
            fr = new FileReader(fichero);
            br = new BufferedReader(fr);

            String linea;
            linea = br.readLine();
            if (linea != null) {
                System.out.println(linea);
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally { // Lo ejecuta siempre, tanto si ha habido error como si no.
            try { // Anidamos try-catch dentro del finally
                if (fichero != null) {
                    fr.close();
                }
            } catch (Exception e2) {
                e2.printStackTrace();
            }

        }
    }

    public static void crearRectangulo() {
         
        float base = 0;
        float altura = 0;
        String color = "";
        

        File fichero = null;
        FileReader fr = null;
        BufferedReader br = null;

        try {
            fichero = new File("C:/figuras/rectangulo.txt");
            fr = new FileReader(fichero);
            br = new BufferedReader(fr);

            String linea;
            linea = br.readLine();
            if (linea != null) {

                //Dividimos la cadena en tres partes separadas por la coma.
                String[] partes = linea.split(",");
                

                /*int indice = parte1.indexOf("=");
                float base = Float.parseFloat(parte1.substring(indice + 1).trim());
                System.out.println(base);
                int indice2 = parte2.indexOf("=");
                float altura = Float.parseFloat(parte2.substring(indice2 + 1).trim());
                System.out.println(altura);
                int indice3 = parte3.indexOf("=");
                String color = parte3.substring(indice3 + 1).trim();
                System.out.println(color);*/

        
                //System.out.println("Contiene la palabra base: " + parte1.contains("base"));       
                //System.out.println("Contiene la palabra altura: " + parte2.contains("altura"));
                //System.out.println("Contiene la palabra color: " + parte3.contains("color"));
                int i = 0;
                while (i < partes.length ) {
                    
                    String parteI = partes[i];
                    int indice = parteI.indexOf("=");
        
                    
                    if ((parteI.contains("base")) == true) {
                        base = Float.parseFloat(parteI.substring(indice + 1).trim().toLowerCase());
                        System.out.println("ok base: " + base);
                        
                    }else if ((parteI.contains("altura")) == true) {
                        altura = Float.parseFloat(parteI.substring(indice + 1).trim().toLowerCase());
                        System.out.println("ok altura: " + altura);

                    }  else if ((parteI.contains("color")) == true) {
                        color = parteI.substring(indice + 1).trim().toLowerCase();
                        System.out.println("ok color: " + color);

                    } else {
                        System.out.println("No encontrada");
                    }
                     i++;
                }
                
                Rectangulo rec = new Rectangulo(base, altura, color);
                System.out.println("Area rectangulo: " + rec.calcArea());
                System.out.println("Perimetro rectangulo: " + rec.calcPeri());
                
                
                
                
                /*else if (parte2.contains("altura")){
                altura = Float.parseFloat(parte2.substring(indice2+1).trim());
                System.out.println(altura);
            }else if (parte3.contains("color")){
               color = parte3.substring(indice3+1).trim();
               System.out.println(color); 
            }else System.out.println("Error"); */
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally { // Lo ejecuta siempre, tanto si ha habido error como si no.
            try { // Anidamos try-catch dentro del finally
                if (fichero != null) {
                    fr.close();
                }
            } catch (Exception e2) {
                e2.printStackTrace();
            }

        }
    }

}
