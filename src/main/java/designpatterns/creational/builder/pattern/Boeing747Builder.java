package designpatterns.creational.builder.pattern;

public class Boeing747Builder extends AircraftBuilder {

    Boeing747 boeing747;

    @Override
    public void buildCockpit() {

    }

    @Override
    public void buildEngine() {

    }

    @Override
    public void buildWings() {

    }

    @Override
    public void buildBathrooms() {

    }

    public IAircraft getResult() {
        return boeing747;
    }
}
