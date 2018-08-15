package designpatterns.creational.factory.pattern.parts;

public class F16Engine implements IEngine {

    @Override
    public void start() {
        System.out.println("F16 generic engine started");
    }
}
