/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package terrarium;

import java.util.Random;

/**
 *
 * @author hans
 */
public abstract class Dier extends Organisme {

    private int levensKracht;

    enum Richting {

        OMHOOG, OMLAAG, LINKS, RECHTS
    };

    Random random = new Random();
    Richting[] alleRichtingen = Richting.values();
    
    private Actie actie;
        
    public Dier(int xLocatie, int yLocatie) {
        super(xLocatie, yLocatie);
        levensKracht = 0;
    }

    public void verhoogLevensKracht(int verhoging) {
        levensKracht += verhoging;
    }

    public int getLevensKracht() {
        return levensKracht;
    }
    
    public void omhoog(){
        int x = getxLocatie()-1;
        setxLocatie(x);
   }
   
   public void omlaag(){
       int x = getxLocatie()+1;
       setxLocatie(x);
   }
   
   public void links(){
       int y = getyLocatie()-1;
       setyLocatie(y);
   }
   
   public void rechts(){
       int y = getyLocatie()+1;
       setyLocatie(y);
   }

    public void stap() {

        
        Richting richting = alleRichtingen[random.nextInt(alleRichtingen.length)];
        
        switch (richting) {
            case OMHOOG:
                omhoog();
                break;
            case OMLAAG:
                omlaag();
                break;
            case LINKS:
                links();
                break;
            case RECHTS:
                rechts();
                break;
            default:
                break;
        }

    }

    public void setActie(Actie actie) {
        this.actie = actie;
    }
    
    public void actie(){
        actie.voerUit();
    }
}
