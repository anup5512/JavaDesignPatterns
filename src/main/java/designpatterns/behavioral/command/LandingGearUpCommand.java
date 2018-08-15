package designpatterns.behavioral.command;

/**
 * This is the command class
 */
public class LandingGearUpCommand implements Command {

    LandingGear landingGear;

    public LandingGearUpCommand(LandingGear landingGear) {
        this.landingGear = landingGear;
    }

    @Override
    public void execute() {
        landingGear.up();
    }
}
