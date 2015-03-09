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
public class CarnivoorEet implements Actie{

    Carnivoor carnivoor;
    Herbivoor herbivoor;

    public CarnivoorEet(Carnivoor carnivoor, Herbivoor herbivoor) {
        this.carnivoor = carnivoor;
        this.herbivoor = herbivoor;
    }
    
    
    @Override
    public void voerUit() {
        System.out.println("Carnivoor eet Herbivoor");
        Terrarium.getInstance().removeOrganisme(herbivoor.getxLocatie(), herbivoor.getyLocatie());
        carnivoor.verhoogLevensKracht(herbivoor.getLevensKracht());
    }
}
