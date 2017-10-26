package myfirstgame.kaiju;

import org.junit.Before;
import org.junit.Test;

import myfirstgame.kaiju.kaiju.Godzilla;
import myfirstgame.kaiju.vehicles.Helicopter;
import myfirstgame.kaiju.vehicles.Tank;

import static org.junit.Assert.assertEquals;

/**
 * Created by James on 25/10/2017.
 */

public class VehicleTest {
    Helicopter helicopter;
    Tank tank;
    Godzilla godzilla;

    @Before
    public void before() {
        helicopter = new Helicopter("Helicopter", 500);
        tank = new Tank("Tank", 100);
        godzilla = new Godzilla("Godzilla", 1000, 10);

    }
    @Test
    public void hasName() throws Exception {
        assertEquals("Helicopter", helicopter.getType());
    }

    @Test
    public void hasHealth() throws Exception {
        assertEquals(500, helicopter.getHealthValue());
    }

    @Test
    public void canTakeDamage() throws Exception {
        tank.takeDamage(10);
        assertEquals(90, tank.getHealthValue());
    }

    @Test
    public void cantHaveNegativeHealth() throws Exception {
        tank.takeDamage(tank.getHealthValue() + 1);
        assertEquals(0, tank.getHealthValue());
    }

}
