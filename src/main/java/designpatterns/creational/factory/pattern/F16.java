package designpatterns.creational.factory.pattern;

import designpatterns.creational.factory.pattern.parts.F16Cockpit;
import designpatterns.creational.factory.pattern.parts.F16Engine;
import designpatterns.creational.factory.pattern.parts.ICockpit;
import designpatterns.creational.factory.pattern.parts.IEngine;

public class F16 {

    IEngine engine;
    ICockpit cockpit;

    public F16 makeF16() {
        engine = new F16Engine();
        cockpit = new F16Cockpit();
        return this;
    }

    private void taxi() {
        System.out.println("F16 is taxing on the runway !");
    }

    public void fly() {
        F16 f16 = makeF16();
        f16.taxi();
        System.out.println("F16 is in the air !");
    }
}
