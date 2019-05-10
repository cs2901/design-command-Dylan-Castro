package command;

public class CeilingFanStatusLowCommand implements Command{
    Ceiling_Fan ceiling_fan;

    public CeilingFanStatusLowCommand(Ceiling_Fan ceiling_fan) {
        this.ceiling_fan = ceiling_fan;
    }

    @Override
    public void execute() {
        ceiling_fan.low();
    }
}
