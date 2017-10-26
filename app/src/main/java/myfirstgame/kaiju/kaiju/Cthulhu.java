package myfirstgame.kaiju.kaiju;

import myfirstgame.kaiju.behaviours.Movable;

/**
 * Created by James on 25/10/2017.
 */

public class Cthulhu extends Kaiju implements Movable {
    public Cthulhu(String name, int healthValue, int attackValue) {
        super(name, healthValue, attackValue);
    }

    public String roar(){
        return "Roar";
    }

    public String move(){
        return "SCHLEP SCHLEP SCHLEP";
    }


}
