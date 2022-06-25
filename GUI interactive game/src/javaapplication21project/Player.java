package javaapplication21project;

import java.util.Random;


public class Player {
 private int hitPoints;
 private int Dexterity;
 private int Intelligence;
 private int Strength;
 private String rollString;
 private int gold;

 public Player(){
  hitPoints=20; 
 Strength=tripleDice();
 Dexterity=tripleDice();
 Intelligence=tripleDice();
 gold=0;
 }
 
 public int regain(){
     Random rand =new Random();
     int regainGold=0;
     for (int index=0; index>0; index++){
         regainGold+=rand.nextInt(1)+1;
     }
     return regainGold; 
 }
 public static int tripleDice(){
     Random rand =new Random();
     int total=0;
     for (int index=0; index<3; index++){
         total+=rand.nextInt(6)+1;
     }
     return total;
 }
 
public void setHitPoints(int hitPoints) {
        this.hitPoints = hitPoints;
    }

    public int getHitPoints() {
        return hitPoints;
    }

    public int getDexterity() {
        return Dexterity;
    }

    public int getIntelligence() {
        return Intelligence;
    }

    public int getStrength() {
        return Strength;
    }

    public String getRollString() {
        return rollString;
    }

    public int getGold() {
        return gold;
    }
    public void setDexterity(int Dexterity) {
        this.Dexterity = Dexterity;
    }

   
    public void setIntelligence(int Intelligence) {
        this.Intelligence = Intelligence;
    }

    public void setStrength(int Strength) {
        this.Strength += Strength;
    }

        public void setRollString(String rollString) {
        this.rollString = rollString;
    }

    public void setGold(int gold) {
        this.gold+= gold;
    }
    
}
