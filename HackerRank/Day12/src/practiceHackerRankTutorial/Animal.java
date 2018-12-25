package practiceHackerRankTutorial;

public class Animal {
    // OBJECT = Superclass -> everything inherits from object
    // our class = subclass

    private int age; //
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
    public void eat(){
        System.out.println("An animal is eating");
    }


    public static void main(String[] args) {
        Animal animal = new Animal(5);
        Dog dog = new Dog();
        Cat cat = new Cat(7);

        animal.eat();
        cat.meow();
        animal.eat();
        dog.eat();
        cat.eat();
        dog.run();
        cat.prance();

        System.out.println(dog.getAge());
        System.out.println(cat.getAge());

    }

}
