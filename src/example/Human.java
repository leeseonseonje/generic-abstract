package example;

public class Human extends Animal implements Thinkable {

    @Override
    public String name() {
        return this.getClass().getSimpleName();
    }

    @Override
    public Integer legCount() {
        return 2;
    }

    @Override
    public void think() {
        System.out.println("Think");
    }
}
