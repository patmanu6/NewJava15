package C11Classes;

public class DogMethodTester {
    public static void main(String[] args) {
          /*
        We are creating an object of the
        Dog class
         */
        DogClass dog=new DogClass();
         /*
        we are assigning the values to the attributes

         */
        dog.name="layla";
        dog.age=8;
        dog.breed="poodle";
        dog.isTail=true;
        dog.noOfLegs=4;
         /*
        we are calling the methods
         */
        dog.bark();
        dog.eat();
    }
}
