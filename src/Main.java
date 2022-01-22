import example.Animal;
import example.Thinkable;
import example.Tiger;
import example.generic.*;

public class Main {
    public static void main(String[] args) {

        SingleTonEnum s1 = SingleTonEnum.IN;
        SingleTonEnum s2 = SingleTonEnum.IN;

        s1.think();
        s2.think();

        s1.setUsername("test");
        System.out.println(s2.getUsername());
//
//        Thinkable test = new TigerBaby("TigerBaby");
//
//
//
//        System.out.println("===================================");
//
//        Admin admin = new Admin("userA");
//        Box<User> box = new Box<>();
//        box.setValue(admin);
//        BoxHandler boxHandler = new BoxHandler();
//        boxHandler.get(box);
//        boxHandler.set(box, admin);
    }
}
