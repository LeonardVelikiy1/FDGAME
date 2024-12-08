import character.Difficulty;
import character.Player;
import character.factory.PlayerFactory;
import engine.Engine;
import map.MapFactory;
import room.Room;

import java.util.List;
import java.util.Scanner;

import static character.Difficulty.HARD;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        greeting();
        Player player = createPlayer(scanner);
        List<Room> map = createMap(scanner);

        Engine engine = new Engine(player, map , scanner);
        engine.play();
    }

    private static void greeting(){
        System.out.println("Приветствуем тебя, путник, в нашем подземелье!" +
        "Тебе предстоит пройти лабиринт наших комнат! " +
        "Желаем тебе удачи!");
    }

    private static Player createPlayer(Scanner scanner){
        System.out.println("Введите имя игрока: ");
        String playerName = scanner.nextLine();
        System.out.println("Выбирайте класс 1 - Плут, 2 - Воин, 3 - Маг: ");
        String playerClass = scanner.nextLine();
        return new PlayerFactory().getPlayer(playerName, playerClass);
}

    private static List<Room> createMap(Scanner scanner){
        System.out.println("Выберите уровень сложности 1 - Легко, 2 - Средне, 3 - Сложно: ");
        int difficultyInt = scanner.nextInt();
        Difficulty mapDifficulty = Difficulty.fromInt(difficultyInt);
        
        return new MapFactory().generateMap(mapDifficulty);

    }

}