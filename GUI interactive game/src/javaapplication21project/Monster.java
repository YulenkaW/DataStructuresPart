/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication21project;

import java.util.Random;


public class Monster {
    
 private int hitPoints;
 private int Dexterity;
 private int Intelligence;
 private int Strength;
 private String rollString;

    public Monster() {
       hitPoints = baseCharacter();
        Dexterity = hitPoints*2;
        Intelligence = hitPoints*2;
        Strength = hitPoints*2;
        //rollString = rollString;
    }

   
    
 public static int baseCharacter(){
     Random rand =new Random();
     int total=rand.nextInt(7)+1;
     for (int index=0; index<6&&index>0; index++){
        }
   return total;
 }

 
 public int getHitPoints() {
        return hitPoints;
    }

    
    public void setHitPoints(int hitPoints) {
        this.hitPoints = hitPoints;
    }

    public int getDexterity() {
        return Dexterity;
    }

    public void setDexterity(int Dexterity) {
        this.Dexterity = Dexterity;
    }

    /**
     * @return the Intelligence
     */
    public int getIntelligence() {
        return Intelligence;
    }

    /**
     * @param Intelligence the Intelligence to set
     */
    public void setIntelligence(int Intelligence) {
        this.Intelligence = Intelligence;
    }

    /**
     * @return the Strength
     */
    public int getStrength() {
        return Strength;
    }

    /**
     * @param Strength the Strength to set
     */
    public void setStrength(int Strength) {
        this.Strength = Strength;
    }

    /**
     * @return the rollString
     */
    public String getRollString() {
        return rollString;
    }

    /**
     * @param rollString the rollString to set
     */
    public void setRollString(String rollString) {
        this.rollString = rollString;
    }
 
    
    
    
}
