import java.util.Random;
public class Dog {
    String name;
    String breed;
    int age;
    boolean isTrained;

    public Dog(String name, String breed, int age, boolean isTrained) {
        this.name = name;
        this.breed = breed;
        this.age = age;
        this.isTrained = isTrained;
    }

    public void bark() {
        System.out.println(name + ": Woof! Woof???");
    }

    public void doTrick() {
        if (isTrained) {
            Random rand = new Random();
            int trick = rand.nextInt(3);
            switch (trick) {
                case 0:
                    System.out.println(name + " rolls over.");
                    break;
                case 1:
                    System.out.println("Bang!  " + name + " play dead.");
                    break;
                case 2:
                    System.out.println(name + " gives you their paw!");
                    break;
                default:
                    System.out.println(name + " has no trick this time.");
            }
        } else {
            System.out.println(name + " is not trained. They can't perform tricks.");
        }
    }

    public void feed(String food) {
        System.out.println(name + " eats " + food + " you give them.");
    }

    public void birthday() {
        age++;
        System.out.println(name + " is having their birthday! They're now " + age + " years old.");
    }

    public void checkTraining() {
        if (isTrained) {
            System.out.println(name + " is trained.");
        } else {
            System.out.println(name + " is not trained.");
        }
    }

    public void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Breed: " + breed);
        System.out.println("Age: " + age);
        checkTraining();
    }
}