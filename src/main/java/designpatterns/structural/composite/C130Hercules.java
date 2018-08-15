package designpatterns.structural.composite;

public class C130Hercules implements IAircraft, IAlliancePart {

    @Override
    public int getPersonnel() {
        // This cargo plane, needs
        return 5;
    }
}
