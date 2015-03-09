/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package terrarium;

import java.util.Random;

/**
 *
 * @author hans
 */
public class OrganismeFactory {
    
    Random random = new Random();
    
    public Organisme createOrganisme(String organisme){
        switch(organisme){
            case "plant":
                return new Plant(new Locatie(random.nextInt(6),random.nextInt(6)));
            case "herbivoor":
                return new Herbivoor(new Locatie(random.nextInt(6),random.nextInt(6)));
            case "carnivoor":
                return new Carnivoor(new Locatie(random.nextInt(6),random.nextInt(6)));
            default:
                return null;
        }
    }
}
