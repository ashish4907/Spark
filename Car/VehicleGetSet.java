import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

class VehicleGetSet {
    public static void main(String[] args) {
        BMWGetSet bmw = new BMWGetSet();
        bmw.setModel("i8");
        BMWGetSet bmw2 = new BMWGetSet();
        bmw2.setModel("i3");

        AudiGetSet audi = new AudiGetSet();
        audi.setModel("A4");
        AudiGetSet audi2 = new AudiGetSet();
        audi2.setModel("A6");

        TeslaGetSet tesla = new TeslaGetSet();
        tesla.setModel("Model S");
        TeslaGetSet tesla2 = new TeslaGetSet();
        tesla2.setModel("Model X");

        TataGetSet tata = new TataGetSet();
        tata.setModel("Indica");
        TataGetSet tata2 = new TataGetSet();
        tata2.setModel("Indigo");

        HyundaiGetSet hyundai = new HyundaiGetSet();
        hyundai.setModel("i10");
        HyundaiGetSet hyundai2 = new HyundaiGetSet();
        hyundai2.setModel("i20");

        ArrayList<Object> arrayList = new ArrayList<Object>();
        arrayList.add(bmw);
        arrayList.add(audi);
        arrayList.add(tesla);
        arrayList.add(tata);
        arrayList.add(hyundai);
        arrayList.add(bmw2);
        arrayList.add(audi2);
        arrayList.add(tesla2);
        arrayList.add(tata2);
        arrayList.add(hyundai2);

        ArrayList<BMWGetSet> bmwList = new ArrayList<BMWGetSet>();
        ArrayList<AudiGetSet> audiList = new ArrayList<AudiGetSet>();
        ArrayList<TeslaGetSet> teslaList = new ArrayList<TeslaGetSet>();
        ArrayList<HyundaiGetSet> hyundaiList = new ArrayList<HyundaiGetSet>();
        ArrayList<TataGetSet> tataList = new ArrayList<TataGetSet>();

        for (Object object : arrayList) {
            if (object instanceof BMW) {
                bmwList.add((BMWGetSet) object);
            } else if (object instanceof Audi) {
                audiList.add((AudiGetSet) object);
            } else if (object instanceof Tesla) {
                teslaList.add((TeslaGetSet) object);
            } else if (object instanceof Hyundai) {
                hyundaiList.add((HyundaiGetSet) object);
            } else if (object instanceof Tata) {
                tataList.add((TataGetSet) object);
            }
        }

        VehicleGetSet vehicle = new VehicleGetSet();
        vehicle.toIterate(bmwList);
        vehicle.toIterate(audiList);
        vehicle.toIterate(tataList);
        vehicle.toIterate(hyundaiList);
        vehicle.toIterate(teslaList);
        System.out.println("-------After Sorting--------");
        List<Object> sortedlist = vehicle.getSorted(arrayList);
        vehicle.toIterate(sortedlist);
    }

    private <T> void toIterate(List<T> list) {
        Iterator<T> iterator = list.iterator();
        while (iterator.hasNext()) {
            T t = iterator.next();
            System.out.println(t);

        }
    }



    private List<Object> getSorted(List<Object> carlist) {

        carlist.sort((o1, o2) -> o1.toString().compareTo(o2.toString()));
        return carlist;
    }

}
