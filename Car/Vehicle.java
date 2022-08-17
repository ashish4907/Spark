package Car;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

class Vehicle {
    public static void main(String[] args) {
        ArrayList<Object> arrayList = new ArrayList<Object>();
        arrayList.add(new Tata("Nexon"));
        arrayList.add(new Audi("A4"));
        arrayList.add(new Tesla("Model S"));
        arrayList.add(new Hyundai("i30"));
        arrayList.add(new BMW("i8"));
        arrayList.add(new Tata("Punch"));
        arrayList.add(new Audi("A6"));
        arrayList.add(new Tesla("Model X"));
        arrayList.add(new Hyundai("i40"));
        arrayList.add(new BMW("i2"));

        ArrayList<BMW> bmwList = new ArrayList<BMW>();
        ArrayList<Audi> audiList = new ArrayList<Audi>();
        ArrayList<Tesla> teslaList = new ArrayList<Tesla>();
        ArrayList<Hyundai> hyundaiList = new ArrayList<Hyundai>();
        ArrayList<Tata> tataList = new ArrayList<Tata>();

        for (Object object : arrayList) {
            if (object instanceof BMW) {
                bmwList.add((BMW) object);
            } else if (object instanceof Audi) {
                audiList.add((Audi) object);
            } else if (object instanceof Tesla) {
                teslaList.add((Tesla) object);
            } else if (object instanceof Hyundai) {
                hyundaiList.add((Hyundai) object);
            } else if (object instanceof Tata) {
                tataList.add((Tata) object);
            }
        }

        Vehicle vehicle = new Vehicle();
        vehicle.toIterate(bmwList);
        vehicle.toIterate(audiList);
        vehicle.toIterate(tataList);
        vehicle.toIterate(hyundaiList);
        vehicle.toIterate(teslaList);
        System.out.println("-------After Sorting--------");
        List<Object> sortedlist = vehicle.getSorted(arrayList);
        vehicle.toIterate(sortedlist);
    }

    private <T> void toIterate(List<T> sortedlist) {
        Iterator<T> iterator = sortedlist.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());

        }
    }

    private List<Object> getSorted(List<Object> carlist) {

        carlist.sort((o1, o2) -> o1.toString().compareTo(o2.toString()));
        return carlist;
    }
}
