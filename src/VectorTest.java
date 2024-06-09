import java.util.Vector;

public class VectorTest {
    public static void main(String[] args) {
        Vector vc = new Vector();
        vc.add("양우현");
        vc.add(1);
        vc.add('c');
        for(int i=0; i<vc.size(); i++){
            System.out.println(vc.get(i));
        }

        String s = (String)vc.get(0);
        System.out.println(s);
        int n = (Integer)vc.get(1);
    }
}
