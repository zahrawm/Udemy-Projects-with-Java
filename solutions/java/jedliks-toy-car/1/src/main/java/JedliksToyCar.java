public class JedliksToyCar {
    private int distance;
    private int battery;
    public JedliksToyCar() {
        distance = 0;
        battery = 100;
    }
    public static JedliksToyCar buy() {
        JedliksToyCar car = new JedliksToyCar();
        return car;
    }
    public void drive() {
        if (battery == 0) {
            return;
        }
        distance = distance + 20;
        battery = battery - 1;
    }
    
    public String distanceDisplay() {
    return "Driven " + distance + " meters";
}
    public String batteryDisplay() {
    if (battery == 0) {
        return "Battery empty";
    }
    return "Battery at " + battery + "%";
}
}