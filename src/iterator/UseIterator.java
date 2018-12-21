package iterator;


import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class UseIterator {
    public static void main(String[] args) {

        List<String> stList = new ArrayList<String>();
        stList.add("NY");
        stList.add("PA");
        stList.add("NJ");

        Iterator it = stList.listIterator();
        System.out.println(it.next());

    }
}
