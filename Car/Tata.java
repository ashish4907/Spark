package Car;

import java.util.Comparator;

public class Tata implements Comparator<Object> {
    String model;

    Tata(String model) {
        this.model = model;
    }

    @Override
    public int compare(Object o1, Object o2) {

        return 0;
    }

    @Override
    public String toString() {

        return super.toString();
    }
}
