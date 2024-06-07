public class CarTest2 {
    public static void main(String[] args) {
        Car2 firstCar = new Car2("현대");
        Car2 secondCar = new Car2("현대");

        if(firstCar.equals(secondCar)){
            System.out.println("같은 차종");
        }
        else{
            System.out.println("다른 차종");
        }
    }
}
