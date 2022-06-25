

package project4;

import java.io.*;
import java.util.Scanner;

/// Yuliya Wickens
// CIS 2353
// Winter 2022
// Prof. John P. Baugh

 
public class Project4 {

    
    public static void main(String[] args) {
       
        TriageSimulator data = new TriageSimulator();

try
{
            try (Scanner infile = new Scanner(new File("patients.txt"))) {
                while(infile.hasNextLine())
                {
                    data.add(infile.nextLine());
                }           }

System.out.println("Names by the priority:");
while(!data.isEmpty())
{
System.out.println(data.remove());
}
}
catch (FileNotFoundException e)
{
System.out.println("File cannot be opened");
}
}
}


        
        
        
    
    

