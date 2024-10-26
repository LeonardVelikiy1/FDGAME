package room;

import character.Monster;

import java.util.ArrayList;
import java.util.List;

public class Room {
    private int hardness;
    private List<Monster> monsters = new ArrayList<>();

    public int getHardness() {
        return hardness;
    }

    public void setHardness(int hardness) {
        this.hardness = hardness;
    }

    public List<Monster> getMonsters() {
        return monsters;
    }

    public void setMonsters(List<Monster> monsters) {
        this.monsters = monsters;
    }

    @Override
    public String toString() {
        return "Room{" +
                "hardness=" + hardness +
                ", monsters=" + monsters +
                '}';
    }
}
