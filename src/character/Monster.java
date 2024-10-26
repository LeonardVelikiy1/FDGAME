package character;


import java.util.ArrayList;
import java.util.List;

public class Monster extends Fighter {
    private List<Monster> monsters = new ArrayList<>();

    public List<Monster> getMonsters() {
        return monsters;
    }

    public void setMonsters(List<Monster> monsters) {
        this.monsters = monsters;
    }
}
