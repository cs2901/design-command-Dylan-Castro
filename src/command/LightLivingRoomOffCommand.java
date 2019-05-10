package command;

public class LightLivingRoomOffCommand implements Command{
    Light light;

    public LightLivingRoomOffCommand(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        System.out.println("Living Room:");
        light.off();
    }
}
