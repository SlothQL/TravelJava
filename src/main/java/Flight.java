import java.util.ArrayList;

public class Flight {

    private ArrayList<Passenger> passengers;
    private Plane plane;
    private String flightNumber;
    private String destination;
    private String departureAirport;
    private String departureTime;

    public Flight(Plane plane, String flightNumber, String destination, String departureAirport, String departureTime) {
        this.plane = plane;
        this.flightNumber = flightNumber;
        this.destination = destination;
        this.departureAirport = departureAirport;
        this.departureTime = departureTime;
        this.passengers = new ArrayList<Passenger>();
    }

    public Plane getPlane() {
        return plane;
    }

    public String getFlightNumber() {
        return flightNumber;
    }

    public String getDestination() {
        return destination;
    }

    public String getDepartureAirport() {
        return departureAirport;
    }

    public String getDepartureTime() {
        return departureTime;
    }

    public int getNumberOfPassengers() {
        return this.passengers.size();
    }

    public int getRemainingSeats() {
        int allSeats = this.plane.getCapacityOfPlaneType();
        return allSeats - this.getNumberOfPassengers();
    }

    public void add(Passenger passenger) {
        if (this.getRemainingSeats() > 0) {
            this.passengers.add(passenger);
        }
    }

    public int getPlaneWeightForAllBags() {
        return this.plane.weightForAllBags();
    }

    public int getPlaneCapacity() {
        return this.plane.getCapacityOfPlaneType();
    }
}
