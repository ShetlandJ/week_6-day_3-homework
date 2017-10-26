package myfirstgame.kaiju;

 
import org.junit.Before;
import org.junit.Test;

import myfirstgame.kaiju.kaiju.Godzilla;
import myfirstgame.kaiju.vehicles.Tank;

import static org.junit.Assert.assertEquals;

/**
 * Created by James on 25/10/2017.
 */

public class KaijuTest {

    Godzilla godzilla;
    Tank tank;

    @Before
    public void before() {
        godzilla = new Godzilla("Godzilla", 1000, 100);
        tank = new Tank("TankieBOYE", 1500);
    }

    @Test
    public void hasName() throws Exception {
        assertEquals("Godzilla", godzilla.getName());
    }

    @Test
    public void hasHealth() throws Exception {
        assertEquals(1000, godzilla.getHealthValue());
    }

    @Test
    public void hasAttack() throws Exception {
        assertEquals(100, godzilla.getAttackValue());
    }

    @Test
    public void canRoar() throws Exception {
        assertEquals("Roar", godzilla.roar());
    }

    @Test
    public void canAttackVehicle() throws Exception {
        godzilla.attack(tank);
        assertEquals(1400, tank.getHealthValue());
    }

//    @Test
//    public void canCriticalHit() throws Exception {
//        assertEquals(5, godzilla.getCriticalHit());
//    }


}
