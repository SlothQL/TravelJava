public class Plane {

    private PlaneType planeType;

    public Plane(PlaneType planeType) {
        this.planeType = planeType;
    }

    public PlaneType getPlaneType() {
        return planeType;
    }

    public int getCapacityOfPlaneType() {
        return this.planeType.getCapacity();
    }

    public int getTotalWeightOfPlaneType() {
        return this.planeType.getTotalWeight();
    }

    public int weightForAllBags() {
        int weight = this.getTotalWeightOfPlaneType();
        return weight / 2;
    }

    // functionality moved to FlightManager
    public int weightOfBagPerPerson() {
        int weightAllBags = this.weightForAllBags();
        return weightAllBags / this.getCapacityOfPlaneType();
    }
}
