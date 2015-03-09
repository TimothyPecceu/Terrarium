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

    public HerbivoorEet(Herbivoor herbivoor) {
        this.herbivoor = herbivoor;
    }
    
    @Override
    public void voerUit() {
        Terrarium.getInstance().removeOrganisme(herbivoor.getxLocatie(), herbivoor.getyLocatie()+1);
        herbivoor.verhoogLevensKracht(1);
    }
    
}
