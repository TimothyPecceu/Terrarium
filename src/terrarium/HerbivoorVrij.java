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
public class HerbivoorVrij implements Actie{

    OrganismeFactory factory = new OrganismeFactory();
    @Override
    public void voerUit() {
        Terrarium.getInstance().addOrganisme(factory.createOrganisme("herbivoor"));
    }
    
}
