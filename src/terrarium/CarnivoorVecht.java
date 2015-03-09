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
public class CarnivoorVecht implements Actie {
    
    Carnivoor carnivoorLinks;
    Carnivoor carnivoorRechts;

    public CarnivoorVecht(Carnivoor carnivoorLinks, Carnivoor carnivoorRechts) {
        this.carnivoorLinks = carnivoorLinks;
        this.carnivoorRechts = carnivoorRechts;
    }

    @Override
    public void voerUit() {
        if (carnivoorLinks.getLevensKracht() > carnivoorRechts.getLevensKracht()) {
            carnivoorLinks.verhoogLevensKracht(carnivoorRechts.getLevensKracht());
            Terrarium.getInstance().removeOrganisme(carnivoorRechts);
        } else if (carnivoorLinks.getLevensKracht() < carnivoorRechts.getLevensKracht()) {
            carnivoorRechts.verhoogLevensKracht(carnivoorLinks.getLevensKracht());
            Terrarium.getInstance().removeOrganisme(carnivoorLinks);
        }
    }
    
}
