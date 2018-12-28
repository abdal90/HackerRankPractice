package ScopePractice;

public abstract class Animal {
    // OBJECT = Superclass -> everything inherits from object
    // our class = subclass

    private int age;
    // constructor
    public Animal(int age){
        this.age = age;
        System.out.println("An animal has been created");
    }

    // getter


    public int getAge() {
        return age;
    }

    // method
    public abstract void eat();

    public void sleep(){
        System.out.println("An Animal is sleeping");
    }


    public static void main(String[] args) {

        Dog dog = new Dog();
        Cat cat = new Cat(7);
        dog.eat();
        cat.eat();
        dog.sleep();
        cat.sleep();



        // casting
        Object doge = new Dog();
        Dog realDog = (Dog) doge;
        realDog.ruff();

        Object str = "est";
        String realS = (String) str;
        realS.getBytes();



    }

}
