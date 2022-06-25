
package listadt;

/**
 *
 * @author Yuliya
 */
public class DoubelyLinkedClass <T> 
{
private Node dummyNode;
private int numberOfItems=0;

public DoubelyLinkedClass () {
    dummyNode = new  Node (null, null, null);
    dummyNode.next =dummyNode;
    dummyNode.previous=dummyNode;
}
public void add (T data) {
   addBetween (data, dummyNode.previous, dummyNode);
        
}
public void add (int index, T data) {
    if (index >numberOfItems) {
        
            throw new IndexOutOfBoundsException () ;
        }
    if (index ==numberOfItems) {
        add(data);
    } else {
        Node currentNode = dummyNode;
        for (int currentIndex = 0; currentIndex <index; currentIndex++){
            currentNode = currentNode.next;
            
        }
        addBetween (data,currentNode, currentNode.next) ;
        
    }
    public T remove (int index) {
    
}
    private void checkForValidIndex (int index) {
        if (index >numberOfItems) {
            throw new IndexOutOfBoundsException ();
            
        }
    }
   
        
    
 private void addBetween (T data, Node previous, Node next) {
     Node newNode = new Node (data, previous, next);
        newNode.previous.next =newNode;
        newNode.next.previous =newNode;
        numberOfItems++;
     
}

public int size () {
    return numberOfItems;
}
public boolean isEmpty () {
    return numberOfItems==0;
}

class Node <T> {
    public Node previous;
    public Node next;
    public T  data;
    
    
    public Node (T data, Node previous, Node next) {
        this.data =data;
        this.previous =previous;
        this.next =next;
}
    
      
    
}   




}
