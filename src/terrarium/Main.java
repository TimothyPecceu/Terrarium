/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package terrarium;

import java.util.Scanner;

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
        terrarium.addOrganisme(factory.createOrganisme("herbivoor"));
        terrarium.addOrganisme(factory.createOrganisme("carnivoor"));
        terrarium.addOrganisme(factory.createOrganisme("carnivoor"));
        terrarium.addOrganisme(factory.createOrganisme("plant"));
        terrarium.addOrganisme(factory.createOrganisme("plant"));
        
        terrarium.printTerrarium();
        
        System.out.println("Geef 'V' in voor volgende dag, 'S' om te stoppen:");
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        
        while(!input.toUpperCase().equals("S")){
            if(input.toUpperCase().equals("V")){
                terrarium.nieuweDag();
                terrarium.printTerrarium();
            }
            System.out.println("Geef 'V' in voor volgende dag, 'S' om te stoppen:");
            input = scanner.nextLine();
        }
    }
    
}
