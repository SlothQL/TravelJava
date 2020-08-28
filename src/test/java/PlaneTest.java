import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PlaneTest {

    Plane plane;

    @Before
    public void before() {
        plane = new Plane(PlaneType.BOEING707);
    }

    @Test
    public void hasPlaneType() {
        assertEquals(PlaneType.BOEING707, plane.getPlaneType());
    }

    @Test
    public void canGetCapacityOfPlaneType() {
        assertEquals(100, plane.getCapacityOfPlaneType());
    }

    @Test
    public void canGetTotalWeightOfPlaneType() {
        assertEquals(4000, plane.getTotalWeightOfPlaneType());
    }

    @Test
    public void capacityLeftForBags() {
        assertEquals(2000, plane.weightForAllBags());
    }

    @Test
    public void weightOfBagPerPerson() {
        assertEquals(20, plane.weightOfBagPerPerson());
    }


}
