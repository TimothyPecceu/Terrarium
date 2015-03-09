/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package terrarium;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author hans
 */
public class Terrarium {

    private static Terrarium uniqueInstance;
    private final Map<Locatie, Organisme> organismen;

    private Terrarium() {
        organismen = new HashMap<>();

    }

    public static Terrarium getInstance() {
        if (uniqueInstance == null) {
            uniqueInstance = new Terrarium();
        }

        return uniqueInstance;
    }

    public void addOrganisme(Organisme organisme) {

        organismen.putIfAbsent(organisme.getLocatie(), organisme);

    }

    public void removeOrganisme(Organisme organisme) {
        
    }

    public void nieuweDag() {

    }

    public void printTerrarium() {

    }
}
