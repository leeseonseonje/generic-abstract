package example.generic;

import example.Thinkable;

public enum SingleTonEnum implements Thinkable {
    INSTANCE, IN;

    private String username;

    @Override
    public void think() {
        System.out.println("think");
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }
}
