/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estructurasbasicas;

/**
 *
 * @author santi
 */
public class EstructurasBasicas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        listQueue<Integer> cola = new listQueue<>();
        listStack<Integer> pila = new listStack<>();
        
        pila.put(10);
        pila.put(20); 
        pila.put(30);
        System.out.println(pila.remove());
        System.out.println(pila.remove());
        System.out.println(pila.remove());
        System.err.println(pila.isEmpty());
    }
}
