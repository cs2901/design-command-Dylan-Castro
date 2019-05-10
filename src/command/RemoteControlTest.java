package command;

public class RemoteControlTest {
    public static void main(String[] args) {
        SimpleRemoteControl remote = new SimpleRemoteControl();
        //////////////////////////////////////////////////////////////
        Light light = new Light();
        //////////////////////////////////////////////////////////////
        LightLivingRoomOnCommand lightLVOn = new LightLivingRoomOnCommand(light);
        remote.setCommand(lightLVOn);
        remote.buttonWasPressed();
        //////////////////////////////////////////////////////////////
        LightLivingRoomOffCommand lightLVOff = new LightLivingRoomOffCommand(light);
        remote.setCommand(lightLVOff);
        remote.buttonWasPressed();
        //////////////////////////////////////////////////////////////
        LightKitchenOnCommand lightKCOn = new LightKitchenOnCommand(light);
        remote.setCommand(lightKCOn);
        remote.buttonWasPressed();
        //////////////////////////////////////////////////////////////
        LightKitchenOffCommand lightKCOff = new LightKitchenOffCommand(light);
        remote.setCommand(lightKCOff);
        remote.buttonWasPressed();
        //////////////////////////////////////////////////////////////
        Ceiling_Fan ceiling_fan = new Ceiling_Fan();
        //////////////////////////////////////////////////////////////
        CeilingFanStatusHighCommand ceiling_fanHigh = new CeilingFanStatusHighCommand(ceiling_fan);
        remote.setCommand(ceiling_fanHigh);
        remote.buttonWasPressed();
        //////////////////////////////////////////////////////////////
        CeilingFanStatusLowCommand ceiling_fanLow = new CeilingFanStatusLowCommand(ceiling_fan);
        remote.setCommand(ceiling_fanLow);
        remote.buttonWasPressed();
        //////////////////////////////////////////////////////////////
        Garage_Door garage_door = new Garage_Door();
        //////////////////////////////////////////////////////////////
        GarageDoorOpenCommand garageDoorOpen = new GarageDoorOpenCommand(garage_door);
        remote.setCommand(garageDoorOpen);
        remote.buttonWasPressed();
        //////////////////////////////////////////////////////////////
        GarageDoorCloseCommand garageDoorClose = new GarageDoorCloseCommand(garage_door);
        remote.setCommand(garageDoorClose);
        remote.buttonWasPressed();
        //////////////////////////////////////////////////////////////
        Stereo stereo = new Stereo();
        //////////////////////////////////////////////////////////////
        StereoOnCommand stereoOpen = new StereoOnCommand(stereo);
        remote.setCommand(stereoOpen);
        remote.buttonWasPressed();
        //////////////////////////////////////////////////////////////
        StereoOffCommand stereoClose = new StereoOffCommand(stereo);
        remote.setCommand(stereoClose);
        remote.buttonWasPressed();
    }
}
