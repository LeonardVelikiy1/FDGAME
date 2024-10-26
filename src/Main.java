import character.Player;
import character.factory.MonsterFactory;
import room.Room;
import room.RoomFactory;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Player player = new Player();
        RoomFactory roomFactory = new RoomFactory();
        Room room = roomFactory.createRoom();

        Room[] rooms = new Room[5];
        rooms[0] = roomFactory.createRoom();
        rooms[1] = roomFactory.createRoom();
        rooms[2] = roomFactory.createRoom();
        rooms[3] = roomFactory.createRoom();
        rooms[4] = roomFactory.createRoom();

        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите имя игрока:");
        String playerName = scanner.nextLine();
        player.setName(playerName);

        System.out.println("Введите интеллект игрока:");
        String playerIntelligence = scanner.nextLine();
        player.setIntelligence(Integer.parseInt(playerIntelligence));

        System.out.println("Введите здоровье игрока:");
        String playerHP = scanner.nextLine();
        player.setHp(Integer.parseInt(playerHP));

        System.out.println("Введите мощь игрока:");
        String playerPower = scanner.nextLine();
        player.setPower(Integer.parseInt(playerPower));

        System.out.println("Введите защиту игрока:");
        String playerDefence = scanner.nextLine();
        player.setDefence(Integer.parseInt(playerDefence));


        System.out.println(player);
        System.out.println(room);
        System.out.println(Arrays.toString(rooms));
    }
}