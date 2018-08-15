package designpatterns.behavioral.observer;

public class F16 implements IObserver, IAircraft {

    ISubject observable;

    public F16(ISubject observable) {
        this.observable = observable;
        observable.addObserver(this);
    }

    @Override
    public void fly() {
        System.out.println("F16 is flying ...");

    }

    @Override
    public void land() {

        // Don't forget to unsubscribe from control tower updates
        observable.removeObserver(this);
    }

    @Override
    public void update(Object newState) {

        // If the newState is not null, then it is a PUSH from the
        // observer

        // If the newState is null, then the observer can choose to
        // selectively call getter methods on the subject to access
        // the information the observer is interested in. This would
        // constitue the PULL model.

    }
}
