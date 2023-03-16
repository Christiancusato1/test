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
public class Contador {
    private int number;

    public Contador(int number) {
        this.number = number;
    }

    public Contador() {
        this.number = 0;
    }

    /**
     * @return the number
     */
    public int getNumber() {
        return number;
    }
    public void sumar(int num){
        number += num;
        
    }
    public void restar(int num){
        number -= num;
    }
        public void multiplicar(int num){
        number = num*number;
    }
    public void dividir(int num){
        number = number/num;
    }
    public void setNumero(int numero){
        this.number = numero;
    }
}
