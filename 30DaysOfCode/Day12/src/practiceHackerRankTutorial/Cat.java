package practiceHackerRankTutorial;

// extend class
public class Cat extends Animal{
    // constructor
    public Cat(int age) {
        super(age);
        System.out.println("A cat has been created");
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
