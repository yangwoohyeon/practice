import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListTest {
    public static void main(String[] args) {
        ArrayList<String> array = new ArrayList<String>();
        array.add("우현");
        array.add("2");
        array.add("10");
        array.add("2");
        array.add(2,"2번");
        array.set(0,"양우현");

        Iterator e = array.iterator();
        while(e.hasNext()){
            System.out.println(e.next());
        }
    }
}
