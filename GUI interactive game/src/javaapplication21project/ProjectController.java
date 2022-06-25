package javaapplication21project;



import java.net.URL;
import java.util.Random;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;


public class ProjectController implements Initializable {
Player player;
boolean canSearch;
Monster monster;
        
        
    @FXML
    private Button South;
    @FXML
    private Button East;
    @FXML
    private Button West;
    @FXML
    private Button North;
    @FXML
    private TextField textFieldStatus;
    @FXML
    private TextField hitPlayerlText;
    @FXML
    private TextField strengthPlText;
    @FXML
    private TextField dexterityPlText;
    @FXML
    private TextField intellPlText;
    @FXML
    private TextField goldPlText;
    @FXML
    private TextField hitMonsterText;
    @FXML
    private TextField strengthMonsterText;
    @FXML
    private TextField inlellMonsterText;
    @FXML
    private Button rollButtonPl;
    @FXML
    private Button dice;
    @FXML
    private TextField rollText;
    @FXML
    private TextField diceText;
    @FXML
    private TextField dexterityMonsterText;

        
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        player=new Player();
        monster=new Monster();
       hitPlayerlText.setText(String.valueOf(player.getHitPoints()));
       strengthPlText.setText(String.valueOf(player.getStrength()));
       dexterityPlText.setText(String.valueOf(player.getDexterity()));
       intellPlText.setText(String.valueOf(player.getIntelligence()));
       goldPlText.setText(String.valueOf(player.getGold()));
      canSearch=true;
      hitMonsterText.setText(String.valueOf(monster.getHitPoints()));
      strengthMonsterText.setText(String.valueOf(monster.getStrength()));
      inlellMonsterText.setText(String.valueOf(monster.getIntelligence()));
      dexterityMonsterText.setText(String.valueOf(monster.getDexterity()));
    }    

    @FXML
    private void southClick(ActionEvent event) {
        Random random = new Random();
        int randomNumber = random.nextInt(4) + 1;
        textFieldStatus.setText(Integer.toString(randomNumber));
         if (randomNumber==1){
            textFieldStatus.setText("you hit the wall, try more");
        }
         else{
              textFieldStatus.setText("you are in the room, press the marker <in room>");      
         }   
    }

    @FXML
    private void eastClick(ActionEvent event) {
        Random random = new Random();
        int randomNumber = random.nextInt(4) + 1;
        textFieldStatus.setText(Integer.toString(randomNumber));
         if (randomNumber==1){
            textFieldStatus.setText("you hit the wall, try more");
        }
         else{
              textFieldStatus.setText("you are in the room, press the marker <in room>");      
                    }

    }


    @FXML
    private void westClick(ActionEvent event) {
        Random random = new Random();
        int randomNumber = random.nextInt(4) + 1;
        textFieldStatus.setText(Integer.toString(randomNumber));
         if (randomNumber==1){
            textFieldStatus.setText("you hit the wall, try more");
        }
         else{
              textFieldStatus.setText("you are in the room, press the marker <in room> and roll");      
                    }

    }

    @FXML
    private void northClick(ActionEvent event) {
        Random random = new Random();
        int randomNumber = random.nextInt(4) + 1;
        textFieldStatus.setText(Integer.toString(randomNumber));
         if (randomNumber==1){
            textFieldStatus.setText("you hit the wall, try more");}
        else{
              textFieldStatus.setText("you are in the room, press the marker <in room>");      
                    }
        
    }
    

    @FXML
    private void FightClick(ActionEvent event) {
        
textFieldStatus.setText("Press dice to create damage");

    }

    @FXML
    private void runClick(ActionEvent event) {
     textFieldStatus.setText("press Monster is here-if he saw you!");   
        }
    
    @FXML
    private void sleepClick(ActionEvent event) {
       textFieldStatus.setText("roll while sleep"); 
        Random random = new Random();
        int randomNumber = random.nextInt(6) + 1;
        rollText.setText(Integer.toString(randomNumber));
         if (randomNumber==1){
            rollText.setText("here monster- attacking!");
        }
         else {
       rollText.setText("you regain the points, roll ");
       goldPlText.setText(String.valueOf(player.regain()));
         }
       
     }
    

    @FXML
    private void searchClick(ActionEvent event) {
     if (canSearch){
         
     canSearch =false;
     
        textFieldStatus.setText("hit search to find the gold"); 
        Random random = new Random();
        int randomNumber = random.nextInt(20) + 1;
        int levelIntellPl=player.getIntelligence();
        textFieldStatus.setText(Integer.toString(randomNumber));
        textFieldStatus.setText(String.valueOf(intellPlText));
         if (randomNumber < levelIntellPl){
             int Gold=random.nextInt(60)+1;
             
            textFieldStatus.setText("you found "+Gold+ " gold!");
            player.setGold(Gold); 
            goldPlText.setText(String.valueOf(player.getGold()));
         }
         else {
            textFieldStatus.setText("not smart enough, try more ");    
         }   
     } 
     else
     {
       textFieldStatus.setText("better make a move first");   
     }
    }
   

    @FXML
    private void ClickInRoom(ActionEvent event) {
        textFieldStatus.setText("choose action: sleep/search/fight and roll");
       
    }

    @FXML
    private void clickMonsterHere(ActionEvent event) {
         Random random = new Random();
       int rand ;
        int randomNumber = random.nextInt(20) + 1;        
         if (randomNumber <monster.getIntelligence()){
             rand=player.getHitPoints()-randomNumber;
             hitPlayerlText.setText(String.valueOf(rand));}
             else{
         textFieldStatus.setText("you are lucky-he did not see you!");   
            
                     }
    }

    @FXML
    private void clickStart(ActionEvent event) {
         textFieldStatus.setText("hello. Choose direction-room");
        hitPlayerlText.setText("20");
        
        Random random = new Random();
        
                int randomNumber = random.nextInt(6) + 1;
        rollText.setText(Integer.toString(randomNumber));
         if (randomNumber==2){
            rollText.setText("here is a monster- attacking!");
        }
         else{
              rollText.setText("be aware,monsters around");      
                  }
    }

    @FXML
    private void clickRollPlayer(ActionEvent event) {
         
        Random random = new Random();
        int randomNumber = random.nextInt(3) + 1;
        rollText.setText(Integer.toString(randomNumber));
         if (randomNumber==2){
            rollText.setText("here is a monster- attacking!");
        }
         else{
              rollText.setText("be aware,monsters around");      
                  }

    }

    @FXML
    private void clickDice(ActionEvent event) {
        diceMethod();
       
        
    }

   public int diceMethod(){
       Random random = new Random();
       int rand = 0;
       int damageLev;
       int lev;
       int levPl;
       int monsterAttack=11;
       int life =player.getStrength();

       int randomNumber = random.nextInt(20) + 1;
       diceText.setText(String.valueOf(randomNumber)+" points damage was hit!");
      levPl=player.getHitPoints();
        
        
         if (randomNumber > monster.getDexterity()){
             damageLev=player.getStrength()/3;
             lev=monster.getHitPoints();
             rand=monster.getHitPoints()-damageLev;
           hitMonsterText.setText(String.valueOf(rand));
          if (lev==0){
            textFieldStatus.setText("Your enemy is dead");  
          }  
          if (damageLev<1){
             textFieldStatus.setText("Try one more time");           
          }
         
                   
         if (rand==4){
             textFieldStatus.setText("Monster is attacking!");
             damageLev=monster.getStrength()/3;
             rand=player.getHitPoints()-damageLev;
           hitPlayerlText.setText(String.valueOf(rand));
         }
         if (levPl==0){
            textFieldStatus.setText("You lost. Game over");  
          }  
          if (damageLev<1){
             textFieldStatus.setText("Try one more time");         
          }
          if (life==0){
            textFieldStatus.setText("You are dead.Game over");           
                            
          }
              
        else {
             
                 textFieldStatus.setText("You did not hit strong enough");
                 
             }
            
    } 
    return rand;     
   }
}

     




