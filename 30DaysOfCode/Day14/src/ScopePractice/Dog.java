package ScopePractice;

// inherits from animal
public class Dog extends Animal{
    // constructor
    public Dog(){
        // call animal constructor first (super)
        super(15);  // references animal constructor
        System.out.println("A dog has been created");
    }

    public void eat(){
        System.out.println("A dog is eating");
    }

    //or

    // public abstract eat();

    // overwriting main method in animal class
    public void sleep(){
        System.out.println("An Dog is sleeping");
    }


    //method
    public void ruff(){
        System.out.println("The dog says ruff");
    }

    //method
    public void run(){
        System.out.println("A dog is running");
    }

}
