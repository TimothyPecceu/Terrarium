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
public class OrganismeFactory {
    
    public Organisme createOrganisme(String organisme, int x, int y){
        switch(organisme){
            case "plant":
                return new Plant(x,y);
            case "herbivoor":
                return new Herbivoor(x, y);
            case "carnivoor":
                return new Carnivoor(x, y);
            default:
                return null;
        }
    }
}
