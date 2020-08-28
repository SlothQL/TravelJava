public class FlightManager {

    public int weightOfBagPerPerson(Flight flight) {
        int weightAllBags =  flight.getPlaneWeightForAllBags();
        return weightAllBags / flight.getPlaneCapacity();
    }

    public int getTotalBookedBaggageWeight(Flight flight) {
        int bookedPassengers = flight.getNumberOfPassengers();
        return bookedPassengers * this.weightOfBagPerPerson(flight);
    }

    public int getRemainingBaggageWeight(Flight flight) {
        int weightAllBags =  flight.getPlaneWeightForAllBags();
        return weightAllBags - this.getTotalBookedBaggageWeight(flight);
    }
}
