public class ShapeTest {
    public static void main(String[] args) {
//        Shape2 s1,s2;
//        s1=new Shape2();
//        s2=new Rectangle2();
//        ((Rectangle2)s2).setWidth(100);
//        s1.x=3;

        Rectangle2 r;
        Shape2 s;
        s= new Rectangle2();
        r=(Rectangle2)s;
        r.width=100;
        r.height=100;

    }
}
