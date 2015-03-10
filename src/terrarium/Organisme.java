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

    public int getXLocatie() {
        return xLocatie;
    }

    public void setXLocatie(int xLocatie) {
        this.xLocatie = xLocatie;
    }

    public int getYLocatie() {
        return yLocatie;
    }

    public void setYLocatie(int yLocatie) {
        this.yLocatie = yLocatie;
    }


    public abstract void carnivoorActie(Carnivoor carnivoor);

    public abstract void herbivoorActie(Herbivoor herbivoor);
    
    public void stap(){};

}
