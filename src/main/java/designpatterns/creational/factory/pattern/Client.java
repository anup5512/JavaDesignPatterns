package designpatterns.creational.factory.pattern;

import java.util.ArrayList;
import java.util.Collection;

public class Client {

    public void invokeClient() {

        F16 factory = new F16A();
        // The client gets passed a concrete factory for
        // the F16-A model
        //        main(factory);
    }

    public void main() {
        Collection<F16> myAirForce = new ArrayList<F16>();
        F16 f16A = new F16A();
        F16 f16B = new F16B();
        myAirForce.add(f16A);
        myAirForce.add(f16B);

        for (F16 f16 : myAirForce) {
            f16.fly();
        }
    }

    public void useSimpleFactory() {
        F16SimpleFactory simpleFactory = new F16SimpleFactory();
        F16 f16 = simpleFactory.makeF16("A");
        f16.fly();
    }
}
