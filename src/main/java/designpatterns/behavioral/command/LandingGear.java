package designpatterns.behavioral.command;

/**
 * This is the receiver class, that actually knows how to
 * perform the action
 */
public class LandingGear {

    public void up() {
        System.out.println("Landing gear up");
    }

    public void down() {
        System.out.println("Landing gear down");
    }
}
