class NeedForSpeed {
    private int battery;
    private int distance;
    private int speed;
    private int batteryDrain;

    NeedForSpeed(int speed, int batteryDrain) {
        this.speed = speed;
        this.batteryDrain = batteryDrain;
        battery = 100;
        distance = 0;
    }

    public static NeedForSpeed nitro() {
        NeedForSpeed car = new NeedForSpeed(50, 4);
        return car;
    }

    public void drive() {
        if (battery < batteryDrain) {
            return;
        }
        distance = distance + speed;
        battery = battery - batteryDrain;
    }

    public int distanceDriven() {
        return distance;
    }

    public boolean batteryDrained() {
        return battery < batteryDrain;
    }
}

class RaceTrack {
    private int distance;

    RaceTrack(int distance) {
        this.distance = distance;
    }

    public boolean canFinishRace(NeedForSpeed car) {
        while (!car.batteryDrained()) {
            car.drive();
            if (car.distanceDriven() >= distance) {
                return true;
            }
        }
        return false;
    }
}