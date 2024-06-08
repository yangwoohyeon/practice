public class SimplePair<T> {
    private T first;
    private T second;

    public SimplePair(T first, T second){
        this.first = first;
        this.second = second;
    }
    public T getFirst(){
        return first;
    }
    public T getSecond(){
        return second;
    }
}
