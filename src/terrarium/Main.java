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
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        OrganismeFactory factory = new OrganismeFactory();
        Terrarium terrarium = Terrarium.getInstance();
        
        terrarium.addOrganisme(factory.createOrganisme("herbivoor"));
        terrarium.printTerrarium();
        terrarium.nieuweDag();
        terrarium.printTerrarium();
        terrarium.nieuweDag();
        terrarium.printTerrarium();
        terrarium.nieuweDag();
    }
    
}
