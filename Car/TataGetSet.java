

import java.util.Comparator;

public class TataGetSet implements Comparator<Object> {
    private String model;

    @Override
    public int compare(Object o1, Object o2) {

        return 0;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }
}
