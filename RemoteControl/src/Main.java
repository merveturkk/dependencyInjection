public class Main {

    public static void main(String[] args) {

        // create device
        Device airConditioner = new AirConditioner();
        Device tv = new Tv();

        // create remote control
        RemoteControl remoteControlTv= new RemoteControl(tv);
        RemoteControl remoteControlAir = new RemoteControl(airConditioner);

        remoteControlTv.pressTurnOn();
        remoteControlTv.pressTurnOff();
        remoteControlAir.pressTurnOn();
        remoteControlAir.pressTurnOff();







    }
}