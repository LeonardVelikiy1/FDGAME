package room;

import character.Difficulty;
import character.Monster;
import character.factory.MonsterFactory;

import java.util.ArrayList;
import java.util.List;

import static character.Difficulty.EASY;
import static character.Difficulty.HARD;
import static character.Difficulty.MEDIUM;

public class RoomFactory {
    public Room createRoom(Difficulty difficulty) {
        Room room1 = new Room();
        List<Monster> monsters = new ArrayList<>();
        MonsterFactory monsterFactory = new MonsterFactory();
        switch (difficulty) {
            case EASY:
                monsters.add(monsterFactory.createEasyMonster(EASY));
                break;
            case MEDIUM:
                monsters.add(monsterFactory.createMediumMonster(MEDIUM));
                monsters.add(monsterFactory.createMediumMonster(MEDIUM));
                monsters.add(monsterFactory.createEasyMonster(EASY));
                monsters.add(monsterFactory.createEasyMonster(EASY));
                break;
            case HARD:
                monsters.add(monsterFactory.createHardMonster(HARD));
                monsters.add(monsterFactory.createHardMonster(EASY));
                monsters.add(monsterFactory.createHardMonster(HARD));
                monsters.add(monsterFactory.createHardMonster(EASY));
                break;
            default:throw new RuntimeException("Unknown room difficulty = " + difficulty);
        }

        room1.setMonsters(monsters);
        room1.setDifficulty(difficulty);
    return room1;
    }
}
