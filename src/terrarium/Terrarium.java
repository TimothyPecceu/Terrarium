/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package terrarium;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author hans
 */
public class Terrarium {

    private static Terrarium uniqueInstance;
    private final List<Organisme> organismen;


    private Terrarium() {
        organismen = new ArrayList<>();

    }

    public static Terrarium getInstance() {
        if (uniqueInstance == null) {
            uniqueInstance = new Terrarium();
        }

        return uniqueInstance;
    }

    public void addOrganisme(Organisme organisme) {
        organismen.add(organisme);
    }

    public void removeOrganisme(Organisme organisme) {
        organismen.remove(organisme);
    }

    public void nieuweDag() {
        for(Organisme organisme: organismen){
            
        }
    }

    public void printTerrarium() {
        
    }
}
