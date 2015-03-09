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
public class Carnivoor extends Dier {

    public Carnivoor(Locatie locatie) {
        super(locatie);
    } 

    public void interactie(Organisme organisme){
        organisme.carnivoorActie(this);
    }

    @Override
    public void carnivoorActie(Carnivoor carnivoor) {
        carnivoor.setActie(new CarnivoorVecht(carnivoor, this));
        carnivoor.actie();
    }

    @Override
    public void herbivoorActie(Herbivoor herbivoor) {
        herbivoor.setActie(new HerbivoorCarnivoor());
        herbivoor.actie();
    }
    
    

    @Override
    public String toString() {
        return "C";
    }
    
    
    
    
}
