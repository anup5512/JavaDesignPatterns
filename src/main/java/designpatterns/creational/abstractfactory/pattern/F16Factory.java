package designpatterns.creational.abstractfactory.pattern;

import designpatterns.creational.abstractfactory.pattern.parts.F16Cockpit;
import designpatterns.creational.abstractfactory.pattern.parts.F16Engine;
import designpatterns.creational.abstractfactory.pattern.parts.F16Wings;
import designpatterns.creational.abstractfactory.pattern.parts.ICockpit;
import designpatterns.creational.abstractfactory.pattern.parts.IEngine;
import designpatterns.creational.abstractfactory.pattern.parts.IWings;

public class F16Factory implements IAircraftFactory {

    @Override
    public IEngine createEngine() {
        return new F16Engine();
    }

    @Override
    public IWings createWings() {
        return new F16Wings();
    }

    @Override
    public ICockpit createCockpit() {
        return new F16Cockpit();
    }
}
