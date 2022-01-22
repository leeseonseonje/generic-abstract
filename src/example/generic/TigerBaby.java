package example.generic;

import example.Thinkable;
import example.Tiger;

public class TigerBaby extends Tiger {

    public TigerBaby(String t) {
        super(t);
    }

    @Override
    public String name(String s) {
        return super.name(s);
    }

    @Override
    public Integer legCount(int i) {
        return super.legCount(i);
    }
}
