public class Box {
    private Object data;
    public void set(Object data){
        this.data=data;
    }
    public Object get(){
        return data;
    }

    public static void main(String[] args) {
        Box b = new Box();
        b.set("안녕하세요");
        String s = (String)b.get();
        b.set(new Integer(10));
        System.out.println(b.get());
        int i = (Integer)b.get();
    }
}
