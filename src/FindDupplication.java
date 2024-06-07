import java.util.HashSet;
import java.util.Iterator;

public class FindDupplication {
    public static void main(String[] args) {
        HashSet<String> hash = new HashSet<String>();
        String[] array = {"1","2","3","2"};

        for(String s : array){
            if(!hash.add(s)){
                System.out.println("중복되는 단어"+ s);
            }
        }
        System.out.println(hash);
    }
}
