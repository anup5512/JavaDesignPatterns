package designpatterns.behavioral.iterator;

import java.util.List;

public class JetsIterator implements Iterator {

    List<IAircraft> jets;
    int position = 0;

    public JetsIterator(List<IAircraft> jets) {
        this.jets = jets;
    }

    @Override
    public IAircraft next() {

        if (position < jets.size()) {
            return jets.get(position++);
        }

        throw new RuntimeException("No more elements exist.");
    }

    @Override
    public boolean hasNext() {
        return position < jets.size();
    }
}
