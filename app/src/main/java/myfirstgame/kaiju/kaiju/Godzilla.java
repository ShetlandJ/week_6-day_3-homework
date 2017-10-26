package myfirstgame.kaiju.kaiju;

import myfirstgame.kaiju.behaviours.Damagable;
import myfirstgame.kaiju.behaviours.Movable;
import myfirstgame.kaiju.vehicles.Tank;
import myfirstgame.kaiju.vehicles.Vehicle;

/**
 * Created by James on 25/10/2017.
 */

public class Godzilla extends Kaiju implements Movable {
    public Godzilla(String name, int healthValue, int attackValue) {
        super(name, healthValue, attackValue);
    }

    public String roar(){
        return "Roar";
    }

    public String move(){
        return "STOMP STOMP STOMP";
    }


}
