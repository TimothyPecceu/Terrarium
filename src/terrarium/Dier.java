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
public abstract class Dier extends Organisme {

    private int levensKracht;

    enum Richting {

        OMHOOG, OMLAAG, LINKS, RECHTS
    };

    Random random = new Random();
    Richting[] alleRichtingen = Richting.values();

    private Actie actie;

    public Dier(int x, int y) {
        super(x, y);
        levensKracht = 0;
    }

    public void verhoogLevensKracht(int verhoging) {
        levensKracht += verhoging;
    }

    public int getLevensKracht() {
        return levensKracht;
    }

    public void stap() {
        boolean verplaatst = false;
        
        while (!verplaatst) {

            Richting richting = alleRichtingen[random.nextInt(alleRichtingen.length)];

            switch (richting) {
                case OMHOOG:
                    verplaatst=Terrarium.getInstance().verplaatsOrganisme(this, -1, 0);
                    break;
                case OMLAAG:
                    verplaatst=Terrarium.getInstance().verplaatsOrganisme(this, +1, 0);
                    break;
                case LINKS:
                    verplaatst=Terrarium.getInstance().verplaatsOrganisme(this, 0, -1);
                    break;
                case RECHTS:
                    verplaatst=Terrarium.getInstance().verplaatsOrganisme(this, 0, +1);
                    break;
                default:
                    break;
            }
        }

    }

    public void setActie(Actie actie) {
        this.actie = actie;
    }

    public void actie() {
        actie.voerUit();
    }
}
