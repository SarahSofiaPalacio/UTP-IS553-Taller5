
package Ejercicio6;

import java.util.ArrayList;
import java.util.List;


public class ListaReales implements Estadisticas<Double>{
//--atributos------------------------------------------------------------------    
    protected ArrayList<Double> listaReales = new ArrayList<>();
     
//--metodos--------------------------------------------------------------------    
    public  void llenarLista() {
         for (double i=0; i < listaReales.size(); i++) {
            listaReales.add(i);
        }
    }
    
    @Override
    public Double obtenerMinimo() {
       double min = listaReales.get(0);
       for (int i=0; i < listaReales.size(); i++) {
            if (listaReales.get(i) < min) {
                min = listaReales.get(i);
            }
        } 
       return min;
    }

    @Override
    public Double obtenerMaximo() {
        double max =0;
        for (int i=0; i < listaReales.size(); i++) {
            if (listaReales.get(i) > max) {
                max = listaReales.get(i);
            }
            ;
        }
        return max;
    }

    @Override
    public Double calcularMedia() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Double calcularPromedio() {
        double sum;
        double promedio;
        sum = calcularSumar();
        promedio = sum/listaReales.size();
        
        return promedio;
    }

    @Override
    public Double calcularSumar() {
       double suma = 0;
        for (int i=0; i < listaReales.size(); i++) {
                suma = listaReales.get(i) + suma;
            } 
        
        return suma;   
    }
    
    public void resultados(double suma, double max, double min) {
        
    }

   
}
