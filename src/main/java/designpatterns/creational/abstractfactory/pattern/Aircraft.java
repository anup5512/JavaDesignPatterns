package designpatterns.creational.abstractfactory.pattern;

import designpatterns.creational.abstractfactory.pattern.parts.ICockpit;
import designpatterns.creational.abstractfactory.pattern.parts.IEngine;
import designpatterns.creational.abstractfactory.pattern.parts.IWings;

public class Aircraft {

    IEngine engine;
    ICockpit cockpit;
    IWings wings;
    IAircraftFactory factory;

    public Aircraft(IAircraftFactory factory) {
        this.factory = factory;
    }

    protected Aircraft makeAircraft() {
        engine = factory.createEngine();
        cockpit = factory.createCockpit();
        wings = factory.createWings();
        return this;

    }

    private void taxi() {
        System.out.println("Taxing on runway");
    }

    public void fly() {
        Aircraft aircraft = makeAircraft();
        aircraft.taxi();
        System.out.println("Flying");
    }
}
