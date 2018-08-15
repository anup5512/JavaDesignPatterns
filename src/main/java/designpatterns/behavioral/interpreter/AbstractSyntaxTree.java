package designpatterns.behavioral.interpreter;

public class AbstractSyntaxTree {

    public Program getNextNode() {

        // Returning a dummy instance of Program
        // abstract class
        return new Flight();
    }

    public boolean hasNext() {
        return true;
    }
}
