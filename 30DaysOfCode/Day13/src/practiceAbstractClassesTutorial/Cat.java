package practiceAbstractClassesTutorial;

// extend class
public class Cat extends Animal{
    // constructor
    public Cat(int age) {
        super(age);
        System.out.println("A cat has been created");
    }

    public void eat(){
        System.out.println("A cat is eating");
    }

    // overwriting main method in animal class
    public void sleep(){
        System.out.println("An Cat is sleeping");
    }

    //method
    public void meow(){
        System.out.println("A cat meows!");
    }

    //method
    public void prance(){
        System.out.println("A cat is prancing");
    }
}
