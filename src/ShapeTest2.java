public class ShapeTest2 {
    private static Shape arrayOfShape[];

    public static void main(String[] args) {
        init();
        drawAll();
    }

    public static void init(){
        arrayOfShape=new Shape[2];
        arrayOfShape[0]=new Rectangle();
        arrayOfShape[1]=new Triangle();
    }

    public static void drawAll(){
        for(int i=0; i<arrayOfShape.length; i++){
            arrayOfShape[i].draw();
        }
    }

}
