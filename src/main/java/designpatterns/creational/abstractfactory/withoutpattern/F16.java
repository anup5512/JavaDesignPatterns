package designpatterns.creational.abstractfactory.withoutpattern;

public class F16 {

    F16Engine engine;
    F16Cockpit cockpit;
    F16Wings wings;

    public F16 makeAircraft() {
        engine = new F16Engine();
        cockpit = new F16Cockpit();
        wings = new F16Wings();
        return this;
    }

    void taxi() {
        System.out.println("F16 with bad design taxing ...");

    }

    public void fly() {
        F16 f16 = makeAircraft();
        f16.taxi();
        System.out.println("Flying");
    }
}
