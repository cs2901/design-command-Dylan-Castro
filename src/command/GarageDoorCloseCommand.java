package command;

public class GarageDoorCloseCommand implements Command{
    Garage_Door garage_door;

    public GarageDoorCloseCommand(Garage_Door garage_door) {
        this.garage_door = garage_door;
    }

    @Override
    public void execute() {
        garage_door.close();
    }
}
