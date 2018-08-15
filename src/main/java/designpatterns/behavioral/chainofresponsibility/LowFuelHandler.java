package designpatterns.behavioral.chainofresponsibility;

public class LowFuelHandler extends AbstractHandler {

    // Only interested in handling requests with code 1
    private static int code = 2;

    public LowFuelHandler(AbstractHandler successor) {
        super(successor);
    }

    @Override
    public void handleRequest(AbstractRequest request) {
        if (code == request.getRequestCode()) {
        } else {
            super.handleRequest(request);
        }
    }
}
