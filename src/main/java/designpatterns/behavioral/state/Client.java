package designpatterns.behavioral.state;

public class Client {

    public void main() {

        F16 f16 = new F16();
        f16.startsEngine();
        f16.fliesPlane();
        f16.ejectsPlane();

    }

    /**
     * This is how the code would look like if we weren't to use the State Pattern
     */
    public void pilotTaxies(String currentState) {

        if (currentState == "Parked") {

            currentState = "Taxi";
            System.out.println("Plane is taxing on the runway.");

        } else if (currentState == "Airborne") {

            System.out.println("This is an invalid operation for this state");

        } else if (currentState == "Land") {

            System.out.println("This is an invalid operation for this state");

        } else if (currentState == "Crashed") {

            System.out.println("This is an invalid operation for this state");

        } else if (currentState == "Taxi") {
            System.out.println("Plane is already taxing on the runway.");
        }

    }
}
