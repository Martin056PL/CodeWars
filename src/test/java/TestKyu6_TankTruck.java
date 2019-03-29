import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestKyu6_TankTruck {

    @Test
    public void ShouldBeEqualsForData() {
        assertEquals(2940, kyu6_TankTruck.tankVol(5, 7, 3848));
        assertEquals(907, kyu6_TankTruck.tankVol(2, 7, 3848));
    }
}
