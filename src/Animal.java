public class Animal {
    void sound(){
        System.out.println("Animal 크래스의 sound()");
    }
}
class dog extends Animal{
    void sound(){
        System.out.println("왈왈");
    }
}

class cat extends Animal{
    void sound(){
        System.out.println("야옹");
    }
}

class DynamicCallTest{
    public static void main(String[] args) {
        Animal animal = new Animal();
        dog d = new dog();
        cat c = new cat();

        Animal obj;

        obj=animal;
        obj.sound();

        obj = d;
        obj.sound();

        obj = c;
        obj.sound();
    }
}