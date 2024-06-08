import java.util.Arrays;
import java.util.List;

public class MyList {
    public static void printList(List<?> list){
        for(Object s:list){
            System.out.print(" s = " + s);
        }
        System.out.println();
    }
    public static void addNumbers(List<? super Integer> list){
        for(int i=0; i<10; i++){
            list.add(i);
        }
    }
    public static void main(String[] args) {
        List<Integer> li = Arrays.asList(1,2,3);
        printList(li);
    }
}
