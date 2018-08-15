package designpatterns.creational.abstractfactory.pattern;

import designpatterns.creational.abstractfactory.pattern.parts.Boeing747Cockpit;
import designpatterns.creational.abstractfactory.pattern.parts.Boeing747Engine;
import designpatterns.creational.abstractfactory.pattern.parts.Boeing747Wings;
import designpatterns.creational.abstractfactory.pattern.parts.ICockpit;
import designpatterns.creational.abstractfactory.pattern.parts.IEngine;
import designpatterns.creational.abstractfactory.pattern.parts.IWings;

public class Boeing747Factory implements IAircraftFactory {

    @Override
    public IEngine createEngine() {
        return new Boeing747Engine();
    }

    @Override
    public IWings createWings() {
        return new Boeing747Wings();
    }

    @Override
    public ICockpit createCockpit() {
        return new Boeing747Cockpit();
    }
}
