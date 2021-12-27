import example.Animal;
import example.Human;
import example.Tiger;
import example.generic.Admin;
import example.generic.Box;
import example.generic.BoxHandler;
import example.generic.User;

public class Main {
    public static void main(String[] args) {
        Tiger tiger = new Tiger();
        Human human = new Human();

        System.out.println(tiger.name());
        System.out.println(tiger.legCount());
        tiger.extendsClass();
        tiger.think();

        System.out.println();

        System.out.println(human.name());
        System.out.println(human.legCount());
        human.extendsClass();
        human.think();


        System.out.println("===================================");

        Admin admin = new Admin("userA");
        Box<User> box = new Box<>();
        box.setValue(admin);
        BoxHandler boxHandler = new BoxHandler();
        boxHandler.get(box);
        boxHandler.set(box, admin);
    }
}
