package C11Classes;

public class HumanTester {
    public static void main(String[] args) {
        HumanClass human=new HumanClass();
        human.name="kofi";
        human.age=8;
        human.color="Brown";
        human.weight=34;

        human.eat();
        human.sleep();
        human.walk();

    }
}
