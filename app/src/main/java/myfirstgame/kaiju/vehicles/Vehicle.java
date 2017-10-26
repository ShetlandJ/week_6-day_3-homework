package myfirstgame.kaiju.vehicles;

/**
 * Created by James on 25/10/2017.
 */

public abstract class Vehicle {
    private String type;
    private int healthValue;

    public Vehicle(String type, int healthValue) {
        this.type = type;
        this.healthValue = healthValue;
    }

    public String getType() {
        return this.type;
    }

    public int getHealthValue() {
        return this.healthValue;
    }

    public void setHealthValue(int healthValue) {
        this.healthValue = healthValue;
    }

    public void takeDamage(int attack_level){

        this.healthValue -= attack_level;
        if (this.healthValue < 0 ){
            this.healthValue = 0;
        }
    }



}