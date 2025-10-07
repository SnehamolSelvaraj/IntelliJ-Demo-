abstract class Appliance {
    private int powerRating; // in Watts

    public Appliance(int powerRating) { this.powerRating = powerRating; }

    public int getPowerRating() { return powerRating; }
    public void setPowerRating(int powerRating) { this.powerRating = powerRating; }

    public abstract void turnOn();
    public abstract void turnOff();
}

class Fan extends Appliance {
    public Fan(int powerRating) { super(powerRating); }

    @Override
    public void turnOn() { System.out.println("Fan is ON"); }
    @Override
    public void turnOff() { System.out.println("Fan is OFF"); }
}

class Light extends Appliance {
    public Light(int powerRating) { super(powerRating); }

    @Override
    public void turnOn() { System.out.println("Light is ON"); }
    @Override
    public void turnOff() { System.out.println("Light is OFF"); }
}

class AC extends Appliance {
    public AC(int powerRating) { super(powerRating); }

    @Override
    public void turnOn() { System.out.println("AC is ON"); }
    @Override
    public void turnOff() { System.out.println("AC is OFF"); }
}

public class SmartHomeTest {
    public static void main(String[] args) {
        Fan f = new Fan(75);
        Light l = new Light(60);
        AC ac = new AC(1500);

        f.turnOn(); l.turnOn(); ac.turnOn();
        f.turnOff(); l.turnOff(); ac.turnOff();
    }
}
