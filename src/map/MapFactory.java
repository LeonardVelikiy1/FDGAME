package map;

import character.Difficulty;
import room.Room;
import room.RoomFactory;

import java.util.LinkedList;
import java.util.List;

import static character.Difficulty.*;

public class MapFactory {
    public List<Room> generateMap(Difficulty difficulty){
        RoomFactory roomFactory = new RoomFactory();
        List<Room> map = new LinkedList<>();

        switch (difficulty){

            case EASY -> {
                map.add(roomFactory.createRoom(EASY));
                map.add(roomFactory.createRoom(EASY));
                map.add(roomFactory.createRoom(EASY));
                map.add(roomFactory.createRoom(MEDIUM));
                map.add(roomFactory.createRoom(MEDIUM));
            }
            case MEDIUM -> {
                map.add(roomFactory.createRoom(MEDIUM));
                map.add(roomFactory.createRoom(MEDIUM));
                map.add(roomFactory.createRoom(MEDIUM));
                map.add(roomFactory.createRoom(MEDIUM));
                map.add(roomFactory.createRoom(HARD));
            }
            case HARD -> {
                map.add(roomFactory.createRoom(MEDIUM));
                map.add(roomFactory.createRoom(HARD));
                map.add(roomFactory.createRoom(HARD));
                map.add(roomFactory.createRoom(HARD));
                map.add(roomFactory.createRoom(HARD));
            }
            default -> throw new RuntimeException("Unknown map difficulty = " + difficulty);
        }

        return  map;
    }

}
