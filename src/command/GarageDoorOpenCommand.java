package command;

public class GarageDoorOpenCommand implements Command{
    Garage_Door garage_door;

    public GarageDoorOpenCommand(Garage_Door garage_door) {
        this.garage_door = garage_door;
    }

    @Override
    public void execute() {
        garage_door.open();
    }
}
