package designpatterns.behavioral.state;

public class TaxiState implements IPilotActions {

    F16 f16;

    public TaxiState(F16 f16) {
        this.f16 = f16;
    }

    @Override
    public void pilotFlies(F16 f16) {
        f16.setState(f16.getAirborneState());
    }

    @Override
    public void pilotEjects(F16 f16) {
        f16.setState(f16.getCrashState());
    }

    @Override
    public void pilotLands(F16 f16) {
        System.out.println("This is an invalid operation for this state");
    }

    @Override
    public void pilotParks(F16 f16) {
        f16.setState(f16.getParkedState());
    }

    @Override
    public void pilotTaxies(F16 f16) {
        System.out.println("This is an invalid operation for this state");
    }
}
