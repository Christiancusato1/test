/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplointerfaz;

/**
 *
 * @author Usuario
 */
public class Global {
    private static Contador counter = new Contador();

    public static Contador getCounter() {
        return counter;
    }

    public static void setCounter(Contador counter) {
        Global.counter = counter;
    }


    
    
}
