/**
 * To test class PowerFinder
 */

import main.java.powerpackage.PowerFinder;
import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class TestPowerFinder {
    PowerFinder p = new PowerFinder();

    @Test
    public void onePowerOne() {
        assertEquals(p.calculatePower(1,1),1);
    }

    @Test
    public void twoPowerOne() {
        assertEquals(p.calculatePower(2,1),2);
    }

    @Test
    public void twoPowerTwo() {
        assertEquals(p.calculatePower(2,2),4);
    }

    @Test
    public void threePowerTwo() {
        assertEquals(p.calculatePower(3,2),9);
    }


}
