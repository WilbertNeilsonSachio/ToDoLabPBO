public class Todo1 {

    public static void main(String[] args){

        Dog Snowy = new Dog("Snowy","Samoyed",4,true);
        Snowy.bark();
        Snowy.feed("snack");
        Snowy.doTrick();
        Snowy.birthday();
        Snowy.displayInfo();

        System.out.println("\n\n");

        Dog Oreo = new Dog("Oreo","Dalmatian",7,false);
        Oreo.bark();
        Oreo.feed("snack");
        Oreo.doTrick();
        Oreo.birthday();
        Oreo.displayInfo();

        System.out.println("\n\n");

        Dog Scooby = new Dog("Scooby","Great Dane",10,true);
        Scooby.bark();
        Scooby.feed("snack");
        Scooby.doTrick();
        Scooby.birthday();
        Scooby.displayInfo();
    }
}