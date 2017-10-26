package myfirstgame.kaiju.kaiju;

import java.util.Random;

import myfirstgame.kaiju.vehicles.Vehicle;

/**
 * Created by James on 25/10/2017.
 */

public abstract class Kaiju {
    private String name;
    private int healthValue;
    private int attackValue;

    public Kaiju(String name, int healthValue, int attackValue) {
        this.name = name;
        this.healthValue = healthValue;
        this.attackValue = attackValue;
    }

    public String getName() {
        return name;
    }

    public int getHealthValue() {
        return healthValue;
    }

    public int getAttackValue() {
        return attackValue;
    }

    public abstract String roar();

    public int getCriticalHit(){
        Random rand = new Random();

        return rand.nextInt(6) + 1;
    }

    public void attack(Vehicle vehicle){
        int vehicleHealth = vehicle.getHealthValue();
        int monsterAttack = this.attackValue;

// check for critical hit, if so, double monster attack
        if (getCriticalHit() >= 4 && vehicleHealth > (monsterAttack * 2)) {
            int critHealthValue = vehicleHealth - (monsterAttack * 2);
            vehicle.setHealthValue(critHealthValue);

// number was less than four? no critical hit for you!
        } else if (vehicleHealth > monsterAttack) {
            int newHealthValue = vehicleHealth - monsterAttack;
            vehicle.setHealthValue(newHealthValue);

// you're dead mate
        } else {
             vehicle.setHealthValue(0);
        }

    }

}
