import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FlightTest {

    Flight flight;
    Plane plane;
    Passenger passenger;
    Passenger passenger2;

    @Before
    public void before() {
        plane = new Plane(PlaneType.BOEING707);
        flight = new Flight(plane, "FR756", "CDG", "EDI", "14:30");
        passenger = new Passenger("Ben", 2);
        passenger2 = new Passenger("Alina", 1);
    }

    @Test
    public void hasPlane() {
        assertEquals(plane, flight.getPlane());
    }

    @Test
    public void hasFlightNumber() {
        assertEquals("FR756", flight.getFlightNumber());
    }

    @Test
    public void hasDestination() {
        assertEquals("CDG", flight.getDestination());
    }

    @Test
    public void hasDepartureAirport() {
        assertEquals("EDI", flight.getDepartureAirport());
    }

    @Test
    public void hasDepartureTime() {
        assertEquals("14:30", flight.getDepartureTime());
    }

    @Test
    public void startsWithoutPassengers() {
        assertEquals(0, flight.getNumberOfPassengers());
    }

    @Test
    public void canReturnNumberOfAvailableSeats() {
        assertEquals(100, flight.getRemainingSeats());
    }

    @Test
    public void canBookPassenger() {
        flight.add(passenger);
        assertEquals(1, flight.getNumberOfPassengers());
        assertEquals(99, flight.getRemainingSeats());
    }

    @Test
    public void cannotBookPassenger() {
        Plane tinyPlane = new Plane(PlaneType.TINYPLANE);
        Flight tinyFlight = new Flight(tinyPlane,"FR756", "CDG", "EDI", "10:00");
        tinyFlight.add(passenger);
        tinyFlight.add(passenger2);
        assertEquals(1, tinyFlight.getNumberOfPassengers());
        assertEquals(0, tinyFlight.getRemainingSeats());
    }

}
