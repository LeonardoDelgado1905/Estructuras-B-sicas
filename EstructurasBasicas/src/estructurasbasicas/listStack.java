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
public class listStack<T> {
    
    class ChainNode<T>{
        T val;
        ChainNode prev;
        public ChainNode() {
        }
        public ChainNode(T val, ChainNode next) {
            this.val = val;
            this.prev = next;
        }
    }
    ChainNode<T> topNode;
    
    boolean isEmpty(){
        return topNode == null;
    }
    
    void put(T element){
        topNode = new ChainNode<>(element, topNode);
    }
    
    T peek(){
        return (isEmpty() ? null : topNode.val);
    }
    
    T remove(){
        if(isEmpty()) return null;
        T save = topNode.val;
        topNode = topNode.prev;
        return save;
    }
}
