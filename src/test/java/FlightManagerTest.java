import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FlightManagerTest {

    Plane plane;
    Flight flight;
    Passenger passenger;
    Passenger passenger2;
    FlightManager flightManager;

    @Before
    public void before() {
        plane = new Plane(PlaneType.BOEING707);
        flight = new Flight(plane, "FR756", "CDG", "EDI", "14:30");
        passenger = new Passenger("Ben", 2);
        passenger2 = new Passenger("Alina", 1);
        flightManager = new FlightManager();
        flight.add(passenger);
        flight.add(passenger2);
    }

    @Test
    public void canCalculateBaggageWeightForEachPassenger() {
        assertEquals(20, flightManager.weightOfBagPerPerson(flight));
    }

    @Test
    public void canCalculateBookedBaggageWeight() {
        assertEquals(40, flightManager.getTotalBookedBaggageWeight(flight));
    }

    @Test
    public void canCalculateRemainingWeight() {
        assertEquals(1960, flightManager.getRemainingBaggageWeight(flight));
    }
}
