package example;

public abstract class Animal {

    public Animal() {
        System.out.println("animal-----");
    }

    public abstract String name();

    public abstract Integer legCount();

    public void extendsClass() {
        System.out.println(Animal.class.getSimpleName());
    }
}
