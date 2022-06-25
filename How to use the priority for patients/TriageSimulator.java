
package project4;


import java.util.*;

/// Yuliya Wickens
// CIS 2353
// Winter 2022
// Prof. John P. Baugh

  public class TriageSimulator  {

      
      
private Queue<String> firstQueue;
private Queue<String> secondQueue;
private Queue<String> thirdQueue;

public TriageSimulator()
{
firstQueue = new LinkedList<String>();
secondQueue = new LinkedList<String>();
thirdQueue = new LinkedList<String>();
}

public void add(String lineFromFile)
{
String[] data = lineFromFile.split(" ");


//changed to case from if as netBeans recommend
    switch (data[2]) {
        case "AL":
        case "HA":
        case "ST":
            firstQueue.add(data[0] + " " + data[1]+" "+data[2]);
            break;
        case "BL":
        case "SF":
        case "IW":
        case "KS":
        case "OT":
        
            secondQueue.add(data[0] + " " + data[1]+" "+data[2]);
            break;
        case "HN":
            thirdQueue.add(data[0] + " " + data[1]+" "+data[2]);
            break;
        default:
            System.out.println("Invalid data");
            break;
    }
}

public String remove()
{
 if(!firstQueue.isEmpty())
return firstQueue.remove();

if(!secondQueue.isEmpty())
return secondQueue.remove();

if(!thirdQueue.isEmpty())
return thirdQueue.remove();

return null;
}


public boolean isEmpty()
{
return firstQueue.isEmpty() && secondQueue.isEmpty() && thirdQueue.isEmpty();
}
}

 