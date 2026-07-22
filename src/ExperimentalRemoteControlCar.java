class ExperimentalRemoteControlCar implements RemoteControlCar {
    private int distance;

    ExperimentalRemoteControlCar() {
        distance = 0;
    }

    public void drive() {
        distance = distance + 20;
    }

    public int getDistanceTravelled() {
        return distance;

    }}