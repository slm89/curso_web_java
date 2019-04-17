/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplospoo.Geometria;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

/**
 *
 * @author German
 */
public class LectorFiguras {
    
    public void cargarFichero(String nomFich){
    }
      
      
    public void coleccionesFiguras(){
            //Siempre que se pueda utilizar array normal y no Array List
            /* Figura [] figuras = {
                new Rectangulo (5,5),
                new Circulo (5, "blanco"),
                new Triangulo ("Triangulo: base = 5.5, altura = 3.3, color = morado")
            };
           
            for (Figura fig : figuras){
                System.out.println(fig.toString());
                System.out.println(" - Area: " + fig.calcArea());
            } */
            
            ArrayList<Figura> arrayList = new ArrayList<>();
            arrayList.add(new Rectangulo (4, 3, "verde"));
            arrayList.add(new Circulo (5, "verde"));
            //array.add("Texto cualquiera");
            //array.add(200);
            
           
            
            for (Figura fig : arrayList){
                System.out.println(fig.toString());
                System.out.println(" - Area: " + fig.calcArea());
            } 
            IImprimible[] objImp = {
                new Circulo (5),
                new Cuadrado (6),
                //new Triangulo (20,5, null)
            };
            
            for (IImprimible imprimible : objImp){
                imprimible.imprimir();
            }
            IMostrable[] objMos = {
                new Triangulo (5, 7, null),
                new Cuadrado (6),
            };
            for (IMostrable mostrable : objMos){
                mostrable.mostrar();
            }
            
            Cuadrado cuadrado = new Cuadrado (5, "negro");
            Rectangulo cuadR = cuadrado;
            FiguraConLados cuadFL = cuadrado;
            Figura cuadF = cuadrado;
            cuadF.setColor("gris");
            IImprimible cuadI = cuadrado;
            cuadI.imprimir();
            IMostrable cuadM = cuadrado;
            cuadM.mostrar();
            
            arrayList.add(cuadrado);
            arrayList.add(cuadrado);
            
            
            //Set
            Set <Figura> setFig = new HashSet<>();
            setFig.add(new Triangulo(3, 5, null));
            setFig.addAll(arrayList);
            
           

            //Mostrar ArrayList
            System.out.println(">> ARRAY LIST: ");
            for (Figura fig : arrayList){
                System.out.println(fig.toString());
            }
            
            // El Set No muestra elementos duplicados
            System.out.println(">> SET: ");
            for (Figura fig : setFig){
                System.out.println(fig.toString());
            }
             //Map
            Map<String, Figura> mapFig = new HashMap<>();
            mapFig.put("Triangulo 1", new Triangulo(3, 9,null, "azul"));
            mapFig.put("Cuadrado", new Cuadrado (3));
            mapFig.put("Triangulo 2", new Triangulo(4, 1,null, "cyan"));
            System.out.println(" Buscando Triangulo 1: " + mapFig.get("Triangulo 1").toString());
            //Recorrerlo
            for (Map.Entry<String, Figura> entrada : mapFig.entrySet()){
                System.out.println("Clave: " + entrada.getKey() +  "; Valor: " + entrada.getValue());
            }
            
           
            
           //TreeMap
           Map<String, Figura> treeMap = new TreeMap<>();
           mapFig.put("Triangulo 2", new Triangulo(8, 2,null, "gris"));
           mapFig.put("Cuadrado 2", new Cuadrado (5));
           
           //Recorrer TreeMap
            for (Map.Entry<String, Figura> entrada : treeMap.entrySet()){
                System.out.println("Clave: " + entrada.getKey() +  "; Valor: " + entrada.getValue());
            }
            
            Map<Figura, String> mapFig2 = new TreeMap<>();
            mapFig2.put(new Triangulo(3, 9, null, "cyan"), "Triangulo 1");
            mapFig2.put(new Cuadrado (2), "Cuadrado 2");
            mapFig2.put(new Cuadrado (7), "Cuadrado 7");
            mapFig2.put(new Cuadrado (5), "Cuadrado 5");
            mapFig2.put(new Circulo (5), "Circulo 5");
            mapFig2.put(new Circulo (2), "Circulo 2");
            
            System.out.println(">>>>>>>>>>>MAPA ORDENADO<<<<<<<<<<<<<");
            
            //Función anónima
           /* mapFig2.forEach((clave, valor) -> {
                System.out.println("Clave: " + clave /*toString()
                        + "; Area: " + clave.calcArea()
                        + "; Valor: " + valor.toString());
            }); */ 
           
           //Esto sería lo mismo que esto:
           mapFig2.forEach(LectorFiguras:: funcMostrarFigValor);
    }
    
    //Función sustituta de la función anónima de arriba
    static void funcMostrarFigValor (Figura clave, String valor){
        System.out.println("Clave: " + clave /*toString()*/
                        + "; Area: " + clave.calcArea()
                        + "; Valor: " + valor.toString());
    }
   
}
