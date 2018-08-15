package designpatterns.creational.factory.pattern.parts;

public class F16AEngine extends F16Engine {

    @Override
    public void start() {
        System.out.println("F16-A engine started");
    }
}
