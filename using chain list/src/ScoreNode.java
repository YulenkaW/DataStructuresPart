

/**
 * CIS2353 winter 2022
 * @author Yuliya Wickens
 * project 2
 */
public class ScoreNode {
  
    String name;
    int score;
    ScoreNode next;

    ScoreNode (String name, int score){
        this.name=name;
        this.score=score;
        this.next=null;
    }
    
    protected void destructor () {
        System.out.println( "Node deleted");
    }
    
    
}
