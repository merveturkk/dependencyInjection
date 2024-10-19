public class AirConditioner implements Device {

    @Override
    public void turnOn() {
        System.out.println("Air condition is turn on");
    }

    @Override
    public void turnOff() {
        System.out.println("Air condition is turn off");

    }
}
