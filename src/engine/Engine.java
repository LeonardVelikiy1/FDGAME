package engine;

import character.Monster;
import character.Player;
import room.Room;

import java.util.*;

public class Engine {
    private Player player;
    private List<Room> map;
    private Scanner scanner;
    public Engine(Player player, List<Room> map, Scanner scanner) {
        this.player = player;
        this.map = map;
    }
public boolean Fight(Player player, Monster monster) {
    Random random = new Random();
        while (player.getHp() >0 && monster.getHp() >0 )
        {
            try {
            System.out.println("Выбирите действие 1(защита) - 2(атака)");
            int action = scanner.nextInt();
            int monsterAction = random.nextInt(2);
            switch (action){
                case (1):
                    System.out.println("DEF ");
                    //допилить защиту и атаку
                    //ебаный бобаный нихуя от геймплея нету ...
                    int ShildDEF = (monster.getPower() - player.getDefence())/2;
                    player.setHp(player.getHp() - ShildDEF);
                case (2):
                    System.out.println("Your attack");
                    monster.setHp(monster.getHp() - player.getPower());
                    System.out.println("HP monsters = " + monster.getHp());
                    if (monster.getHp()>0 && monsterAction == 2)
                    {
                        System.out.println("Monster attack");
                        player.setHp(player.getHp() - monster.getPower());
                        System.out.println("Your HP = " + player.getHp());
                    }else
                {
                    System.out.println("Your Victory");
                    break;
                }

                case (3):
                    System.out.println("выведено действие 3");
                    break;
            }
        }catch (NoSuchElementException exception){
                System.out.println("выведено неизвестное действие");
            }

    }
    return true;
}
    public void play(){
        int currentRoomIndex = 0;
        while (currentRoomIndex < map.size()){
            System.out.println(map.get(currentRoomIndex));
            currentRoomIndex++;
        }
    }
}
