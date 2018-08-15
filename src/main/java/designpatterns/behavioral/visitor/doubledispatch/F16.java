package designpatterns.behavioral.visitor.doubledispatch;

public class F16 {

    public String whoAmI() {
        return "F16";
    }

    public void fireMissile(Missile missile) {
        System.out.print(whoAmI() + " fired ordinary missile: " + missile.explode());
    }

    public void fireMissile(BetterMissile missile) {
        System.out.print(whoAmI() + " fired better missile: " + missile.explode());
    }
}
