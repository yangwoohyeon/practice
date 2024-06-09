import java.util.ArrayList;
import java.util.Iterator;

public class ListTest {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<String>();
        list.add("0");
        list.add("1");
        list.add(1,"0.5");

        Iterator e = list.iterator();
        while(e.hasNext()){
            System.out.println(e.next());
        }
    }
}
