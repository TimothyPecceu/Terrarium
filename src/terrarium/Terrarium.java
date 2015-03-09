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
public class Terrarium {

    private static Terrarium uniqueInstance;
    private final Organisme[][] organismen;
    private final OrganismeFactory factory;
    private final Random random;

    private Terrarium() {
        organismen = new Organisme[6][6];
        factory = new OrganismeFactory();
        random = new Random();
    }

    public static Terrarium getInstance() {
        if (uniqueInstance == null) {
            uniqueInstance = new Terrarium();
        }

        return uniqueInstance;
    }

    public void addOrganisme(String soort) {

        int x = random.nextInt(6);
        int y = random.nextInt(6);

        while (organismen[x][y] != null) {
            x = random.nextInt(6);
            y = random.nextInt(6);
        }

        organismen[x][y] = factory.createOrganisme(soort, x, y);
    }

    public void removeOrganisme(int x, int y) {
        organismen[x][y] = null;
    }

    public void nieuweDag() {
        int aantal = random.nextInt(3);
        for (int i = 0; i <= aantal; i++) {
            addOrganisme("plant");
        }
        Organisme linkerOrganisme = null;

        for (Organisme[] organismeArray : organismen) {
            for (Organisme organisme : organismeArray) {
                if (linkerOrganisme != null) {
                    if (organisme != null) {
                        linkerOrganisme.interactie(organisme);
                    }else{
                        linkerOrganisme.stap();
                    }                    
                }
                linkerOrganisme = organisme;
            }
            linkerOrganisme = null;
        }

    }

    public void printTerrarium() {
        for (Organisme[] organismeArray : organismen) {
            for (Organisme organisme : organismeArray) {
                if (organisme != null) {
                    System.out.print(" " + organisme + " ");
                } else {
                    System.out.print(" . ");
                }
            }
            System.out.println();
        }
    }
}
