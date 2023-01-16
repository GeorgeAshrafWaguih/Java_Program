package polymorphism;

public class Dog extends Animal{

    @Override
    public void makeSound(){
        System.out.println("bark");
    }

    public void fetch(){
        System.out.println("fetch is fun");
    }
}
