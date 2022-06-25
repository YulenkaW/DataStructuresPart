

/**
 * CIS2353 winter 2022
 * @author Yuliya Wickens
 * project 2
 */

public class ScoreList {
    
    ScoreNode head =null;
    ScoreList () {
        this.head=null;
        
    }
    ScoreList (ScoreList list)
    {
     head=list.head;
     ScoreNode copyList=list.head.next;
     
     while (copyList!=null){
         add(copyList.name,copyList.score);
         copyList=copyList.next;
     }
    }
   
    void add (String name, int score){
        ScoreNode newNode = new ScoreNode(name, score);
        ScoreNode node =this.head;
        ScoreNode previousNode=null;
        while (node!=null&&node.score>score){
            previousNode=node;
            node=node.next;
        
    }
        if (previousNode==null) {
            newNode.next=this.head;
            this.head=newNode;
        }
        else {
         newNode.next=node;
         previousNode.next=newNode;
        }
    }
    void remove (String removing){
        ScoreNode node =head;
        ScoreNode previousNode = null;
        
        if (node!=null&& node.name.equals(removing)) {
            head =node.next;
            
        }
        while (node !=null&& !node.name.equals(removing)){
            previousNode=node;
            node=node.next;
            
        }
        if (node!=null) {
            previousNode.next=node.next;
            node.destructor();
            System.out.println (removing + "found and deleted");
                      
        }
        if (node==null) {
            System.out.println (removing + " not found");
            
        }
    }
    public void print(){
        ScoreNode copyList=head;
        while (copyList!=null){
            System.out.println(copyList.name+ "    " +copyList.score);
            copyList=copyList.next;
        }
    }
    
        
}
