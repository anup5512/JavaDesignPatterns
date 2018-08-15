package designpatterns.creational.abstractfactory.pattern.parts;

public class F16Engine implements IEngine {

    @Override
    public void start() {
        System.out.println("F16 engine on");
    }
}
