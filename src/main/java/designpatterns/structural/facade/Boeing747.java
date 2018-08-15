package designpatterns.structural.facade;

public class Boeing747 implements IAircraft {

    AutopilotFacade autopilot;

    public Boeing747() {
        // Compose the autopilot facade with the right subsystems.
        autopilot = new AutopilotFacade(new BoeingAltitudeMonitor(), new BoeingEngineController(),
                                        new BoeingFuelMonitor(), new BoeingNavigationSystem());

    }

    public void engageAutoPilot() {
        autopilot.autopilotOn();
    }

    public void disengageAutoPilot() {
        autopilot.autopilotOff();
    }
}
