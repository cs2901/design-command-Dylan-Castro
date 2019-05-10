package command;

public class CeilingFanStatusHighCommand implements Command{
    Ceiling_Fan ceiling_fan;

    public CeilingFanStatusHighCommand(Ceiling_Fan ceiling_fan) {
        this.ceiling_fan = ceiling_fan;
    }

    @Override
    public void execute() {
        ceiling_fan.high();
    }
}
