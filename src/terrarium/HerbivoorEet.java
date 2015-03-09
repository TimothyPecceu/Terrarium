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
public class HerbivoorEet implements Actie{

    Herbivoor herbivoor;
    Plant plant;

    public HerbivoorEet(Herbivoor herbivoor, Plant plant) {
        this.herbivoor = herbivoor;
        this.plant=plant;
    }
    
    @Override
    public void voerUit() {
        Terrarium.getInstance().removeOrganisme(plant);
        herbivoor.verhoogLevensKracht(1);
    }
    
}
