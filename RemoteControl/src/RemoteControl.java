public class RemoteControl {

    private final Device device;

    public RemoteControl(Device device) {
        this.device = device;
    }

    public void pressTurnOn(){
        device.turnOn();
    }

    public void pressTurnOff(){
        device.turnOff();
    }


}
