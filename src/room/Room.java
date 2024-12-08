package room;

import character.Difficulty;
import character.Monster;
import character.Player;
import util.StringUtil;

import java.util.ArrayList;
import java.util.List;

public class Room {
    private Difficulty difficulty;
    private List<Monster> monsters = new ArrayList<>();

    public Difficulty getDifficulty() {
        return difficulty;
    }

    public void setDifficulty(Difficulty difficulty) {
        this.difficulty = difficulty;
    }

    public List<Monster> getMonsters() {
        return monsters;
    }

    public void setMonsters(List<Monster> monsters) {
        this.monsters = monsters;
    }

    @Override
    public String toString() {
        StringBuilder monsterStringBuilder = new StringBuilder();
        for (Monster monster: monsters)
        {
            monsterStringBuilder
                    .append(monster.getType())
                    .append(" HP ")
                    .append(monster.getHp())
                    .append(" DEF ")
                    .append(monster.getDefence())
                    .append("\n");
        }
        return
                "Room{" +
                "difficulty " + difficulty + "}\n" +
                "monsters \n" + StringUtil.printString(monsters) +
                '}';

    }
}
