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
public class Herbivoor extends Dier {

    public Herbivoor(int x, int y) {
        super(x,y);
    }

    @Override
    public void carnivoorActie(Carnivoor carnivoor) {
        carnivoor.setActie(new CarnivoorEet(carnivoor, this));
        carnivoor.actie();
    }

    @Override
    public void herbivoorActie(Herbivoor herbivoor) {
        herbivoor.setActie(new HerbivoorVrij());
        herbivoor.actie();
    }

    public void interactie(Organisme organisme) {
        organisme.herbivoorActie(this);
    }

    @Override
    public String toString() {
        return "H";
    }
    
    
    
}
