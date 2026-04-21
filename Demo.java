 interface Computer{
    public void start();
}

class Laptop implements Computer{

    public void start(){
        System.out.println("Starting laptop...");
    }
}

class Desktop implements Computer{
    public void start(){
        System.out.println("Starting desktop...");
    }
}

class Developer{
    public void devApps(Computer lap){
        lap.start();
        System.out.println("coding ...");
    }
}

public class Demo {
    public static void main(String[] args) {
         Computer lap = new Laptop();
         Computer desk = new Desktop();
        Developer dev = new Developer();

        dev.devApps(lap);
    }
}

