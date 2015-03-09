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

    private Locatie locatie;

    public Organisme(Locatie locatie) {
        this.locatie = locatie;
    }

    public Locatie getLocatie() {
        return locatie;
    }

    public void setLocatie(Locatie locatie) {
        this.locatie = locatie;
    }
        
    public abstract void carnivoorActie(Carnivoor carnivoor);

    public abstract void herbivoorActie(Herbivoor herbivoor);

}
