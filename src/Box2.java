public class Box2<T> {
    private T data;
    public void set(T data){
        this.data=data;
    }
    public T get(){
        return data;
    }

    public static void main(String[] args) {
        Box2<String> b = new Box2<String>();
        b.set("안녕하세요");
        System.out.println(b.get());
    }
}
