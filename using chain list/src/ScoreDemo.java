
import java.io.*;
import java.util.Arrays;
import java.util.Scanner;



/**
 * CIS2353 winter 2022
 * @author Yuliya Wickens
 * project 2
 */
public class ScoreDemo {
    
    
    public static void main (String args[])   throws IOException  {
            Scanner file = new Scanner (new File ("scores.txt"));
      ScoreList list =new ScoreList();
      while (file.hasNext()) {
          list.add(file.next(),file.nextInt());
      }
      file.close();
      System.out.println("Score list: ");
      list.print();
      
      Scanner input =new Scanner (System.in);
      
      while (true) {
          System.out.println ("Would you like to add "
                  + "another (1) or remove (2) or quit the program (3)?");
          int choice=Integer.parseInt (input.nextLine());
          
          if (choice == 1)
          {
              System.out.println ("Write the name followed by score");
              String line =input.nextLine();
              String[] values =line.split(" ");
              list.add (values[0], Integer.parseInt (values[1]));
              
              Arrays.sort(values);
              System.out.println ("The new score are: ");
              list.print();
              
           }
          
          else if (choice==2) {
              System.out.println("Write the name to remove");
              String line =input.nextLine();  
              
              list.remove (line); 
              System.out.println ("The new score are: ");
              list.print();
            
          }

          else if (choice==3) {
               System.out.println ("Thanks for using the program. Bye");
              break;
          }
          
          else {
              System.out.println ("Invalid option");
              
              
          }
          
      }
    }
    
    
    
    
      
      
      
        
        
        
        
    }
    
    

