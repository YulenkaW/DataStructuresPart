/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package qeuedemo;

/**
 *
 * @author Yuliya
 */
public class QeueDemo {

    
    public static void main(String[] args) {
       MaxPriorityQueue <Integer> maxPriorityQueue = new MaxPriorityQueue <Integer> ();
       maxPriorityQueue.enqueue(4);
       maxPriorityQueue.enqueue(25);
       maxPriorityQueue.enqueue(8);
       maxPriorityQueue.enqueue(10);
       maxPriorityQueue.enqueue(30);
       maxPriorityQueue.enqueue(33);
       
       while ( !maxPriorityQueue.isEmpty()) {
       System.out.println(maxPriorityQueue.removeFront());
       
      // System.out.println(maxPriorityQueue);
       }       
        
        
    }
    
}
