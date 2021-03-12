
package Ejercicio7;

import java.util.ArrayList;
import java.util.List;


public class MyMath implements Extremos<Double>{

    protected List<Double> a = new ArrayList<>();

    @Override
    public Double min(List<Double> a) {
        double min = a.get(0);
        for (int i=0; i < a.size(); i++) {
            if (a.get(i) < min) {
                min = a.get(i);
            }
        } 
       return min;    }

    @Override
    public Double max(List<Double> a) {
        double max =0;
        for (int i=0; i < a.size(); i++) {
            if (a.get(i) > max) {
                max = a.get(i);
            }
            ;
        }
        return max;   
    }
    
    public void resultados(double max, double min){
        System.out.println("El numero maximo es "+max
                           +"\nEl numero minimo es "+min);
    }
    
}
