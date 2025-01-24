interface Swimmable{
    void swim();
}
interface Flyable{
    void fly();
}
class Duck implements Swimmable, Flyable {

    @Override
    public void swim() {
        System.out.println("Duck is Swimming");
    }
    @Override
    public void fly() {
        System.out.println("Duck is Flying");
    }
}
public class Main{
    public static void main(String[] args){
        Duck duck = new Duck();
        duck.swim();
        duck.fly();
    }
}