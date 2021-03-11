
package Ejercicio4;

import java.util.Random;

public class PairOfDice implements Dice{
    
// Atributos-------------------------------------------------------------------
    protected Integer dice1;
    protected Integer dice2;
    private final Random aleatorio = new Random();

// Contructores----------------------------------------------------------------

    public PairOfDice() {
        
    }
    
// Metodos---------------------------------------------------------------------
    @Override
    public void roll(){
        this.dice1 =  aleatorio.nextInt(6)+1;
        this.dice2 =  aleatorio.nextInt(6)+1;
    }
    
    public void valor(){
        Integer suma;
        
        suma = this.dice1 + this.dice2;
        
        System.out.println("Dado 1 = "+ dice1+"\nDado 2 = "
                            +dice2+"\nEs igual a "+suma);
    }
}
