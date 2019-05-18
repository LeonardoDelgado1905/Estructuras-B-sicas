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
public interface Queue<T> {
    boolean isEmpty();
    void put(T element);
    T peek();
    T remove();
}
