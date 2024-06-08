public class GenericMethodTest {
    public static void main(String[] args) {
        Integer[] iArray = {10,20,30,40,50};
        Double[] dArray ={1.1,2.2,3.3,4.4,5.5};
        Character[] cArray={'a','b','c','d','e'};
        printArray(iArray);
        printArray(dArray);
        printArray(cArray);

    }
    public static <T> void printArray(T[] array){
        for(T element : array){
            System.out.printf("%s ",element);
        }
        System.out.println();
    }
}
