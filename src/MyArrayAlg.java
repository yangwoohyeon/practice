public class MyArrayAlg {
    public static <T> T getLast(T[] a){
        return a[a.length-1];
    }

    public static <T> void swap(T[] a,int i, int j){
        T tmp= a[i];
        a[i]=a[j];
        a[j]=tmp;
    }

    public static void main(String[] args) {
        String[] language={"C","C++","JAVA"};
        String last = MyArrayAlg.getLast(language);
        System.out.println(last);
        swap(language,0,1);
        for(String s : language){
            System.out.println(s);
        }
    }
}
