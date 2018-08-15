package designpatterns.creational.abstractfactory.pattern;

import designpatterns.creational.abstractfactory.pattern.parts.ICockpit;
import designpatterns.creational.abstractfactory.pattern.parts.IEngine;
import designpatterns.creational.abstractfactory.pattern.parts.IWings;

public interface IAircraftFactory {

    IEngine createEngine();

    IWings createWings();

    ICockpit createCockpit();
}
