package room;

import character.Monster;
import character.factory.MonsterFactory;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class RoomFactory {
    public Room createRoom() {
        Room room1 = new Room();
        Random random = new Random();

        int roomHardness = random.nextInt(3) + 1;

        List<Monster> monsters = new ArrayList<>();
        if(roomHardness == 1){
            monsters.add(MonsterFactory.createEasyMonster());
        } else if(roomHardness == 2){
            monsters.add(MonsterFactory.createMediumMonster());
        } else if(roomHardness == 3){
            monsters.add(MonsterFactory.createDifficultMonster());
        } else {
            throw new RuntimeException("Cant create room = " + roomHardness);
        }


        room1.setHardness(roomHardness);
        room1.setMonsters(monsters);
        return room1;
    }
}
