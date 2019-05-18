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
public class listQueue<T>{
    
    class ChainNode<T>{
        T val;
        ChainNode next;
        public ChainNode() {
        }
        public ChainNode(T val, ChainNode next) {
            this.val = val;
            this.next = next;
        }
    }
    
    ChainNode<T> front, rear;
    
    //@Override
    public boolean isEmpty() {
        return front == null;
    }

    //@Override
    public void put(T element) {
        ChainNode<T> p = new ChainNode<>(element, null);
        if(front == null) front = p;
        else rear.next = p;
        rear = p;
    }

    //@Override
    public T peek() {
        return (isEmpty() ? null : front.val);
    }

    //@Override
    public T remove() {
        if(isEmpty()){
            rear = null;
            return null;
        }
        T save = front.val;
        front = front.next;
        return save;
    }
    
}
