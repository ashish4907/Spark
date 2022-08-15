import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class arraylistToLinkedlist {
    public static void main(String[] args) {

        Employee e1 = new Employee();
        e1.setId(101);
        e1.setName("Shreya");
        e1.setPhone(1234567890);
        e1.setEmail("shreyasony@gmail.com");

        Employee e2 = new Employee();
        e2.setId(102);
        e2.setName("Shivani");
        e2.setPhone(1236789023);
        e2.setEmail("shivanigarg@gmail.com");

        Employee e3 = new Employee();
        e3.setId(103);
        e3.setName("Shraddha");
        e3.setPhone(1239087654);
        e3.setEmail("shraddhasingh@gmail.com");

        Employee e4 = new Employee();
        e4.setId(104);
        e4.setName("Nidhi");
        e4.setPhone(1234506789);
        e4.setEmail("nidhipandey@gmail.com");

        Employee e5 = new Employee();
        e5.setId(105);
        e5.setName("Nikita");
        e5.setPhone(1238904567);
        e5.setEmail("nikitayadav@gmail.com");

        ArrayList<Employee> arraylist = new ArrayList<Employee>();
        arraylist.add(e1);
        arraylist.add(e2);
        arraylist.add(e3);
        arraylist.add(e4);
        arraylist.add(e5);
        System.out.println("-----------ArrayList in forward direction----------");
        Iterator<Employee> iterator = arraylist.iterator();
        while (iterator.hasNext()) {
            Employee iter = iterator.next();
            System.out.println(iter.getId() + " " + iter.getName() + " " + iter.getPhone() + " " + iter.getEmail());
        }
        System.out.println("-----------ArrayList in backward direction----------");
        ListIterator<Employee> iteratorlist = arraylist.listIterator(arraylist.size());

        while (iteratorlist.hasPrevious()) {
            Employee iterlist = iteratorlist.previous();
            System.out.println(iterlist.getId() + " " + iterlist.getName() + " " + iterlist.getPhone() + " "
                    + iterlist.getEmail());
        }

        // System.out.println("-----------ArrayList to LinkedList----------");

        LinkedList<Employee> linkedlist = new LinkedList<Employee>();
        linkedlist.addAll(arraylist);
        System.out.println("-----------LinkedList in forward direction----------");

        Iterator<Employee> iterators = linkedlist.iterator();
        while (iterators.hasNext()) {
            Employee iters = iterators.next();
            System.out.println(iters.getId() + " " + iters.getName() + " " + iters.getPhone() + " " + iters.getEmail());
        }
        System.out.println("-----------LinkedList in backward direction----------");
        ListIterator<Employee> iteratorlists = linkedlist.listIterator(linkedlist.size());

        while (iteratorlists.hasPrevious()) {
            Employee iterlists = iteratorlists.previous();
            System.out.println(iterlists.getId() + " " + iterlists.getName() + " " + iterlists.getPhone() + " "
                    + iterlists.getEmail());
        }

    }

}
