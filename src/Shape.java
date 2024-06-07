public abstract class Shape {
    private int x,y;
    public void move(int x,int y){
        this.x=x;
        this.y=y;
    }
    public abstract void draw(); // 추상클래스 선언만
}
