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
public class Locatie {
    private int x;
    private int y;

    public Locatie(int x, int y) {
        this.x = x;
        this.y = y;
    }
    
    public void omhoog(){
        x--;
    }
    
    public void omlaag(){
        x++;
    }
    
    public void links(){
        y--;
    }
    
    public void rechts(){
        y++;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }
    
}
