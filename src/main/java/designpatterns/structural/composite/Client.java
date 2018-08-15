package designpatterns.structural.composite;

public class Client {

    public void main() {

        Airforce NatoAllaiance = new Airforce();

        NatoAllaiance.add(createCanadaAirForce());
        NatoAllaiance.add(createUSAAirForce());

        F16 frenchF16 = new F16();
        C130Hercules germanCargo = new C130Hercules();

        NatoAllaiance.add(frenchF16);
        NatoAllaiance.add(germanCargo);

        System.out.println(NatoAllaiance.getPersonnel());
    }

    IAlliancePart createUSAAirForce() {

        F16 f16 = new F16();
        F16 f16Trainer = new F16();

        Airforce usaAirforce = new Airforce();
        usaAirforce.add(f16);
        usaAirforce.add(f16Trainer);

        return usaAirforce;
    }

    IAlliancePart createCanadaAirForce() {

        C130Hercules hercules1 = new C130Hercules();
        C130Hercules hercules2 = new C130Hercules();

        Airforce canadaAirfoce = new Airforce();
        canadaAirfoce.add(hercules1);
        canadaAirfoce.add(hercules2);

        return canadaAirfoce;
    }
}
