package example;

public class Tiger implements Thinkable {

    private final String t;
    public Tiger(String t) {
        this.t = t;
    }

    public String name(String s) {
        return s;
    }

    public Integer legCount(int i) {
        return i;
    }

    @Override
    public void think() {
        System.out.println("No Think");
    }
}
