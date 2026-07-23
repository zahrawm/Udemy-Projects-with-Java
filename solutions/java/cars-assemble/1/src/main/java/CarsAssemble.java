public class CarsAssemble {

    public double productionRatePerHour(int speed) {
        int baseRate = speed * 221;
        double successRate = successRate(speed);
        return baseRate * successRate;
    }

    public int workingItemsPerMinute(int speed) {
        return (int) (productionRatePerHour(speed) / 60);
    }

    private double successRate(int speed) {
        if (speed <= 0) {
            return 0.0;
        } else if (speed <= 4) {
            return 1.0;
        } else if (speed <= 8) {
            return 0.9;
        } else if (speed == 9) {
            return 0.8;
        } else {
            return 0.77;
        }
    }
}