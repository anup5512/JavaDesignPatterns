package designpatterns.behavioral.interpreter;

public class Context {

    String input;
    int matchedSoFar;

    public Context(String input) {
        this.input = input;
    }
}
