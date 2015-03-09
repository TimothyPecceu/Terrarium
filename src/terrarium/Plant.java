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
public class Plant extends Organisme{

    public Plant(int xLocatie, int yLocatie) {
        super(xLocatie, yLocatie);
    }   

    @Override
    public void herbivoorActie(Herbivoor herbivoor) {
        herbivoor.setActie(new HerbivoorEet(herbivoor));
        herbivoor.actie();
    }

    @Override
    public void carnivoorActie(Carnivoor carnivoor) {
        carnivoor.setActie(new CarnivoorPlant());
        carnivoor.actie();
    }

    @Override
    public String toString() {
        return "P";
    }

}
