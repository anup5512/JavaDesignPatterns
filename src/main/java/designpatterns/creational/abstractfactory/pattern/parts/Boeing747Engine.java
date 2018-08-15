package designpatterns.creational.abstractfactory.pattern.parts;

public class Boeing747Engine implements IEngine {

    @Override
    public void start() {
        System.out.println("Boeing747 engine on");
    }
}
