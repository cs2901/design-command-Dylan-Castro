package command;

public class LightKitchenOnCommand implements Command {
    Light light;

    public LightKitchenOnCommand(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        System.out.println("Kitchen:");
        light.on();
    }
}
