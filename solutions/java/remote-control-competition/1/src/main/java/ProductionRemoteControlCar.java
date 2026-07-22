class ProductionRemoteControlCar implements RemoteControlCar, Comparable<ProductionRemoteControlCar> {
    private int distance;
    private int numberOfVictories;
    ProductionRemoteControlCar() {
        distance = 0;
        numberOfVictories = 0;
    }
    public void drive() {
        distance = distance + 10;
    }
    public int getDistanceTravelled() {
        return distance;
    }
    public int getNumberOfVictories() {
        return numberOfVictories;
    }
    public void setNumberOfVictories(int numberOfVictories) {
        this.numberOfVictories = numberOfVictories;
    }

    @Override
    public int compareTo(ProductionRemoteControlCar other) {
        // Descending order of victories: car with more victories comes first
        return Integer.compare(other.numberOfVictories, this.numberOfVictories);
    }
}