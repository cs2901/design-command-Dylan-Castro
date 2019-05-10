package command;

public class LightKitchenOffCommand implements Command {
    Light light;

    public LightKitchenOffCommand(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        System.out.println("Kitchen:");
        light.off();
    }
}
