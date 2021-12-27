package example;

public class Tiger extends Animal implements Thinkable {

    public Tiger() {
        super();
    }

    @Override
    public String name() {
        return this.getClass().getSimpleName();
    }

    @Override
    public Integer legCount() {
        return 4;
    }

    @Override
    public void think() {
        System.out.println("No Think");
    }
}
