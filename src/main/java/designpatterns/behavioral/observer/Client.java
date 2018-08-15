package designpatterns.behavioral.observer;

public class Client {

    public void main() {

        ControlTower controlTower = new ControlTower();
        F16 f16 = new F16(controlTower);
        f16.fly();
        f16.land();
    }
}
