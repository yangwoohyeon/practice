import java.util.HashSet;
import java.util.Iterator;

public class HashSetTest {
    public static void main(String[] args) {
//        HashSet<String> set = new HashSet<String>();
//        set.add("1");
//        set.add("2");
//        set.add("3");
//        set.add("2");
//
//        Iterator e = set.iterator();
//        while(e.hasNext()){
//            String s = (String)e.next();
//            System.out.println(s);
        String[] s ={"1","2","3","2"};
        HashSet<String> set = new HashSet<String>();
        for(String e : s){
            if(!set.add(e)){
                System.out.println("중복되는 문장 "+e);
            }
        }
        Iterator e = set.iterator();
        while(e.hasNext()){
            System.out.println(e.next());
        }
    }
}
