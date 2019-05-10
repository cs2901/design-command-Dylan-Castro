package command;

public class LightLivingRoomOnCommand implements Command{
    Light light;

    public LightLivingRoomOnCommand(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        System.out.println("Living Room:");
        light.on();
    }
}
