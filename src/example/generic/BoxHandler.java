package example.generic;

public class BoxHandler {


    public void get(Box<? extends User> box) {
        User user = box.getValue();
        System.out.println("get() = " + user.getUsername());
    }

    public void set(Box<? super User> box, User user) {
        box.setValue(user);
        System.out.println("set() = " + user.getUsername());
    }

}
