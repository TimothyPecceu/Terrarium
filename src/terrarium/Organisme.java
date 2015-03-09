/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package terrarium;

/**
 *
 * @author hans
 */
public abstract class Organisme {
    private int xLocatie;
    private int yLocatie;

    public Organisme(int xLocatie, int yLocatie) {
        this.xLocatie = xLocatie;
        this.yLocatie = yLocatie;
    }

    public int getxLocatie() {
        return xLocatie;
    }

    public int getyLocatie() {
        return yLocatie;
    }

    public void setxLocatie(int xLocatie) {
        this.xLocatie = xLocatie;
    }

    public void setyLocatie(int yLocatie) {
        this.yLocatie = yLocatie;
    }
   public abstract void carnivoorActie(Carnivoor carnivoor);
   public abstract void herbivoorActie(Herbivoor herbivoor);

   
}
