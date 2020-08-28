public enum PlaneType {

    BOEING747(80, 600),
    AirbusA380(20, 340),
    BOEING707(100, 4000),
    CONCORDE(50, 700),
    TINYPLANE(1, 80);
    ;

    private int capacity;
    private int totalWeight;

    PlaneType(int capacity, int totalWeight) {
        this.capacity = capacity;
        this.totalWeight = totalWeight;
    }

    public int getCapacity() {
        return capacity;
    }

    public int getTotalWeight() {
        return totalWeight;
    }
}
