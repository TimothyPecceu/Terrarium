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
public class Terrarium {

    private static Terrarium uniqueInstance;
    private final Organisme[][] organismen;

    private Terrarium() {
        organismen = new Organisme[6][6];

    }

    public static Terrarium getInstance() {
        if (uniqueInstance == null) {
            uniqueInstance = new Terrarium();
        }

        return uniqueInstance;
    }

    public void addOrganisme(Organisme organisme) {

        int x = organisme.getXLocatie();
        int y = organisme.getYLocatie();

        if (organismen[x][y] == null) {
            organismen[x][y] = organisme;
        }

    }

    public void removeOrganisme(Organisme organisme) {
        organismen[organisme.getXLocatie()][organisme.getYLocatie()] = null;
    }

    public void nieuweDag() {

        for (Organisme[] organismeArray : organismen) {
            for (Organisme organisme : organismeArray) {
                if (organisme != null) {
                    organisme.stap();
                }
            }
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

    public boolean verplaatsOrganisme(Organisme organisme, int xVerplaatsing, int yVerplaatsing) {
        int x = organisme.getXLocatie();
        int y = organisme.getYLocatie();
        int newX = organisme.getXLocatie() + xVerplaatsing;
        int newY = organisme.getYLocatie() + yVerplaatsing;

        if (newX < organismen.length && newY < organismen.length && newX >= 0 && newY >= 0 ) {
            if (organismen[newX][newY] == null) {
                organismen[newX][newY] = organisme;
                organismen[x][y] = null;
                return true;
            }
        }

        return false;
    }

}
