package designpatterns.behavioral.visitor.doubledispatch;

public class Client {

    public void singleDispatch() {

        F16 f16 = new F16();
        f16.whoAmI();

        System.out.println();

        // Reference for the derived object
        // is held in the superclass type
        F16 betterF16 = new BetterF16();
        betterF16.whoAmI();
    }

    public void doubleDispatch() {

        F16 f16 = new F16();
        F16 betterF16 = new BetterF16();
        Missile missile = new Missile();
        Missile betterMissile = new BetterMissile();

        System.out.println("Expected output");
        System.out.print("f16.fireMissile(missile)");
        f16.fireMissile(missile);
        betterF16.fireMissile(missile);
        System.out.println();

        System.out.println("Failed double dispatch attempt");
        f16.fireMissile(betterMissile);
        betterF16.fireMissile(betterMissile);

        System.out.println("Expected output");
        BetterMissile reallyBetterMissile = new BetterMissile();
        f16.fireMissile(reallyBetterMissile);
        betterF16.fireMissile(reallyBetterMissile);
    }

}
